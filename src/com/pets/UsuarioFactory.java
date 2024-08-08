package com.pets;

public class UsuarioFactory {
    public Usuario criarCliente(String nome, String codigo, String email, String CPF, String endereco, String contato) {
        return new Cliente(nome, codigo, email, CPF, endereco, contato);
    }

    public Usuario criarPrestador(String nome, String codigo, String email) {
        return new PrestadorDeServicos(nome, codigo, email);
    }
}
