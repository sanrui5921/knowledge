package org.sunrain.study.demo.reflection.classdemo;

import java.lang.reflect.Method;

public class MethodDemo4 {
    public static void main(String[] args) throws Exception {
        // 获取Integer.parseInt(Stirng)方法，参数是String
        Method method = Integer.class.getMethod("parseInt", String.class);
        // 调用静态方法获取结果
        // Integer result = (Integer)method.invoke("", "12345");
        Integer result = (Integer) method.invoke(null, "12345");
        System.out.println(result);
    }
}
