package com.pets.servicos;

public class Tosa implements Servico {
    private static Tosa instance;

    private Tosa() {}

    public static Tosa getInstance() {
        if (instance == null) {
            instance = new Tosa();
        }
        return instance;
    }

    @Override
    public void realizarServico() {
        System.out.println("Realizando tosa...");
    }
}