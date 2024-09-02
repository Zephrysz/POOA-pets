package com.pets;

public class EstabelecimentoFactory {
    public Clinica criarClinica(String nome, String cnpj) {
        return new Clinica(nome, cnpj);
    }

    public Loja criarLoja(String nome, String cnpj) {
        return new Loja(nome, cnpj);
    }
}
