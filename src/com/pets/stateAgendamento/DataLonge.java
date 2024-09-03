package com.pets.stateAgendamento;

import com.pets.*;

public class DataLonge implements SituacaoAgendamento {
    private static DataLonge instance = new DataLonge();

    private DataLonge() {}

    public static DataLonge getInstance() {
        return instance;
    }

    public void verificarMudancaSituacao(Agendamento agendamento, int dataAtual) {
        int diasRestantes = agendamento.getData() - dataAtual;
        if(diasRestantes < 10) {
            System.out.println("A situacao passou de Longe para Perto, pois agora faltam: " + diasRestantes + " dia(s)");
            agendamento.setSituacao(DataProxima.getInstance());
        }
        else {
            System.out.println("A situacao continua Longe, pois ainda faltam: " + diasRestantes + " dia(s)");
        }
    }

    public String getSituacao(){
        return "Data Longe";
    }
}
