package com.pets.states;

import com.pets.*;

public class EmAndamento implements SituacaoAtendimento {
    private static EmAndamento instance = new EmAndamento();

    private EmAndamento() {}

    public static EmAndamento getInstance() {
        return instance;
    }

    public void verificarMudancaoSituacao(Atendimento atendimento, int dataAtual) {
        int diasRestantes = atendimento.getData() - dataAtual;
        if(diasRestantes < 0) {
            System.out.println("Atendimento concluido");
            atendimento.setSituacao(Concluido.getInstance());
        }
        else {
            System.out.println("Atendimento em andamento");
        }
    }
}
