package org.sunrain.study.demo.reflection.classdemo;

public class Person {

    private String name;

    private int age;

    public Person() {
        System.out.println("Person");
    }

    public Person(int age) {
        this.age = age;
        System.out.println("Person age:" + age);
    }

    private Person(String name) {
        this.name = name;
        System.out.println("Person name:" + name);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person toString:" + toString());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

