package com.pets;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String cnpj;
    private List<Funcionario> funcionarios;
    private List<Produto> estoque;

    // Construtor
    public Loja(String cnpj) {
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<>();
        this.estoque = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public void adicionarProdutoEmEstoque(Produto produto) {
        estoque.add(produto);
    }

    public void removerProdutoEmEstoque(Produto produto) {
        estoque.remove(produto);
    }

    public String getCnpj() {
        return cnpj;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public List<Produto> getEstoque() {
        return estoque;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void setEstoque(List<Produto> estoque) {
        this.estoque = estoque;
    }
}
