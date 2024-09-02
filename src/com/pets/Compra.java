package com.pets;

import java.util.List;
import java.util.ArrayList;

public class Compra {
    private int id;
    private List<Produto> produtos;
    private List<Integer> quantidades;

    public Compra(int id) {
        this.id = id;   
        this.produtos = new ArrayList<>();
        this.quantidades = new ArrayList<>();
        
    }

    public void adicionarProduto(Produto produto, int quantidade, Loja loja) {
        if (produto.getQuantidade() < quantidade) {
            throw new IllegalArgumentException("Quantidade insuficiente no estoque da loja.");
        }
        produto.reduzirQuantidade(quantidade);
        loja.atualizarQuantidadeProduto(produto, produto.getQuantidade());
        produtos.add(produto);
        quantidades.add(quantidade);
    }

    public void removerProduto(Produto produto) {
        int index = produtos.indexOf(produto);
        if (index != -1) {
            produtos.remove(index);
            quantidades.remove(index);
        }
    }

    public float getValorTotal() {
        float total = 0;
        for (int i = 0; i < produtos.size(); i++) {
            total += produtos.get(i).getPreco() * quantidades.get(i);
        }
        return total;
    }

    public boolean realizarPagamento() {
        double total = getValorTotal();
        System.out.println("Pagamento de R$" + total + " realizado.");
        return true;
        
    }
}
