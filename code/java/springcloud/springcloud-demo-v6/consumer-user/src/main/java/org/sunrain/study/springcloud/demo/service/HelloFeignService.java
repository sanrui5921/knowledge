package org.sunrain.study.springcloud.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.sunrain.study.springcloud.demo.configuration.FeignLogConfig;
import org.sunrain.study.springcloud.demo.entity.Person;

//name为服务提供者向注册中心注册的实例名
@FeignClient(name = "provider-user", configuration= FeignLogConfig.class)
public interface HelloFeignService {

    //地址为服务提供者对外暴露的地址
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/createPerson" , method = RequestMethod.POST)
    public Person createPerson(@RequestBody Person person);
}