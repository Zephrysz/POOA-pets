package com.pets;

import com.pets.states.*;

public class Agendamento extends AgendamentoSubject{
    private String data;
    private Situacao situacaoAgendamento;

    private Cliente cliente;
    private Funcionario funcionario;

    public Agendamento(String data, Cliente cliente, Funcionario funcionario){
        this.data = data;
        this.cliente = cliente;
        this.funcionario = funcionario;
        addObserver(cliente);
    }


    public void setSituacao(Situacao novaSituacao) {
        if (situacaoAgendamento != novaSituacao) {
            this.situacaoAgendamento = novaSituacao;
            notifyObservers();
        }
        // else nao precisa notificar
    }


    public String getData(){
        return this.data;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public Funcionario getFuncionario(){
        return this.funcionario;
    }


}