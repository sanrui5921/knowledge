package org.sunrain.study.demo.reflection.classdemo;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldDemo2 {

    private final String name = "不是秃头的小李程序员";

    public static void main(String[] args) throws NoSuchFieldException {
        Class c = FieldDemo2.class;
        Field field = c.getDeclaredField("name");
        int mod = field.getModifiers();
        System.out.println("name: " + field.getName());
        System.out.println("type: " + field.getType());
        System.out.println("mod: " + mod);
        System.out.println("final: " + Modifier.isFinal(mod));
        System.out.println("public: " + Modifier.isPublic(mod));
        System.out.println("protected: " + Modifier.isProtected(mod));
        System.out.println("private: " + Modifier.isPrivate(mod));
        System.out.println("static: " + Modifier.isStatic(mod));
    }
}