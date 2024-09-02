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

    public Cliente(String nome, String id, String email, String cpf, String endereco, String contato) {
        super(nome, id, email, cpf, endereco, contato);
        this.pets = new ArrayList<Animal>();
        this.agendamentos = new ArrayList<Agendamento>();
    }

    public void adicionarPet(Animal pet) {
        this.pets.add(pet);
    }

    public void removerPet(Animal pet) {
        this.pets.remove(pet);
    }

    public Compra criarCompra() {
        Random gerador = new Random(); // tem que fazer com que todos os ids sejam unicos 

        return new Compra(gerador.nextInt(10000));
    }

    public void criarAgendamento(int data, Animal animal, Clinica clinica, SituacaoAgendamento situacao, List<Servico> servicos) {
        Agendamento agendamento = new Agendamento(data, this, animal, clinica, situacao, servicos);
        agendamentos.add(agendamento);
    }
    
    public void cancelarAgendamento(Agendamento agendamento){
        agendamentos.remove(agendamento);
    }

    public Agendamento getAgendamentoPorIndex(int idx) {
        return agendamentos.get(idx);
    }

    public void update(){
        System.out.println("Cliente de CPF: " + this.cpf + " foi notificado no email: " + this.email);
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


    public void mostrarAgendamentos() {
        for (int i = 0; i < agendamentos.size(); i++) {
            agendamentos.get(i).printar();
        }
    }
}