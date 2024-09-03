package com.pets;

import java.util.List;
import java.util.ArrayList;

import com.pets.servicos.*;
import com.pets.stateAgendamento.*;
import com.pets.stateAtendimento.*;

public abstract class Consulta extends AbstractSubject{
    protected int data; // data da consulta
    private Cliente cliente;
    private Animal animal;
    private Clinica clinica;
    private List<Servico> servicos = new ArrayList<>();

    public Consulta(int data, Cliente cliente, Animal animal, Clinica clinica, List<Servico> servicos){
        this.data = data;
        this.cliente = cliente;
        this.animal = animal;
        this.clinica = clinica;
        this.servicos = servicos;
        addObserver(cliente);
    }

    public void setServico(Servico servico) {
        this.servicos.add(servico);
    }

    public void setData(int data){
        this.data = data;
    }

    public List<Servico> getServicos(){
        return this.servicos;
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


    public void printarConsulta() {
        System.out.println("Consulta marcada para o dia: " + data);
        System.out.println("Com o cliente: " + cliente.getNome());
        System.out.println("Com o animal: " + animal.getNome());
        System.out.println("Com os serviços: ...");
        System.out.println("");
    }


}