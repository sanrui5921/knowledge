package org.sunrain.study.springcloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudEurekaServiceDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServiceDemo01Application.class, args);
    }
}
