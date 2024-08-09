package com.pets.states;

import com.pets.*;

public interface Situacao {
    void verificarMudancaoSituacao(Agendamento agendamento, int dataAtual);
}