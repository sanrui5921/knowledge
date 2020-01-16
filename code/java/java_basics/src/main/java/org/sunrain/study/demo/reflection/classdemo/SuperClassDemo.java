package org.sunrain.study.demo.reflection.classdemo;

public class SuperClassDemo {

    public static void main(String[] args) {
        Class<?> superclass = Integer.class.getSuperclass();
        System.out.println(superclass);
        System.out.println(superclass.getSuperclass());
        System.out.println(superclass.getSuperclass().getSuperclass());
        System.out.println(superclass.getSuperclass().getSuperclass().getSuperclass());
    }
}
