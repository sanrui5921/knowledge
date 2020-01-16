package org.sunrain.study.demo.reflection.classdemo;

import java.lang.reflect.Field;

public class FieldDemo5 {

    public static void main(String[] args) throws Exception {
        Teacher teacher = new Teacher("不是秃头的小李程序员");
        Class c = teacher.getClass();
        Field field = c.getDeclaredField("name");
        field.setAccessible(true);
        field.set(teacher, "小李不秃头");
        System.out.println(field.get(teacher));
    }
}

class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}