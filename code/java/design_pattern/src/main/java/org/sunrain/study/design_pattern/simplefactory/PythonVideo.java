package org.sunrain.study.design_pattern.simplefactory;

public class PythonVideo implements Video {
    @Override
    public void produce() {
        System.out.println("录制Python视频");
    }
}
