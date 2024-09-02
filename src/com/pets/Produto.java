package com.pets;

public class Produto {
    private int id;
    private double preco;
    private int quantidade;
    private String nome;

    public Produto(int id, double preco, int quantidade, String nome) {
        this.id = id;
        this.preco = preco;
        this.quantidade = quantidade;
        this.nome = nome;
    }
    
    public double getPreco() {
        return this.preco;
    }
}
