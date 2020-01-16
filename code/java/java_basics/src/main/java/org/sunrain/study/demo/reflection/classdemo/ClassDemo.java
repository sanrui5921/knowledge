package org.sunrain.study.demo.reflection.classdemo;

public class ClassDemo {
    public static void main(String[] args) {
        // 方式1：Object.getClass()
        // Object 类的 getClass() 方法返回一个 Class 类实例
        String name = "不是秃头的小李程序员";
        Class<?> classType = name.getClass();
        System.out.println("Object.getClass() classType: " + classType);

        // 方式2：T.Class
        // T 是任意 Java 类型
        Class<?> classType2 = String.class;
        System.out.println("T.Class classType: " + classType2);

        // 方式3：Class.forName
        try {
            Class<?> classType3 = Class.forName("java.lang.String");
            System.out.println("Class.forName classType: " + classType2);
            // 根据 className 没有找到类，会抛出 ClassNotFoundException 异常
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
