package org.sunrain.study.springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello3Controller {
    @Autowired
    private MyConfig myConfig;

    @GetMapping("/hello3")
    public String hello() {
        return myConfig.getName();
    }
}