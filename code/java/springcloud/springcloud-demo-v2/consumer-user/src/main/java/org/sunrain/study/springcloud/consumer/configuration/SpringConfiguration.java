package org.sunrain.study.springcloud.consumer.configuration;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SpringConfiguration {

//    @Bean
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
}
