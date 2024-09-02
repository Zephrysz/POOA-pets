package com.pets;

public class UsuarioFactory {
    public Cliente criarCliente(String nome, String codigo, String email, String CPF, String endereco, String contato) {
        return new Cliente(nome, codigo, email, CPF, endereco, contato);
    }

    public PrestadorDeServicos criarPrestador(String nome, String codigo, String email, String CPF, String endereco, String contato) {
        return new PrestadorDeServicos(nome, codigo, email, CPF, endereco, contato);
    }
}
