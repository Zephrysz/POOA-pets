package com.pets.states;


public class Concluido implements Situacao {
    private static Concluido instance = new Concluido();

    private Concluido() {}

    public static Concluido getInstance() {
        return instance;
    }    

}
