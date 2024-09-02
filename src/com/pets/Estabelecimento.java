package com.pets;

import java.util.ArrayList;
import java.util.List;

public abstract class Estabelecimento {
    private String nome;
    private String cnpj;

    public Estabelecimento(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return this.cnpj;
    }

    public String getNome(){
        return this.nome;
    }
}
