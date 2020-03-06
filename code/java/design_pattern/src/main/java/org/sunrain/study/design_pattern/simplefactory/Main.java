package org.sunrain.study.design_pattern.simplefactory;

public class Main {
    public static void main(String[] args) {
        VideoFactory factory = new VideoFactory();
        System.out.println("*********************");
        factory.produce("java").produce();
        System.out.println("*********************");
        factory.produce("python").produce();
    }
}
