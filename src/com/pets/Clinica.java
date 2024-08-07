package com.pets;

import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private String cnpj;
    private List<Funcionario> funcionarios;

    public Clinica(String cnpj) {
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public void crudConsulta() {
        // implementação do CRUD de consulta
    }

    public void addServico() {
        // implementação para adicionar serviço
    }

    // Métodos getter
    public String getCnpj() {
        return cnpj;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    // Métodos setter
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
