package org.sunrain.study.demo.reflection.classdemo;

public class MethodDemo1 {
    public static void main(String[] args) throws Exception {
        Class c = Student.class;
        // 获取public方法getScore，参数为String;
        System.out.println(c.getMethod("setScore", int.class));
        // 获取继承的public方法getName，无参数;
        System.out.println(c.getMethod("getName"));
        // 获取private方法getGrade，参数为int;
        System.out.println(c.getDeclaredMethod("setGrade", int.class));
    }
}