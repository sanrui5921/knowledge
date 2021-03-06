package org.sunrain.study.springcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//https://www.cnblogs.com/xishuai/p/spring-cloud-consul-sample.html

@EnableDiscoveryClient
@SpringBootApplication
public class ProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication.class);
    }
}
