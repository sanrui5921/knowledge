package org.sunrain.study.spring.demo.demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("test1.xml");
        ((ClassPathXmlApplicationContext) context).destroy();
    }
}