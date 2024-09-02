package com.pets.stateAgendamento;

import com.pets.*;

public interface SituacaoAgendamento {
    void verificarMudancaSituacao(Agendamento agendamento, int dataAtual);
}