package com.pets;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

import com.pets.stateAtendimento.*;
import com.pets.servicos.*;


public class Atendimento extends Consulta{

    private SituacaoAtendimento situacaoAtendimento;

    public Atendimento(int data, Cliente cliente, Animal animal, Clinica clinica, List<Servico> servicos, SituacaoAtendimento situacao){
        super(data, cliente, animal, clinica, servicos);
        this.situacaoAtendimento = situacao;
    }

    public Atendimento(Agendamento agendamento){
        super(agendamento.getData(), agendamento.getCliente(), agendamento.getAnimal(), agendamento.getClinica(), agendamento.getServicos());
        this.verificarSituacao(agendamento.getData());
    }

    public void verificarSituacao(int dataAtual) {
        LocalDate date = LocalDate.now();
        int today = date.getDayOfMonth();
        this.situacaoAtendimento.verificarMudancaSituacao(this, today);
    }

    public void mudarEstado(SituacaoAtendimento novaSituacao) {
        if (situacaoAtendimento != novaSituacao) {
            this.situacaoAtendimento = novaSituacao;
            notifyObservers();
        }
        // else nao precisa notificar
    }

}