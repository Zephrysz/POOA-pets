package com.pets.states;


public class Adiada implements Situacao {
    private static Adiada instance = new Adiada();

    private Adiada() {}

    public static Adiada getInstance() {
        return instance;
    }

}