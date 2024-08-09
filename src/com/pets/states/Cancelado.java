package com.pets.states;

import com.pets.*;

public class Cancelado implements Situacao {
    private static Cancelado instance = new Cancelado();

    private Cancelado() {}

    public static Cancelado getInstance() {
        return instance;
    }

    public void verificarMudancaoSituacao(Agendamento agendamento, int dataAtual) {
        System.out.println("A situacao eh cancelado");
    }
}
