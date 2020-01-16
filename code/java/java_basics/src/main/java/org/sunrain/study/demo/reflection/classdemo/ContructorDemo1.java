package org.sunrain.study.demo.reflection.classdemo;

import java.lang.reflect.Constructor;

public class ContructorDemo1 {

    public static void main(String[] args) throws Exception {
        Class c = Person.class;
        Person p = (Person) c.newInstance();

        Constructor cons1 = c.getConstructor(int.class);
        Person p1 = (Person) cons1.newInstance(30);

        Constructor cons2 = c.getDeclaredConstructor(String.class);
        cons2.setAccessible(true);
        Person p2 = (Person) cons2.newInstance("不是秃头的小李程序员");

        Constructor cons3 = c.getConstructor(String.class, int.class);
        Person p3 = (Person) cons3.newInstance("不是秃头的小李程序员-35", 35);
    }
}