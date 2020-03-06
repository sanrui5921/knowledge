package org.sunrain.study.design_pattern.simplefactory;

public class VideoFactory {
    public Video produce(String name) {
        if (name.equals("java")) {
            return new JavaVideo();
        } else if (name.equals("python")) {
            return new PythonVideo();
        } else {
            return null;
        }
    }
}
