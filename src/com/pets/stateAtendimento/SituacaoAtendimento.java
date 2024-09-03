package com.pets.stateAtendimento;

import com.pets.*;

public interface SituacaoAtendimento {
    void verificarMudancaSituacao(Atendimento atendimento, int dataAtual);
    String getSituacao();
}