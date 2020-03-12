package org.sunrain.study.springcloud.config.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerV9Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerV9Application.class, args);
    }

}
