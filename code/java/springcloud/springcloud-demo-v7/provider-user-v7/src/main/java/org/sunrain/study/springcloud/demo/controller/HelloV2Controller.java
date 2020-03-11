package org.sunrain.study.springcloud.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloV2Controller {

    @RequestMapping("/v2/hello")
    public String hello(String name) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello:" + name);
        return "hello " + name;
    }
}
