package com.git.task.service;

import com.alibaba.druid.pool.DruidDataSource;
import com.git.common.config.Config;
import com.git.common.config.RtmConfigProperties;
import com.git.common.eum.TypeEum;
import com.git.common.redis.RedisUtils;
import com.git.common.utils.RtmException;
import com.git.common.utils.RtmUtils;
import com.git.task.dao.RtmDao;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Created by wx:LittleB726  on 2019/12/05.
 */
@Slf4j
@Service
public class RtmService extends RtmDao {

    /**
     * 配置项
     */
    @Autowired
    private RtmConfigProperties rtmConfigProperties;

    /**
     * redis操作类
     */
    @Autowired
    private RedisUtils redisUtils;

    /**
     * 数据源
     * @param dataSource
     */
    @Lazy(true)
    @Autowired
    public void setDataSource(DruidDataSource dataSource) {
        super.dataSource = dataSource;
    }
    public StringBuffer rtmService(StringBuffer logStr, String wrListKey, Config config) {
        long result = 0;
        try {
            long begin = System.currentTimeMillis();
            /**
             * 查询Redis中键值对应的总条数
             * 如果监控的键值中有数据则继续执行，否则释放锁，完成一轮任务
             * 当内存中的总条数大于配置文件中配置的最大条数时，取配置最大条数，剩下数据等下一轮任务接着取
             */
            long currentLen = redisUtils.llen(wrListKey);
            if (currentLen > 0) {
                List<String> currentList = null;
                if (currentLen > rtmConfigProperties.getMaxLimit()) {
                    currentList = redisUtils.lrange(wrListKey, 0L, rtmConfigProperties.getMaxLimit() - 1L);
                } else {
                    currentList = redisUtils.lrange(wrListKey, 0L, currentLen - 1);
                }
                /**
                 * 获取表名
                 */
                String tableName = RtmUtils.getTableName(RtmUtils.getClass(config.getClazz()));
                /**
                 * 判断操作类型
                 */
                TypeEum typeEum = TypeEum.getByCode(config.getType());
                Class clazz = RtmUtils.getClass(config.getClazz());
                /**
                 * 返回实体对应表中的列与实体属性，数据组装前的准备
                 */
                Map<String, List<String>> map = RtmUtils.getTableColumn(typeEum, clazz);
                /**
                 * 根据操作类型执行入库操作
                 */
                switch (typeEum) {
                    case INSERT:
                        result = insert(tableName, clazz, currentList,
                                map.get(RtmUtils.KEY_LIST_COLUMN),
                                map.get(RtmUtils.KEY_LIST_ATTRIBUTE));
                        break;
                    case UPDATE:
                        result = update(RtmUtils.getTableNameUpdateSql(clazz), clazz, currentList,
                                map.get(RtmUtils.KEY_LIST_ATTRIBUTE));
                        break;
                }
            }
            logStr.append("\r\n");
            /**
             * 入库操作成功后，删除Redis中已经存入Mysql库中的数据
             */
            if (result > 0) {
                redisUtils.ltrim(wrListKey, result, -1L);
                long end = System.currentTimeMillis();
                log.info("[" + config.getModuleName() + "|" + wrListKey + "]已执行:" + result + " 未执行:"
                        + (currentLen - result) + "  执行时间:" + (end - begin));
                logStr.append("[" + config.getModuleName() + "] key=" + wrListKey);
                logStr.append("\r\n");
                logStr.append("已执行=" + result);
                logStr.append("\r\n");
                logStr.append("未执行=" + (currentLen - result));
                logStr.append("\r\n");
                logStr.append("执行时间=" + (end - begin));
                logStr.append("\r\n");
            } else {
                logStr.append("[" + config.getModuleName() + "] redis中暂无数据需要处理key=" + wrListKey);
            }
            logStr.append("\r\n");
        } catch (RtmException e) {
            throw new RtmException("service error", e);
        }
        return logStr;
    }
}
