package com.pets.servicos;


public class ConsultaVeterinaria implements Servico {

    private static ConsultaVeterinaria instance;


    private ConsultaVeterinaria() {}

    public static ConsultaVeterinaria getInstance() {
        if (instance == null) {
            instance = new ConsultaVeterinaria();
        }
        return instance;
    }

    @Override
    public void realizarServico() {
        System.out.println("Realizando consulta veterinária...");
    }
}