package com.pets;

class Animal {
    private String nome;
    private String especie;
    private String raca;
    private int codigo;

    public Animal(String nome, String especie, String raca, int codigo) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.codigo = codigo;
    }

    // Getters e Setters

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}