package com.pets;

import java.util.ArrayList;
import java.util.List;

public class Loja extends Estabelecimento{
    private List<Produto> produtos;

    // Construtor
    public Loja(String nome, String cnpj) {
        super(nome, cnpj);
        this.produtos = new ArrayList<Produto>();
    }


    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        this.produtos.remove(produto);
    }

    public void atualizarQuantidadeProduto(Produto produto, int quantidade) {
        for (Produto p : produtos) {
            if (p.getNome().equals(produto.getNome())) {
                p.setQuantidade(quantidade);
                return;
            }
        }
        throw new IllegalArgumentException("Produto não encontrado na loja.");
    }

    public List<Produto> getEstoque() {
        return this.produtos;
    }
}
