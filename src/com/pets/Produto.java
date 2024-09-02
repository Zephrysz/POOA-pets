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

    public int getQuantidade() {
        return this.quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void reduzirQuantidade(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            throw new IllegalArgumentException("Quantidade insuficiente no estoque.");
        }
    }
}
