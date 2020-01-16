package org.sunrain.study.demo.reflection.classdemo;

import java.lang.reflect.Field;

public class FieldDemo4 {

    public static void main(String[] args) throws Exception {
        Object animal = new Animal("不是秃头的小李程序员 Animal111");
        Class c = Animal.class;
        Field field = c.getDeclaredField("name");
        Object value = field.get(animal);
        System.out.println(value);
//        Animal animal = new Animal();
//        animal.testFiled();
    }
}

class Animal {

    private String name;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public void testFiled() throws Exception {
        Object animal = new Animal("不是秃头的小李程序员 Animal222");
        Class c = Animal.class;
        Field field = c.getDeclaredField("name");
        Object value = field.get(animal);
        System.out.println(value);
    }
}