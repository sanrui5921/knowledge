package org.sunrain.study.design_pattern.observer.newspaper.sunrain;

public class Reader implements Observer {

    public String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject newspaper) {
        System.out.println(this.name + "读报纸:" + ((Newspaper) newspaper).content);
    }
}
