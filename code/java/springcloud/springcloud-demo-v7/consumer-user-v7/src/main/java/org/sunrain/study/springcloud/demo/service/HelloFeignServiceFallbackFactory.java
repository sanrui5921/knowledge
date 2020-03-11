package org.sunrain.study.springcloud.demo.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.sunrain.study.springcloud.demo.entity.Person;

@Component
public class HelloFeignServiceFallbackFactory implements FallbackFactory<HelloFeignService> {

    @Override
    public HelloFeignService create(Throwable throwable) {
        return new HelloFeignService() {
            @Override
            public String hello(String name) {
                System.out.println("hello降级了。。。。");
                return new String("hello降级了。。。。");
            }

            @Override
            public Person createPerson(Person person) {
                System.out.println("createPerson降级了。。。。");
                return null;
            }
        };
    }
}