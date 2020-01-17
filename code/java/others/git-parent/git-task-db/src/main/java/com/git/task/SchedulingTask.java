package com.git.task;

import com.git.common.config.Config;
import com.git.common.config.RtmConfigProperties;
import com.git.common.eum.TypeEum;
import com.git.common.redis.RedisUtils;
import com.git.common.utils.RtmUtils;
import com.git.task.service.RtmService;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.stereotype.Component;

/**
 * Created by wx:LittleB726  on 2019/12/05.
 */

@Slf4j
@Component
@EnableScheduling
public class SchedulingTask implements SchedulingConfigurer {

    @Autowired
    private RtmConfigProperties rtmConfigProperties;
    @Autowired
    private RedisUtils redisUtils;
    @Autowired
    private RtmService rtmService;

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.setScheduler(taskExecutor());
        rtmConfigProperties.getConfig().forEach(config -> {
            taskRegistrar.addFixedDelayTask(() -> {
                        rtmBus(config);
                    },
                    Long.parseLong(RtmUtils.isNotBlank(config.getCron()) ? config.getCron()
                            : rtmConfigProperties.getCron())
            );
        });
    }

    @Bean(destroyMethod = "shutdown")
    public Executor taskExecutor() {
        return new ScheduledThreadPoolExecutor(10, new ThreadFactory() {
            private AtomicInteger max = new AtomicInteger(0);

            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r, "task-db-pool-" + max.incrementAndGet());
            }
        });
    }

    private void rtmBus(Config config) {
        StringBuffer logStr = new StringBuffer();
        try {
            TypeEum typeEum = TypeEum.getByCode(config.getType());
            String tableName = RtmUtils.getTableName(RtmUtils.getClass(config.getClazz()));
            if (redisUtils.acquireLock(typeEum.getLockKeyPrefix() + tableName,
                    rtmConfigProperties.getLockTime())) {
                logStr.append("\r\n");
                logStr.append(
                        typeEum.getDesc() + "[" + config.getModuleName() + "]开始..." + "获取到锁key="
                                + typeEum.getLockKeyPrefix() + tableName + " 开始处理redis中数据key="
                                + typeEum.getListKeyPrefix() + tableName);
                logStr = rtmService
                        .rtmService(logStr, typeEum.getListKeyPrefix() + tableName, config);
                redisUtils.releaseLock(typeEum.getLockKeyPrefix() + tableName);
                logStr.append(
                        typeEum.getDesc() + "[" + config.getModuleName() + "]结束..." + "释放掉锁key="
                                + typeEum.getLockKeyPrefix() + tableName + " 结束处理redis中数据key="
                                + typeEum.getListKeyPrefix() + tableName);
            }
        } catch (Exception e) {
            log.error("rtmBus error", e.fillInStackTrace());
        }
        log.debug(logStr.toString());
    }

}
