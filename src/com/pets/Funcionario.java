package com.pets;

public class Funcionario {
    private String nome;
    private String cpf;

    // Construtor
    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void realizarServico() {
        // implementação do serviço
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
