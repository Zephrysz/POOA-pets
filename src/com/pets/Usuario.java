package com.pets;

public abstract class Usuario {
    protected String nome;
    protected String id;
    protected String email;
    protected String cpf;
    protected String endereco;
    protected String contato;

    public Usuario(String nome, String id, String email, String cpf, String endereco, String contato ) {
        this.nome = nome;
        this.id = id;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    void login(){
        // tbi
    }

    public void cadastro(){
        // tbi
    }

    
}