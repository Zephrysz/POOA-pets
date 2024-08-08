package com.pets.states;


public class Cancelado implements Situacao {
    private static Cancelado instance = new Cancelado();

    private Cancelado() {}

    public static Cancelado getInstance() {
        return instance;
    }


}
