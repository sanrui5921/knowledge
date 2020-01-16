package org.sunrain.study.springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello1Controller {
    // 注入对象
    @Autowired
    private Environment env;

    @GetMapping("/hello1")
    public String hello() {
        // 读取配置
        String port = env.getProperty("server.port");
        return port;
    }
}