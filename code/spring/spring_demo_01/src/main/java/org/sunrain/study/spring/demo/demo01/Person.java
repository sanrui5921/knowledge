package org.sunrain.study.spring.demo.demo01;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Person implements DisposableBean, InitializingBean, BeanFactoryAware, BeanNameAware {

    private String name;

    private int age;

    Person() {
        System.out.println("Constructor of person bean is invoked!");
        age = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory method of person is invoked");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName method of person is invoked");
    }

    public void init() {
        System.out.println("custom init method of person bean is invoked!");
        age = 1000;
    }

    //Bean initialization code  equals to
    @Override
    public void afterPropertiesSet() throws Exception {
        age = 20;
        System.out.println("afterPropertiesSet method of person bean is invoked!");
    }

    //Bean destruction code
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean Destroy method of person bean is invoked!");
    }

    public void destroyMethod() {
        System.out.println("custom Destroy method of person bean is invoked!");
    }
}