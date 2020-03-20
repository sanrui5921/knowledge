package org.sunrain.study.springcloud.config.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConfigClientV9Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientV9Application.class, args);
    }
}
