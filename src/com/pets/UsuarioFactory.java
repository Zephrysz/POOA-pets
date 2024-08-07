package com.pets;

public class UsuarioFactory {
    public Cliente criarCliente(String name, int codigo, String email, String cpf, String endereco, int contato){
        return new Cliente(name, codigo, email, cpf, endereco, contato);
    }

    public PrestadorDeServicos criarPrestador(String nome, int codigo, String email){
        return new PrestadorDeServicos( nome, codigo, email);
    }
}
