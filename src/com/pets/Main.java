package com.pets;

import com.pets.states.*;

public class Main {
    public static void main(String[] args) {
        // Criando usuários
        UsuarioFactory usuarioFactory = new UsuarioFactory();
        Cliente cliente = (Cliente) usuarioFactory.criarCliente("João", "001", "joao@example.com", "12345678900", "Rua A", "123456789");
        Funcionario funcionario = new Funcionario("Maria", "98765432100");
        PrestadorDeServicos prestador = (PrestadorDeServicos) usuarioFactory.criarPrestador("Pedro", "002", "pedro@example.com");

        // Criando um produto
        Produto produto = new Produto(1, 99.99);

        // Criando uma compra e adicionando um produto
        Compra compra = cliente.criarCompra();
        compra.adicionarProduto(produto);
        System.out.println("Valor Total da Compra: R$" + compra.getValorTotal());

        // Criando um agendamento
        Agendamento agendamento = cliente.criarAgendamento("2024-08-15", funcionario);

        // Mudando o estado do agendamento
        Situacao estado = DataProxima.getInstance();
        agendamento.setSituacao(estado);

        // Notificando o cliente


        // Criando estabelecimentos e adicionando funcionários
        EstabelecimentoFactory estabelecimentoFactory = new EstabelecimentoFactory();
        Clinica clinica = estabelecimentoFactory.criarClinica("12345678000195");
        clinica.adicionarFuncionario(funcionario);

        Loja loja = estabelecimentoFactory.criarLoja("98765432000167");
        loja.adicionarProdutoEmEstoque(produto);

        // Teste adicional de métodos
        prestador.gerarRelatorio();
        System.out.println("Estabelecimento Criado: " + clinica.getCnpj());
        System.out.println("Estoque da Loja: " + loja.getEstoque().size() + " produto(s)");
    }
}
