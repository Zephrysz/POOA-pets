package com.pets;

import java.util.ArrayList;
import java.util.List;

public abstract class Estabelecimento {
    private String cnpj;
    private List<Funcionario> funcionarios;

    public Estabelecimento(String cnpj){
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<Funcionario>();
    }


    public void adicionarFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }
    public void removerFuncionario(Funcionario funcionario){
        this.funcionarios.remove(funcionario);
    }

    public String getCnpj(){
        return this.cnpj;
    }

    public List<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }
}
