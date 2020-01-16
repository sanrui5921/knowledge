package org.sunrain.study.springboot.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2Controller {
    // 注入配置
    @Value("${server.port}")
    private String port;

    @GetMapping("/hello2")
    public String hello() {
        return port;
    }
}