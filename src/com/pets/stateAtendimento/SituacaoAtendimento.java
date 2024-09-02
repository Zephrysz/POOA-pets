package com.pets.states;

import com.pets.*;

public interface SituacaoAtendimento {
    void verificarMudancaoSituacao(Atendimento atendimento, int dataAtual);
}