package com.pets;

import com.pets.states.*;

public class Main {
    public static void main(String[] args) {

        // Criando Usuários
        System.out.println("=== Criando Usuarios (e um funcionario) ===");
        UsuarioFactory usuarioFactory = new UsuarioFactory();
        Cliente cliente = (Cliente) usuarioFactory.criarCliente("João", "001", "joao@example.com", "12345678900", "Rua A", "123456789");
        PrestadorDeServicos prestador = (PrestadorDeServicos) usuarioFactory.criarPrestador("Pedro", "002", "pedro@example.com");
        Funcionario funcionario = new Funcionario("Maria", "98765432100");
        System.out.println("===========================================\n");

        // Criando um produto
        System.out.println("=== Criando Produtos ===");
        Produto produto = new Produto(1, 99.99);
        System.out.println("========================\n");

        // Criando uma compra e adicionando um produto
        System.out.println("=== Criando uma Compra e adicionando um produto ===");
        Compra compra = cliente.criarCompra();
        compra.adicionarProduto(produto);
        System.out.println("Valor Total da Compra: R$" + compra.getValorTotal());
        System.out.println("===================================================\n");

        // Criando um agendamento
        System.out.println("=== Criando um Agendamento ===");
        //Agendamento agendamento = cliente.criarAgendamento("2024-08-15", funcionario);
        Agendamento agendamento = cliente.criarAgendamento(30, funcionario); // agendamento para o dia 30 desse mes
        System.out.println("==============================\n");

        // Mudando o estado do agendamento
        System.out.println("=== Mudando o estado do agendamento (e notificando o Cliente) ===");
        // Colocando um estado inicial
        Situacao estado = DataProxima.getInstance();
        agendamento.setSituacao(estado);
        // Verificando as mudancas de estado
        agendamento.verificarSituacao(1); // eh pra mudar pro longe
        agendamento.verificarSituacao(25); // eh pra mudar pro perto
        agendamento.verificarSituacao(27); // eh pra manter no perto
        agendamento.verificarSituacao(31); // eh pra mudar pro concluido
        agendamento.verificarSituacao(32); // eh pra manter no concluido
        // Obs: Acho que na vida real, teria um servidor que chamaria a funcao
        // verificarSituacao(...); sempre que chegar na meia noite para informar o dia atual
        System.out.println("=================================================================\n");

        // Notificando o cliente


        // Criando estabelecimentos e adicionando funcionários
        System.out.println("=== Criando Estabelecimentos (e adicionando funcionarios) ===");
        EstabelecimentoFactory estabelecimentoFactory = new EstabelecimentoFactory();
        Clinica clinica = estabelecimentoFactory.criarClinica("12345678000195");
        clinica.adicionarFuncionario(funcionario);

        Loja loja = estabelecimentoFactory.criarLoja("98765432000167");
        loja.adicionarProdutoEmEstoque(produto);
        System.out.println("=============================================================\n");

        // Teste adicional de métodos
        System.out.println("=== Testes adicionais ===");
        prestador.gerarRelatorio();
        System.out.println("Estabelecimento Criado: " + clinica.getCnpj());
        System.out.println("Estoque da Loja: " + loja.getEstoque().size() + " produto(s)");
        System.out.println("=========================\n");
    }
}
