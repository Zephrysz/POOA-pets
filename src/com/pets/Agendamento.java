package com.pets;

import com.pets.stateAgendamento.*;
import com.pets.servicos.*;

import java.util.ArrayList;
import java.util.List;


public class Agendamento extends Consulta{

    private SituacaoAgendamento situacaoAgendamento;
    private Atendimento atendimento;

    public Agendamento(int data, Cliente cliente, Animal animal, Clinica clinica, SituacaoAgendamento situacao, List<Servico> servicos){
        super(data, cliente, animal, clinica, servicos);
        this.situacaoAgendamento = situacao;
    }

    public void verificarSituacao(int dataAtual) {
        this.situacaoAgendamento.verificarMudancaSituacao(this, dataAtual);
    }

    public void setSituacao(SituacaoAgendamento novaSituacao) {
        if (situacaoAgendamento != novaSituacao) {
            this.situacaoAgendamento = novaSituacao;
            notifyObservers();
        }
        // else nao precisa notificar
    }

    public void criarAtendimento() {
        atendimento = new Atendimento(this);
    }

    public void printar() {
        System.out.println("Informacoes da Consulta: ");
        System.out.println("Data eh: " + this.getData());
        System.out.println("Cliente eh: " + this.getCliente().getNome());
        System.out.println("Animal eh: " + this.getAnimal().getNome());
        System.out.println("Situacao eh: " + this.getSituacaoAgendamento());
    }
}