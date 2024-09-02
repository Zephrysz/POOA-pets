package com.pets;

import java.util.ArrayList;
import java.util.List;

public abstract class Estabelecimento {
    private String cnpj;
    private String nome;

    public Estabelecimento(String cnpj, String nome){
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public String getCnpj(){
        return this.cnpj;
    }

    public String getNome(){
        return this.nome;
    }
}
