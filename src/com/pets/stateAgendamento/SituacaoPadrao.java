package com.pets.stateAgendamento;

import com.pets.*;

public class SituacaoPadrao implements SituacaoAgendamento {
    private static SituacaoPadrao instance = new SituacaoPadrao();

    private SituacaoPadrao() {}

    public static SituacaoPadrao getInstance() {
        return instance;
    }

    public void verificarMudancaSituacao(Agendamento agendamento, int dataAtual) {
        int diasRestantes = agendamento.getData() - dataAtual;
        if(diasRestantes >= 10) {
            System.out.println("A situacao do Agendamento eh Longe, pois agora faltam: " + diasRestantes + " dia(s)");
            agendamento.setSituacao(DataLonge.getInstance());
        }
        else if(diasRestantes > 0 && diasRestantes < 10) {
            System.out.println("A situacao do Agendamento eh Pooxima, pois agora faltam: " + diasRestantes + " dia(s)");
            agendamento.setSituacao(DataProxima.getInstance());
        }
        else if (diasRestantes == 0) {
            System.out.println("O agendamento eh Hoje, criando atendimentos");
            agendamento.setSituacao(DataProxima.getInstance());
            agendamento.criarAtendimento();
        }
        else if(diasRestantes < 0) {
            System.out.println("A situacao do Agendamento passou de Perto para Passado, pois tava marcado para ontem");
            agendamento.setSituacao(DataPassada.getInstance());
        }
        else {
            System.out.println("A situacao continua Perto, pois ainda faltam: " + diasRestantes + " dia(s)");
        }
    }

    public String getSituacao(){
        return "Data Proxima";
    }
}
