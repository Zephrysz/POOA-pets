package com.pets;

public abstract class Usuario {
    protected String name;
    protected String id;
    protected String email;

    public Usuario(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return name;
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