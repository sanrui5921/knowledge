package org.sunrain.study.design_pattern.observer.newspaper.sunrain;

public class Newspaper extends Subject {

    public String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyObservers();
    }
}
