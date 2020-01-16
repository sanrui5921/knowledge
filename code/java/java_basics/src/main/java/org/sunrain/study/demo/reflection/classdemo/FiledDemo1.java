package org.sunrain.study.demo.reflection.classdemo;

public class FiledDemo1 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class stdClass = Student.class;
        // 获取 public 字段 "score"
        System.out.println(stdClass.getField("score"));
        // 获取继续的 public 字段 "name"
        System.out.println(stdClass.getField("name"));
        // 获取 private 字段 "grade"
        System.out.println(stdClass.getDeclaredField("grade"));
    }
}
