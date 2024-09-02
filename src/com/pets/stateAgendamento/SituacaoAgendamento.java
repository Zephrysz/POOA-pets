package com.pets.states;

import com.pets.*;

public interface SituacaoAgendamento {
    void verificarMudancaoSituacao(Agendamento agendamento, int dataAtual);
}