package org.sunrain.study.design_pattern.observer.newspaper.sunrain;

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("张三");
        Reader reader2 = new Reader("李四");
        Reader reader3 = new Reader("王五");
        Newspaper newspaper = new Newspaper();
        newspaper.attach(reader1);
        newspaper.attach(reader2);
        newspaper.attach(reader3);
        newspaper.setContent("测试一下");
    }
}
