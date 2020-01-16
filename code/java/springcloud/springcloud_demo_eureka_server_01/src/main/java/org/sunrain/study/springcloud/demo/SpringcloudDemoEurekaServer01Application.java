package org.sunrain.study.springcloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudDemoEurekaServer01Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudDemoEurekaServer01Application.class, args);
    }
}
