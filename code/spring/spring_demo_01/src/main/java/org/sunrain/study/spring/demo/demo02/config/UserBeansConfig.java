package org.sunrain.study.spring.demo.demo02.config;

import org.springframework.context.annotation.Bean;
import org.sunrain.study.spring.demo.demo02.service.AdminService;
import org.sunrain.study.spring.demo.demo02.service.CustomerService;

/**
 * 一个 Spring 配置类， 注解方式注册bean的典型用法 ：
 *
 * @Configuration 定义配置类 + @Bean 注解配置类方法注册bean
 */
//@Configuration
public class UserBeansConfig {
    /**
     * 注册管理员管理服务组件bean
     * AdminService 是一个普通Java类
     *
     * @return
     */
    @Bean
    public AdminService adminService() {
        return new AdminService();
    }

    /**
     * 注册客户管理服务组件bean
     * CustomerService 是一个普通Java类
     *
     * @return
     */
    @Bean
    public CustomerService customerService() {
        return new CustomerService();
    }
}
//版权声明：本文为CSDN博主「安迪源文」的原创文章，遵循 CC4.0BY-SA 版权协议，转载请附上原文出处链接及本声明。
//原文链接：https://blog.csdn.net/andy_zhang2007/article/details/83957588