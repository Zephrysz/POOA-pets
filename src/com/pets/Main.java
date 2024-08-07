package com.pets;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        UsuarioFactory usuarioFactory = new UsuarioFactory();

        Usuario cliente = usuarioFactory.criarCliente("test", 1, "teste@email", "123456", "endereco" , 3067170);



        // Criar um agendamento

        LocalDate date = LocalDate.of(2024, 7, 14);
        Agendamento agendamento = new Agendamento(date, 1);

        Funcionario funcionario = new Funcionario("Joao2", "1234123124");

        agendamento.adicionarFuncionarioParaServico(funcionario);

        cliente.criarAgendamento();
        
        // Criar uma compra
        Compra compra = new Compra(1);

        // Adicionar produtos à compra
        Produto produto1 = new Produto(1, 10);

        Produto produto2 = new Produto(2, 5);

        compra.adicionarProduto(produto1);
        compra.adicionarProduto(produto2);

        // Calcular o valor total da compra
        float valorTotal = compra.getValorTotal();
        System.out.println("Valor total da compra: " + valorTotal);

        // Realizar o pagamento
        //boolean pagamentoRealizado = compra.realizarPagamento();
        boolean pagamentoRealizado = true;
        if (pagamentoRealizado) {
            System.out.println("Pagamento realizado com sucesso!");
        } else {
            System.out.println("Falha ao realizar o pagamento.");
        }
    }
}
