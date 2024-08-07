package com.pets;

public class PrestadorDeServicos implements Usuario {
    private String nome;
    private int codigo;
    private String email;

    public PrestadorDeServicos(String nome, int codigo, String email) {
        this.nome = nome;
        this.codigo = codigo;
        this.email = email;
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

    public void criarAgendamento(){
        
    }
}
