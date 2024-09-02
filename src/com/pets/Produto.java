package com.pets;

public class Produto {
    private double preco;
    private int quantidade;
    private String nome;

    public Produto(double preco, int quantidade, String nome) {
        this.preco = preco;
        this.quantidade = quantidade;
        this.nome = nome;
    }
    
    public double getPreco() {
        return this.preco;
    }
}
