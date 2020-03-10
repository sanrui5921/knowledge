package org.sunrain.study.springcloud.demo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sunrain.study.springcloud.demo.entity.Person;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(String name) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello:" + name);
        return "hello " + name;
    }

    @RequestMapping("/createPerson")
    public Person create(@RequestBody Person person) {
        Person p = new Person();
        p.setAge(person.getAge());
        p.setName(person.getName());
        p.setId(RandomUtils.nextInt(1000));
        System.out.println("provider Person： " + p.toString());
        return p;
    }
}