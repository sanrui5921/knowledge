package org.sunrain.study.springcloud.innerservicedemov8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class InnerServiceDemoV8Application {
    public static void main(String[] args) {
        SpringApplication.run(InnerServiceDemoV8Application.class, args);
    }

}
