package com.pets;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject {
    protected List<AbstractObserver> observers = new ArrayList<>();

    public void addObserver(AbstractObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(AbstractObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (AbstractObserver observer : observers) {
            observer.update();
        }
    }
}