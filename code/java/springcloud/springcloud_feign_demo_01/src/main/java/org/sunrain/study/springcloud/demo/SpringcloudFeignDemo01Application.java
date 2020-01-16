package org.sunrain.study.springcloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudFeignDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFeignDemo01Application.class, args);
    }

}
