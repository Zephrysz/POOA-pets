package com.pets;

import com.pets.stateAgendamento.*;
import com.pets.servicos.*;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


public class Agendamento extends Consulta{

    private SituacaoAgendamento situacaoAgendamento;
    private Atendimento atendimento;

    public Agendamento(int data, Cliente cliente, Animal animal, Clinica clinica, List<Servico> servicos){
        super(data, cliente, animal, clinica, servicos);
        this.situacaoAgendamento = DataLonge.getInstance(); // nao era pra eu fazer isso, mas mt trabalho pra mudar :idk: 
        verificarSituacao();
    }

    public void verificarSituacao() {
        LocalDate date = LocalDate.now();
        int today = date.getDayOfMonth();
        this.situacaoAgendamento.verificarMudancaSituacao(this, today);
    }

    public void setSituacao(SituacaoAgendamento novaSituacao) {
        if (this.situacaoAgendamento != novaSituacao) {
            this.situacaoAgendamento = novaSituacao;
            notifyObservers();
        }
        // else nao precisa notificar
    }

    public void criarAtendimento() {
        atendimento = new Atendimento(this);
    }

    public String getSituacaoAgendamento() {
        return this.situacaoAgendamento.getSituacao();
    }

    public SituacaoAgendamento getObjetoSituacaoAgendamento() {
        return this.situacaoAgendamento;
    }

    public void printar() {
        System.out.println("Informacoes da Consulta: ");
        System.out.println("Data eh: " + this.getData());
        System.out.println("Cliente eh: " + this.getCliente().getNome());
        System.out.println("Animal eh: " + this.getAnimal().getNome());
        System.out.println("Situacao eh: " + this.getSituacaoAgendamento());
    }
}