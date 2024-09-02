package com.pets;

public class Animal {
    private String nome;
    private String especie;
    private String raca;

    public Animal(String nome, String especie, String raca) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
    }

    // Getters e Setters
    public String getNome(){
        return this.nome;
    }

    public String getEspecie(){
        return this.especie;
    }

    public String getRaca(){
        return this.raca;
    }
}
