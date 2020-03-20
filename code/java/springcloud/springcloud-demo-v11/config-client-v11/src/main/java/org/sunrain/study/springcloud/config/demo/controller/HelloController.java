package org.sunrain.study.springcloud.config.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//更新时curl --location --request POST 'http://127.0.0.1:8081/actuator/refresh'

@RefreshScope
@RestController
public class HelloController {

    @Value("${springcloud.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
}