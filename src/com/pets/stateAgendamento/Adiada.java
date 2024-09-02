package com.pets.states;

import com.pets.*;

public class Adiada implements Situacao {
    private static Adiada instance = new Adiada();

    private Adiada() {}

    public static Adiada getInstance() {
        return instance;
    }

    public void verificarMudancaoSituacao(Agendamento agendamento, int dataAtual) {
        System.out.println("A situacao eh adiada");
    }
}