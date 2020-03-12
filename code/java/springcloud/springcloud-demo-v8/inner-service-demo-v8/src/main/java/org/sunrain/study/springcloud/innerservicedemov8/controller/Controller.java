package org.sunrain.study.springcloud.innerservicedemov8.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${server.port}")
    public String serverPort;

    @RequestMapping(value = "/")
    public String index() {
        return "Index from " + serverPort;
    }

    @RequestMapping(value = "/hello")
    public String hello() {
        return "Hello from " + serverPort;
    }
}
