package org.sunrain.study.design_pattern.observer.newspaper.java;

import java.util.Observable;
import java.util.Observer;

public class Reader implements Observer {

    String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.name + "读报纸:" + arg);
    }
}
