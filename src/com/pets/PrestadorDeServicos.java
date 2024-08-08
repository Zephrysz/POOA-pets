package com.pets;

import java.util.ArrayList;
import java.util.List;

public class PrestadorDeServicos extends Usuario {
    private List<Clinica> clinicas;
    private List<Loja> lojas; 

    public PrestadorDeServicos(String nome, String codigo, String email) {
        super(nome, codigo, email);
        this.clinicas = new ArrayList<Clinica>();
        this.lojas = new ArrayList<Loja>();
    }


    public void gerarRelatorio() {
        // implementação para gerar relatório
    }

    public void addEstabelecimento() {
        // implementação para adicionar estabelecimento
    }

    public void login(){
        
    }

    public void cadastro(){
        
    }

}
