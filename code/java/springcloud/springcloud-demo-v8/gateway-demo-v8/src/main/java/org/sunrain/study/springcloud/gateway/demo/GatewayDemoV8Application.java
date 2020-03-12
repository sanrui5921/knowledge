package org.sunrain.study.springcloud.gateway.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
public class GatewayDemoV8Application {

    public static void main(String[] args) {
        SpringApplication.run(GatewayDemoV8Application.class, args);
    }

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("csdn", r -> r.path("/csdn").uri("https://blog.csdn.net"))
//                .route("8001", r -> r.path("/8001/*").uri("http://127.0.0.1:8001/"))
//                .route("8002", r -> r.path("/8002/*").uri("http://127.0.0.1:8002/"))
//                .build();
//    }
}
