package com.pets;

public class Produto {
    private int id;
    private double preco;

    public Produto(int id, double preco) {
        this.id = id;
        this.preco = preco;
    }
    
    public double getPreco() {
        return this.preco;
    }
}
