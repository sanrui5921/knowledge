package org.sunrain.study.springcloud.demo.controller;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.sunrain.study.springcloud.demo.entity.Person;
import org.sunrain.study.springcloud.demo.service.HelloFeignService;

@RestController
public class IndexController {

    @Autowired
    private HelloFeignService feignService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(String name) {
        return feignService.hello(name);
    }

    @RequestMapping(value = "/createPerson", method = RequestMethod.GET)
    public int createPerson() {
        Person p = new Person();
        p.setAge(RandomUtils.nextInt(100));
        p.setName("zhuyu");
        Person person = feignService.createPerson(p);
        System.out.println("consumer Person ：" + person.toString());
        return person.getId();
    }
}