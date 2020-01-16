package org.sunrain.study.demo.reflection.classdemo;

public class ReflectionInterfaceTest {
    public static void main(String[] args) {
        Class s = Integer.class;
        Class[] interfaces = s.getInterfaces();
        for (Class c : interfaces) {
            System.out.println(c);
        }
    }
}