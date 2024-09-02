package com.pets;

import java.util.ArrayList;
import java.util.List;

public class Clinica extends Estabelecimento{
    private List<Consulta> consultas;

    public Clinica(String nome, String cnpj) {
        super(nome, cnpj);
        this.consultas = new ArrayList<Consulta>();
    }


    public void updateConsulta(Consulta consulta, int novaData) {
        if (consultas.contains(consulta)) {
            consulta.setData(novaData);
            System.out.println("Consulta atualizada com sucesso.");
        } else {
            System.out.println("Consulta não encontrada nessa clinica.");
        }
    }

    public void deleteConsulta(Consulta consulta) {
        if (consultas.contains(consulta)) {
            if (consulta instanceof Agendamento) {
                ((Agendamento) consulta).setSituacao(Cancelado.getInstance());
            } else {
                System.out.println("Apenas agendamentos podem ser cancelados.");
            }
        }
    }
}
