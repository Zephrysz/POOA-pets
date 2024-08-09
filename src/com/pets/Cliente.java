package com.pets;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


class Cliente extends Usuario implements ClienteObserver{
    private String cpf;
    private String endereco;
    private String contato;
    private List<Animal> pets;

    public Cliente(String nome, String codigo, String email, String cpf, String endereco, String contato) {
        super(nome, codigo, email);
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.pets = new ArrayList<Animal>();
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

    public Agendamento criarAgendamento(int data, Funcionario funcionario) {
        return new Agendamento(data, this, funcionario);
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

    public void login(){
        
    }

    public void cadastro(){
        
    }

}