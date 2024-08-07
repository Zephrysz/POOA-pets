package com.pets;

import java.time.LocalDate;

public class Agendamento {
    private LocalDate data;
    private int tipo;

    public Agendamento(LocalDate data, int tipo) {
        this.data = data;
        this.tipo = tipo;
    }

    public void adicionarFuncionarioParaServico(Funcionario funcionario) {
        // implementação para adicionar funcionário ao serviço
    }
}
