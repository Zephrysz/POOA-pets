package com.pets;

import java.util.ArrayList;
import java.util.List;

public class PrestadorDeServicos extends Usuario {
    private List<Estabelecimento> estabelecimentos;

    public PrestadorDeServicos(String nome, String id, String email, String cpf, String endereco, String contato ) {
        super(nome, id, email, cpf, endereco, contato);
        this.estabelecimentos = new ArrayList<Estabelecimento>();
    }

    public void addEstabelecimento(Estabelecimento estabele) {
        this.estabelecimentos.add(estabele);
    }

    public void listarClinicas() {
        for(int i = 0; i < estabelecimentos.size(); i++) {
            if (estabelecimentos.get(i) instanceof Clinica) {
                System.out.println(i + ". " + estabelecimentos.get(i).getNome());
            }
        }
    }

    public void listarConsultasClinica(int posicaoClinica) {
        Estabelecimento estabelecimento = estabelecimentos.get(posicaoClinica);
        if (estabelecimento instanceof Clinica) {
            Clinica clinica = (Clinica) estabelecimento;
            clinica.printarConsultasEstab();
        }
    }

    public void gerarRelatorio() {
        // implementação para gerar relatório
    }


}
