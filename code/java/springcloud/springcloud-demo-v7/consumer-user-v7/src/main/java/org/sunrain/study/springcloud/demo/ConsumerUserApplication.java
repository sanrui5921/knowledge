package org.sunrain.study.springcloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerUserApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ConsumerUserApplication.class, args);
        String[] names = applicationContext.getBeanDefinitionNames();
        System.out.println("========================================");
        for (String name : names) {
            System.out.println("name=" + name + ", type=" + applicationContext.getBean(name));
        }
        System.out.println("========================================");
    }
}
