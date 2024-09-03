package com.pets.stateAgendamento;

import com.pets.*;

public class DataPassada implements SituacaoAgendamento {
    private static DataPassada instance = new DataPassada();

    private DataPassada() {}

    public static DataPassada getInstance() {
        return instance;
    }

    public void verificarMudancaSituacao(Agendamento agendamento, int dataAtual) {
        int diasRestantes = agendamento.getData() - dataAtual;
        if(diasRestantes < 0) {
            System.out.println("Esse agendamento estava marcado para: " + diasRestantes*-1 + " dia(s) atras");
        }
        else {
            System.out.println("Eita, nao era pra ser possivel chegar aqui nesse else do dataPassada, algo deu errado");
        }
    }

    public String getSituacao(){
        return "Data Passada";
    }
}
