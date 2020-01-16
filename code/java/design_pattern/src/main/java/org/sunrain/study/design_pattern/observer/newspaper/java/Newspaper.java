package org.sunrain.study.design_pattern.observer.newspaper.java;

import java.util.Observable;

public class Newspaper extends Observable {

    String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.setChanged();
        this.notifyObservers(content);
    }
}
