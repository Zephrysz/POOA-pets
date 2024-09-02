package com.pets.stateAgendamento;

import com.pets.*;

public class Cancelado implements SituacaoAgendamento {
    private static Cancelado instance = new Cancelado();

    private Cancelado() {}

    public static Cancelado getInstance() {
        return instance;
    }

    public void verificarMudancaSituacao(Agendamento agendamento, int dataAtual) {
        System.out.println("A situacao eh cancelado");
    }
}
