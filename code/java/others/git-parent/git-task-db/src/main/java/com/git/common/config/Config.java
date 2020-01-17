package com.git.common.config;

import lombok.Data;

/**
 * Created by wx:LittleB726  on 2019/12/05.
 */
@Data
public class Config {

    /**
     * 枚举 TypeEum  插入、修改
     */
    private String type;
    /**
     * 模块名称、描述
     */
    private String moduleName;
    /**
     * 暂时不用
     */
    private String updateSql;
    /**
     * 指定该模块定时器间隔时间
     */
    private String cron;
    /**
     * 对应模块的实体类，必须全路径
     */
    private String clazz;

}
