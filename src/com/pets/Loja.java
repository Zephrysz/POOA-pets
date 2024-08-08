package com.pets;

import java.util.ArrayList;
import java.util.List;

public class Loja extends Estabelecimento{
    private List<Produto> estoque;

    // Construtor
    public Loja(String cnpj) {
        super(cnpj);
        this.estoque = new ArrayList<Produto>();
    }


    public void adicionarProdutoEmEstoque(Produto produto) {
        this.estoque.add(produto);
    }

    public void removerProdutoEmEstoque(Produto produto) {
        this.estoque.remove(produto);
    }

    public List<Produto> getEstoque() {
        return this.estoque;
    }
}
