package com.pets;

import java.util.List;
import java.util.ArrayList;
import Servico;

public abstract class Consulta extends AbstractSubject{
    private int data; // data da consulta
    private Situacao situacaoAgendamento;
    private Cliente cliente;
    private Animal animal;
    private Clinica clinica;
    private List<Servico> servicos = new ArrayList<>();

    public Consulta(int data, Cliente cliente, Animal animal, Clinica clinica, List<Servico> servicos){
        this.data = data;
        this.cliente = cliente;
        this.animal = animal;
        this.clinica = clinica;
        addObserver(cliente);
    }

    public void setServico(Servico servico) {
        this.servicos.add(servico);
    }

    public void setData(int data){
        this.data = data;
    }


    public int getData(){
        return this.data;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public Animal getAnimal(){
        return this.animal;
    }

    public Clinica getClinica(){
        return this.clinica;
    }


}