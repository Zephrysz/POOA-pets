package com.pets;

import com.pets.states.*;

public class Atendimento extends Consulta{

    private SituacaoAtendimento situacaoAtendimento;

    public Atendimento(int data, Cliente cliente, Animal animal, Clinica clinica, SituacaoAtendimento situacao){
        super(data, cliente, animal, clinica);
        this.situacaoAtendimento = situacao;
    }

    public Atendimento(Agendamento agendamento){
        super(agendamento.getData(), agendamento.getCliente(), agendamento.getAnimal(), agendamento.getClinica());
        verificarSituacao(this, agendamento.getData());
    }

    public void verificarSituacao(int dataAtual) {
        this.situacaoAtendimento.verificarMudancaoSituacao(this, dataAtual);
    }

    public void mudarEstado(Situacao novaSituacao) {
        if (situacaoAtendimento != novaSituacao) {
            this.situacaoAtendimento = novaSituacao;
            notifyObservers();
        }
        // else nao precisa notificar
    }

}