package com.pets.states;

import com.pets.*;

public class Concluido implements SituacaoAtendimento {
    private static Concluido instance = new Concluido();

    private Concluido() {}

    public static Concluido getInstance() {
        return instance;
    }

    public void verificarMudancaoSituacao(Atendimento atendimento, int dataAtual) {
        System.out.println("Atendimento concluido");
    }
}
