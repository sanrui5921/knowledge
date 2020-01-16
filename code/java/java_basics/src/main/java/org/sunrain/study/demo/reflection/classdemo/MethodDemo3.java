package org.sunrain.study.demo.reflection.classdemo;

import java.lang.reflect.Method;

public class MethodDemo3 {
    public static void main(String[] args) throws Exception {
        String s = "不是秃头的小李程序员";
        Method method = String.class.getMethod("substring", int.class);
        Method method2 = String.class.getMethod("substring", int.class, int.class);
        String result = (String) method.invoke(s, 7);
        String result2 = (String) method2.invoke(s, 1, 9);
        System.out.println(result);
        System.out.println(result2);
    }
}
