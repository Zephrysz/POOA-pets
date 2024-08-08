package com.pets;

public class EstabelecimentoFactory {
    public Clinica criarClinica(String cnpj) {
        return new Clinica(cnpj);
    }

    public Loja criarLoja(String cnpj) {
        return new Loja(cnpj);
    }
}
