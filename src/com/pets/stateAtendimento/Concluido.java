package com.pets.states;

import com.pets.*;

public class Concluido implements SituacaoAtendimento {
    private static Concluido instance = new Concluido();

    private Concluido() {}

    public static Concluido getInstance() {
        return instance;
    }

    public void verificarMudancaSituacao(Atendimento atendimento, int dataAtual) {
        System.out.println("Atendimento concluido");
    }
}