package com.pets;

public class Produto {
    private int id;
    private float preco;

    public Produto(int id, float preco) {
        this.id = id;
        this.preco = preco;
    }
    
    public float getPreco() {
        return this.preco;
    }
}
