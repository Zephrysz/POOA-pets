package com.pets.stateAgendamento;

import com.pets.*;

public class Adiada implements SituacaoAgendamento {
    private static Adiada instance = new Adiada();

    private Adiada() {}

    public static Adiada getInstance() {
        return instance;
    }

    public void verificarMudancaSituacao(Agendamento agendamento, int dataAtual) {
        System.out.println("A situacao eh adiada");
        agendamento.setSituacao(SituacaoPadrao.getInstance());
    }

    public String getSituacao(){
        return "Adiada";
    }
}