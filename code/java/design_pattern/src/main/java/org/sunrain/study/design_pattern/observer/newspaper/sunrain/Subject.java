package org.sunrain.study.design_pattern.observer.newspaper.sunrain;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    List<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void attach(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void detach(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }

    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
