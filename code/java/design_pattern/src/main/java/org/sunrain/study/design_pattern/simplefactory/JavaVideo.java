package org.sunrain.study.design_pattern.simplefactory;

public class JavaVideo implements Video {
    @Override
    public void produce() {
        System.out.println("录制Java视频");
    }
}
