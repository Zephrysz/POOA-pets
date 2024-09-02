package com.pets.servicos;

public class Banho implements Servico {

    private static Banho instance;


    private Banho() {}

    public static Banho getInstance() {
        if (instance == null) {
            instance = new Banho();
        }
        return instance;
    }

    @Override
    public void realizarServico() {
        System.out.println("Realizando banho...");
    }
}