package org.sunrain.study.springcloud.springcloud_eureka_client_demo_01;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfiguration {
    //    @Bean
//    public RestTemplate getRestTemplate() {
//        return new RestTemplate();
//    }
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}