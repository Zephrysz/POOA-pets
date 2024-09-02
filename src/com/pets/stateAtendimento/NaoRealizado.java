package com.pets.states;

import com.pets.*;

public class NaoRealizado implements SituacaoAtendimento {
    private static NaoRealizado instance = new NaoRealizado();

    private NaoRealizado() {}

    public static NaoRealizado getInstance() {
        return instance;
    }

    public void verificarMudancaoSituacao(Atendimento atendimento, int dataAtual) {
        System.out.println("A situacao eh cancelado");
    }
}
