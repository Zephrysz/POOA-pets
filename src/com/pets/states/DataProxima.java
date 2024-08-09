package com.pets.states;

import com.pets.*;

public class DataProxima implements Situacao {
    private static DataProxima instance = new DataProxima();

    private DataProxima() {}

    public static DataProxima getInstance() {
        return instance;
    }

    public void verificarMudancaoSituacao(Agendamento agendamento, int dataAtual) {
        int diasRestantes = agendamento.getData() - dataAtual;
        if(diasRestantes >= 10) {
            System.out.println("A situacao passou de Perto para Longe, pois agora faltam: " + diasRestantes + " dia(s)");
            agendamento.setSituacao(DataLonge.getInstance());
        }
        else if(diasRestantes < 0) {
            System.out.println("A situaca agora eh Concluido, pois esse agendamento ocorreu ontem");
            agendamento.setSituacao(Concluido.getInstance());
        }
        else {
            System.out.println("A situacao continua Perto, pois ainda faltam: " + diasRestantes + " dia(s)");
        }
    }
}
