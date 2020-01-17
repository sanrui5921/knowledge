package com.git.common.config;

import java.util.List;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wx:LittleB726  on 2019/12/05.
 */
@Configuration
@Data
@ConfigurationProperties(prefix = "git.taskdb")
public class RtmConfigProperties {

    /**
     * 默认定时器间隔时间
     */
    private String cron;
    /**
     * 一次最多从redis中取多少条数据，可根据实际性能进行配置
     */
    private long maxLimit;
    /**
     * 当我们创建锁后，程序发生异常，未能及时解锁，超过此时间可自动解锁
     */
    private long lockTime;

    private List<Config> config;
}

