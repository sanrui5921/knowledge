package org.sunrain.study.spring.demo.demo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.sunrain.study.spring.demo.demo02.config.EnableMyOwnBeanDefinitions;
import org.sunrain.study.spring.demo.demo02.config.LogServiceImportSelector;
import org.sunrain.study.spring.demo.demo02.config.OrderServiceBeanDefinitionRegistrar;
import org.sunrain.study.spring.demo.demo02.config.UserBeansConfig;
import org.sunrain.study.spring.demo.demo02.service.SettingService;

/**
 * 演示自定义注解@EnableMyOwnBeanDefinitions的使用和效果
 */

//@EnableMyOwnBeanDefinitions(trackOrderChange = true)
@EnableMyOwnBeanDefinitions(trackOrderChange = false)
@Import({
        UserBeansConfig.class,
        LogServiceImportSelector.class,
        OrderServiceBeanDefinitionRegistrar.class,
        SettingService.class})
@SpringBootApplication
@ComponentScan(basePackages = "org.sunrain.study.spring.demo.demo02")
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        dumpBeansToConsole(applicationContext);
    }

    /**
     * 往控制台上输出容器中注册的各个bean的名称
     *
     * @param applicationContext
     */
    private static void dumpBeansToConsole(ConfigurableApplicationContext applicationContext) {
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            Object bean = applicationContext.getBean(name);
            if (bean.getClass().getName().contains("org.sunrain.study")) {
                System.out.printf("%s[%s]\n", name, bean.getClass().getName());
            }
        }
    }
}

/**
 * userBeansConfig[org.sunrain.study.spring.demo.demo02.config.UserBeansConfig$$EnhancerBySpringCGLIB$$26375ae0]
 * adminService[org.sunrain.study.spring.demo.demo02.service.AdminService]
 * customerService[org.sunrain.study.spring.demo.demo02.service.CustomerService]
 * org.sunrain.study.spring.demo.demo02.service.LogService[org.sunrain.study.spring.demo.demo02.service.LogService]
 * org.sunrain.study.spring.demo.demo02.service.SettingService[org.sunrain.study.spring.demo.demo02.service.SettingService]
 * orderService[org.sunrain.study.spring.demo.demo02.service.OrderService]
 * orderChangeRecordService[org.sunrain.study.spring.demo.demo02.service.OrderChangeRecordService]
 */