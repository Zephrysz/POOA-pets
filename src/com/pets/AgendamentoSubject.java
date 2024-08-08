package com.pets;

import java.util.ArrayList;
import java.util.List;

public abstract class AgendamentoSubject {
    protected List<ClienteObserver> observers = new ArrayList<>();

    public void addObserver(ClienteObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ClienteObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (ClienteObserver observer : observers) {
            observer.update();
        }
    }
}