package com.pets.stateAgendamento;

import com.pets.*;

public class Concluido implements SituacaoAgendamento {
    private static Concluido instance = new Concluido();

    private Concluido() {}

    public static Concluido getInstance() {
        return instance;
    }

    public void verificarMudancaSituacao(Agendamento agendamento, int dataAtual) {
        System.out.println("A situacao eh concluido");
    }
}
