package com.pets;

import java.util.ArrayList;
import java.util.List;

public class PrestadorDeServicos extends Usuario {
    private List<Estabelecimento> estabelecimentos;
    //private List<Clinica> clinicas;
    //private List<Loja> lojas; 

    public PrestadorDeServicos(String nome, String codigo, String email) {
        super(nome, codigo, email);
        //this.clinicas = new ArrayList<Clinica>();
        //this.lojas = new ArrayList<Loja>();
        this.estabelecimentos = new ArrayList<Estabelecimento>();
    }

    public void addEstabelecimento(Estabelecimento estabele) {
        this.estabelecimentos.add(estabele);
    }

    public void gerarRelatorio() {
        // implementação para gerar relatório
    }


}
