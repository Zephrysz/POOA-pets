package com.pets;

import java.util.ArrayList;
import java.util.List;

class Cliente implements Usuario {
    private String nome;
    private int codigo;
    private String email;
    private String cpf;
    private String endereco;
    private int contato;
    private List<Animal> pets;
    // Implementação dos métodos da interface

    public Cliente(String nome, int codigo, String email, String cpf, String endereco, int contato) {
        this.nome = nome;
        this.codigo = codigo;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.pets = new ArrayList<Animal>();
    }

    public void removerPet(Animal pet) {
        this.pets.remove(pet);
        System.out.println("Pet removido: " + pet);
    }

    public void criarCompra() {
        // implementação para criar compra
    }

    public void criarAgendamento() {
        System.out.println("CRiando agendamento");
    }

    // Métodos adicionais, getters e setters

    public List<Animal> getPets() {
        return pets;
    }

    public void setPets(List<Animal> pets) {
        this.pets = pets;
    }

    public void login(){
        
    }

    public void cadastro(){
        
    }

    public void update(){

    }
}