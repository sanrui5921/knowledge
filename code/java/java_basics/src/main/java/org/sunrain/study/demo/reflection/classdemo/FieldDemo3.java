package org.sunrain.study.demo.reflection.classdemo;

import java.lang.reflect.Field;

public class FieldDemo3 {

    private final String name = "不是秃头的小李程序员";

    public static void main(String[] args) throws Exception {
        Object object = new FieldDemo3();
        Class c = FieldDemo3.class;
        Field field = c.getDeclaredField("name");
        Object value = field.get(object);
        System.out.println(value);
    }
}
