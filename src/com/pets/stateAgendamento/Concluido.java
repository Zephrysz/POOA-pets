package com.pets.states;

import com.pets.*;

public class Concluido implements SituacaoAgendamento {
    private static Concluido instance = new Concluido();

    private Concluido() {}

    public static Concluido getInstance() {
        return instance;
    }

    public void verificarMudancaoSituacao(Agendamento agendamento, int dataAtual) {
        System.out.println("A situacao eh concluido");
    }
}
