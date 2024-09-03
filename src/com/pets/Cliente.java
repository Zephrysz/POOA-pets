package com.pets;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.pets.servicos.*;
import com.pets.stateAgendamento.*;
import com.pets.stateAtendimento.*;

class Cliente extends Usuario implements AbstractObserver{
    private List<Animal> pets;
    private List<Agendamento> agendamentos;
    private List<Atendimento> atendimentos;

    public Cliente(String nome, String id, String email, String cpf, String endereco, String contato) {
        super(nome, id, email, cpf, endereco, contato);
        this.pets = new ArrayList<Animal>();
        this.agendamentos = new ArrayList<>();
        this.atendimentos = new ArrayList<>();
    }


    public void adicionarPet(Animal pet) {
        this.pets.add(pet);
    }

    public void removerPet(Animal pet) {
        this.pets.remove(pet);
    }

    public Compra criarCompra() {
        Random gerador = new Random(); // tem que fazer com que todos os ids sejam unicos (n eh o melhor jeito de fazer)
        return new Compra(gerador.nextInt(10000));
    }
    
    public void adicionarProdutoNaCompra(Compra compra, Produto produto, int quantidade, Loja loja) {
        compra.adicionarProduto(produto, quantidade, loja);
    }

    public void criarAgendamento(int data, Animal animal, Clinica clinica, List<Servico> servicos) {
        Agendamento agendamento = new Agendamento(data, this, animal, clinica, servicos);
        this.agendamentos.add(agendamento);
    }
    
    public void cancelarAgendamento(Agendamento agendamento){
        this.agendamentos.remove(agendamento);
    }

    public Agendamento getAgendamentoPorIndex(int idx) {
        return this.agendamentos.get(idx);
    }

    public void update(){
        System.out.println("Cliente de CPF: " + this.cpf + " foi notificado no email: " + this.email);
    }

    public void adicionarAtendimento(Atendimento atendimento){
        this.atendimentos.add(atendimento);
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public String getContato(){
        return this.contato;
    }

    public List<Animal> getPets() {
        return this.pets;
    }

    public List<Agendamento> getAgendamentos() {
        return this.agendamentos;
    }

    public List<Atendimento> getAtendimentos() {
        return this.atendimentos;
    }

    public void mostrarAgendamentos() {
        for (int i = 0; i < this.agendamentos.size(); i++) {
            this.agendamentos.get(i).printar();
        }
    }

    public void mostrarAtendimentos() {
        for (int i = 0; i < this.agendamentos.size(); i++) {
            this.atendimentos.get(i).printar();
        }   
    }
}