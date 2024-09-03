package com.pets.stateAtendimento;

import com.pets.*;

public class EmAndamento implements SituacaoAtendimento {
    private static EmAndamento instance = new EmAndamento();

    private EmAndamento() {}

    public static EmAndamento getInstance() {
        return instance;
    }

    public void verificarMudancaSituacao(Atendimento atendimento, int dataAtual) {
        int diasRestantes = atendimento.getData() - dataAtual;
        if(diasRestantes < 0) {
            System.out.println("Atendimento concluido");
            atendimento.setSituacao(Concluido.getInstance());
        }
        else {
            System.out.println("Atendimento em andamento");
        }
    }
    public String getSituacao(){
        return "Em andamento";
    }
}
