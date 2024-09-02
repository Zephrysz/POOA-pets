package com.pets;

import com.pets.states.*;

public class Agendamento extends Consulta{

    private SituacaoAgendamento situacaoAgendamento;
    private Atendimento atendimento;

    public Agendamento(int data, Cliente cliente, Animal animal, Clinica clinica, SituacaoAgendamento situacao, List<Servico> servicos){
        super(data, cliente, animal, clinica, servicos);
        this.situacaoAgendamento = situacao;
    }

    public void verificarSituacao(int dataAtual) {
        this.situacaoAgendamento.verificarMudancaoSituacao(this, dataAtual);
    }

    public void setSituacao(Situacao novaSituacao) {
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
        System.out.println("Data eh: ", data);
        System.out.println("Cliente eh: ", cliente.getNome());
        System.out.println("Animal eh: ", animal.getNome());
        System.out.println("Situacao eh: ", situacao.printar());
    }
}