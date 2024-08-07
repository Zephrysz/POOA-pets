package com.pets;

import java.util.List;
import java.util.ArrayList;

public class Compra {
    private int id;
    private List<Produto> produtos;

    public Compra(int id) {
        this.id = id;   
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public float getValorTotal() {
        float total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public boolean realizarPagamento() {
        // implementação do pagamento
        return true;
    }
}
