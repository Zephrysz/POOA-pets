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

    // Métodos getter (opcional)
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    // Métodos setter (opcional)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
