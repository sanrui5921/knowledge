package org.sunrain.study.demo.reflection.classdemo;

import java.lang.reflect.Method;

public class MethodDemo2 {
    public static void main(String[] args) throws Exception {
        Class c = Student.class;
        Method method = c.getDeclaredMethod("setGrade", int.class);
        System.out.println("name : " + method.getName());
        System.out.println("returnType : " + method.getReturnType());
        Class<?>[] parameterTypes = method.getParameterTypes();
        System.out.println("paramaterTypes的长度 : " + parameterTypes.length);
        for (Class parameterType : parameterTypes) {
            System.out.println("paramaterTypes : " + parameterType);
        }
    }
}
