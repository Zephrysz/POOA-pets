package com.pets;

import com.pets.states.*;

public class Agendamento extends AgendamentoSubject{
    private int data; // data da consulta
    private Situacao situacaoAgendamento;

    private Cliente cliente;
    private Funcionario funcionario;

    public Agendamento(int data, Cliente cliente, Funcionario funcionario){
        this.data = data;
        this.cliente = cliente;
        this.funcionario = funcionario;
        addObserver(cliente);
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


    public int getData(){
        return this.data;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public Funcionario getFuncionario(){
        return this.funcionario;
    }


}