package com.pets;

import java.util.ArrayList;
import java.util.List;

public class PrestadorDeServicos extends Usuario {
    private List<Estabelecimento> estabelecimentos;

    public PrestadorDeServicos(String nome, String id, String email, String cpf, String endereco, String contato ) {
        super(nome, id, email, cpf, endereco, contato);
        this.estabelecimentos = new ArrayList<Estabelecimento>();
    }

    public void addEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimentos.add(estabelecimento);
    }

    public void listarLojas() {
        int qtdLoja = 0;
        for(int i = 0; i < estabelecimentos.size(); i++) {
            if (estabelecimentos.get(i) instanceof Loja) {
                System.out.println(i + ". " + estabelecimentos.get(i).getNome());
                qtdLoja++;
            }
        }
        if(qtdLoja == 0) {
            System.out.println("Voce nao tem lojas cadastradas");
        }
    }

    public void listarClinicas() {
        int qtdClinicas = 0;
        for(int i = 0; i < estabelecimentos.size(); i++) {
            if (estabelecimentos.get(i) instanceof Clinica) {
                System.out.println(i + ". " + estabelecimentos.get(i).getNome());
                qtdClinicas++;
            }
        }
        if(qtdClinicas == 0) {
            System.out.println("Voce nao tem clinicas cadastradas");
        }
    }

    public void listarConsultasClinica(int posicaoClinica) {
        Estabelecimento estabelecimento = estabelecimentos.get(posicaoClinica);
        if (estabelecimento instanceof Clinica) {
            Clinica clinica = (Clinica) estabelecimento;
            clinica.printarConsultasEstab();
        }
        else {
            System.out.println("Essa posicao de clinica nao existe");
        }
    }

    public Clinica getClinicaPorIndex(int idx) {
        Estabelecimento estabelecimento = estabelecimentos.get(idx);
        Clinica clinica = (Clinica) estabelecimento;
        return clinica;
        //if (estabelecimento instanceof Clinica) {
        //}

    }

    public Loja getLojaPorIndex(int idx) {
        Estabelecimento estabelecimento = estabelecimentos.get(idx);
        Loja loja = (Loja) estabelecimento;
        return loja;
    }


}
