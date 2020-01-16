package org.sunrain.study.springcloud.springcloud_eureka_server_cluster_02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEurekaServerCluster02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServerCluster02Application.class, args);
    }
}
