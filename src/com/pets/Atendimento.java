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
        this.situacaoAtendimento = EmAndamento.getInstance();
    }

    public Atendimento(Agendamento agendamento){
        super(agendamento.getData(), agendamento.getCliente(), agendamento.getAnimal(), agendamento.getClinica(), agendamento.getServicos());
        this.situacaoAtendimento = EmAndamento.getInstance();
        verificarSituacao();
    }

    public void verificarSituacao() {
        LocalDate date = LocalDate.now();
        int today = date.getDayOfMonth();
        this.situacaoAtendimento.verificarMudancaSituacao(this, today);
    }

    public void setSituacao(SituacaoAtendimento novaSituacao) {
        if (situacaoAtendimento != novaSituacao) {
            this.situacaoAtendimento = novaSituacao;
            notifyObservers();
        }
        // else nao precisa notificar
    }

    public String getSituacaoAtendimento() {
        return this.situacaoAtendimento.getSituacao();
    }

    public void printar() {
        System.out.println("Informacoes do Atendimento: ");
        System.out.println("Data eh: " + this.getData());
        System.out.println("Cliente eh: " + this.getCliente().getNome());
        System.out.println("Animal eh: " + this.getAnimal().getNome());
        System.out.println("Situacao eh: " + this.getSituacaoAtendimento());
    }

}