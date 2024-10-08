package com.pets;

import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;

import com.pets.stateAtendimento.*;
import com.pets.stateAgendamento.*;
import com.pets.servicos.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcaoInicial;
        
        List<Cliente> clientesExistentes = new ArrayList<>();
        List<PrestadorDeServicos> prestadoresExistentes = new ArrayList<>();
        List<Loja> lojasExistentes = new ArrayList<>();
        List<Clinica> clinicasExistentes = new ArrayList<>();

        Cliente clienteLogadoAtualmente;
        PrestadorDeServicos prestadorLogadoAtualmente;

        UsuarioFactory usuarioFactory = new UsuarioFactory();
        EstabelecimentoFactory estabelecimentoFactory = new EstabelecimentoFactory();
        
        System.out.println("Populando o sistema com exemplos...");
        // Criando clientes e seus animais
        Cliente cliente1 = usuarioFactory.criarCliente("João", "001", "joao@mail.com", "111111", "Rua A", "(15)1111-1111");
        Animal animal1 = new Animal("Doguinho", "Cachorro", "Labrador");
        cliente1.adicionarPet(animal1);
        clientesExistentes.add(cliente1);

        Cliente cliente2 = usuarioFactory.criarCliente("Rafael", "002", "rafael@mail.com", "222222", "Rua B", "(15)2222-2222");
        Animal animal2 = new Animal("Loro", "Passaro", "Papagaio");
        cliente2.adicionarPet(animal2);
        clientesExistentes.add(cliente2);

        Cliente cliente3 = usuarioFactory.criarCliente("Jubileu", "003", "jubileu@mail.com", "333333", "Rua C", "(15)3333-3333");
        Animal animal3 = new Animal("Miado", "Gato", "Siames");
        cliente3.adicionarPet(animal3);
        clientesExistentes.add(cliente3);
        
        // Criando Prestadores e seus estabelecimentos
        PrestadorDeServicos prestador1 = usuarioFactory.criarPrestador("Jonas", "004", "jonas@mail.com", "cpf4", "endereco4", "contato4");
        Clinica clinica1 = estabelecimentoFactory.criarClinica("Clinica Pets Saudaveis", "123321");
        clinicasExistentes.add(clinica1);
        prestador1.addEstabelecimento(clinica1);
        prestadoresExistentes.add(prestador1);

        PrestadorDeServicos prestador2 =  usuarioFactory.criarPrestador("Natan", "005", "natan@mail.com", "cpf5", "endereco5", "contato5");
        Loja loja1 = estabelecimentoFactory.criarLoja("Loja Pets Gulosos", "321123");
        lojasExistentes.add(loja1);
        Produto produto1 = new Produto(15.50, 10, "Racao de Gato");
        loja1.adicionarProduto(produto1);
        Produto produto2 = new Produto(17.99, 20, "Coleira");
        loja1.adicionarProduto(produto2);
        Produto produto3 = new Produto(200.00, 5, "Gaiola");
        loja1.adicionarProduto(produto3);
        prestador2.addEstabelecimento(loja1);
        prestadoresExistentes.add(prestador2);

        // Criando Agendamentos
        List<Servico> servicosExemplos = new ArrayList<>();

        servicosExemplos.add(Banho.getInstance());
        clientesExistentes.get(0).criarAgendamento(5, animal1, clinica1, servicosExemplos); 

        servicosExemplos.remove(Banho.getInstance());
        servicosExemplos.add(ConsultaVeterinaria.getInstance());
        clientesExistentes.get(1).criarAgendamento(15, animal2, clinica1, servicosExemplos);

        servicosExemplos.add(Tosa.getInstance());
        servicosExemplos.add(Banho.getInstance());
        clientesExistentes.get(2).criarAgendamento(30, animal3, clinica1, servicosExemplos);




        do {
            // Exibe o menu de opções
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Prestador de Servico");
            System.out.println("3. Logar como Cliente");
            System.out.println("4. Logar como Prestador de Servico");
            System.out.println("5. Sair\n");
            System.out.print("Escolha uma opção: ");

            opcaoInicial = scanner.nextInt();
            scanner.nextLine();
            System.out.println("");

            switch (opcaoInicial) {
                case 1:
                    System.out.println("Cadastrando um Cliente:");
                    System.out.print("Digite seu nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite seu codigo: ");
                    String codigo = scanner.nextLine();

                    System.out.print("Digite seu email: ");
                    String email = scanner.nextLine();

                    System.out.print("Digite seu CPF: ");
                    String cpf = scanner.nextLine();

                    System.out.print("Digite seu endereço: ");
                    String endereco = scanner.nextLine();

                    System.out.print("Digite seu contato: ");
                    String contato = scanner.nextLine();

                    Cliente clienteCriado = usuarioFactory.criarCliente(nome, codigo, email, cpf, endereco, contato);
                    clientesExistentes.add(clienteCriado);
                    break;

                case 2:
                    System.out.println("Cadastrando um Prestador de Servico");
                    System.out.print("Digite seu nome: ");
                    String nomePrestador = scanner.nextLine();

                    System.out.print("Digite seu codigo: ");
                    String codigoPrestador = scanner.nextLine();

                    System.out.print("Digite seu email: ");
                    String emailPrestador = scanner.nextLine();

                    System.out.print("Digite seu CPF: ");
                    String cpfPrestador = scanner.nextLine();

                    System.out.print("Digite seu endereço: ");
                    String enderecoPrestador = scanner.nextLine();

                    System.out.print("Digite seu contato: ");
                    String contatoPrestador = scanner.nextLine();

                    PrestadorDeServicos prestadorCriado = usuarioFactory.criarPrestador(nomePrestador, codigoPrestador, emailPrestador, cpfPrestador, enderecoPrestador, contatoPrestador);
                    prestadoresExistentes.add(prestadorCriado);
                    break;

                case 3:
                    System.out.println("Clientes existentes: ");
                    if (clientesExistentes.size() <= 0) {
                        System.out.println("Nao existe clientes registrados");
                        break;
                    }
                    for (int i = 0; i < clientesExistentes.size(); i++) {
                        System.out.println(i + ". " + clientesExistentes.get(i).getNome());
                    }

                    System.out.print("Digite o numero do Cliente que voce quer logar: ");
                    int clienteLogar = scanner.nextInt();
                    scanner.nextLine();


                    clienteLogadoAtualmente = clientesExistentes.get(clienteLogar);
                    System.out.println("Agora voce esta logado como: " + clienteLogadoAtualmente.getNome());

                    int opcaoCliente;
                    do {
                        // Opcoes do Cliente
                        System.out.println("\nMenu do cliente: " + clienteLogadoAtualmente.getNome());
                        System.out.println("1. Cadastrar Animal");
                        System.out.println("2. Criar Agendamento");
                        System.out.println("3. Passar um dia");
                        System.out.println("4. Cancelar Agendamento");
                        System.out.println("5. Listar Agendamentos");
                        System.out.println("6. Listar Atendimentos");
                        System.out.println("7. Realizar uma compra");
                        System.out.println("8. Listar Animais");
                        System.out.println("9. Deslogar do cliente");
                        System.out.print("Escolha uma opção: ");

                        opcaoCliente = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("");

                        switch (opcaoCliente) {
                            case 1:
                                System.out.println("Cadastrando um animal");
                                System.out.print("Digite o nome do seu animal: ");
                                String nomeAnimal = scanner.nextLine();

                                System.out.print("Digite a especie do seu animal: ");
                                String especie = scanner.nextLine();

                                System.out.print("Digite a raca do seu animal: ");
                                String raca = scanner.nextLine();

                                Animal animalCriado = new Animal(nomeAnimal, especie, raca);
                                clienteLogadoAtualmente.adicionarPet(animalCriado);
                                break;
                            case 2:
                                System.out.println("Criando um agendamento");

                                System.out.print("Digite a data do agendamento: ");
                                int data = scanner.nextInt();
                                scanner.nextLine(); 

                                List<Animal> pets = clienteLogadoAtualmente.getPets();
                                if (pets.isEmpty()) {
                                    System.out.println("Você não tem nenhum pet cadastrado. Cadastre um pet primeiro.");
                                    break;
                                }
                                System.out.println("Selecione o pet para o agendamento:");
                                for (int i = 0; i < pets.size(); i++) {
                                    System.out.println(i + " - " + pets.get(i).getNome());
                                }
                                int petIndex = scanner.nextInt();
                                scanner.nextLine(); 
                                Animal petSelecionado = pets.get(petIndex);

                                System.out.println("Selecione a clinica para realizar a consulta:");
                                for (int i = 0; i < clinicasExistentes.size(); i++) {
                                    System.out.println(i + " - " + clinicasExistentes.get(i).getNome());
                                }
                                int clinicaIndex = scanner.nextInt();
                                scanner.nextLine();

                                Clinica clinicaSelecionada = clinicasExistentes.get(clinicaIndex);

                                // Selecionando os serviços (exemplo simples com um serviço, pode ser expandido para múltiplos)
                                List<Servico> servicos = new ArrayList<>();
                                boolean adicionandoServicos = true;
                                while (adicionandoServicos) {
                                    System.out.println("Escolha um serviço para o agendamento:");
                                    System.out.println("1 - Banho");
                                    System.out.println("2 - Consulta Veterinária");
                                    System.out.println("3 - Tosa");
                                    System.out.println("0 - Finalizar seleção de serviços");
                                    int servicoEscolhido = scanner.nextInt();
                                    scanner.nextLine(); // Limpar o buffer do scanner
                            
                                    switch (servicoEscolhido) {
                                        case 1:
                                            servicos.add(Banho.getInstance());
                                            System.out.println("Serviço 'Banho' adicionado.");
                                            break;
                                        case 2:
                                            servicos.add(ConsultaVeterinaria.getInstance());
                                            System.out.println("Serviço 'Consulta Veterinária' adicionado.");
                                            break;
                                        case 3:
                                            servicos.add(Tosa.getInstance());
                                            System.out.println("Serviço 'Tosa' adicionado.");
                                            break;
                                        case 0:
                                            adicionandoServicos = false;
                                            break;
                                        default:
                                            System.out.println("Opção inválida. Tente novamente.");
                                    }
                                }
                            
                                if (servicos.isEmpty()) {
                                    System.out.println("Nenhum serviço selecionado. Não é possível criar um agendamento sem serviços.");
                                    break;
                                }

                                clienteLogadoAtualmente.criarAgendamento(data, petSelecionado, clinicaSelecionada, servicos);                                

                                break;
                            case 3:
                                System.out.println("Passando o dia");
                                for (Atendimento atendimento : clienteLogadoAtualmente.getAtendimentos()){
                                    atendimento.setData(atendimento.getData() - 1);
                                    atendimento.verificarSituacao();
                                }
                                for (Agendamento agendamento : clienteLogadoAtualmente.getAgendamentos()){
                                    agendamento.setData(agendamento.getData() - 1);
                                    agendamento.verificarSituacao();
                                }
                                break;
                            case 4:
                                System.out.println("Cancelando um agendamento");
                                clienteLogadoAtualmente.mostrarAgendamentos();
                                System.out.print("Digite a posicao do agendamento que voce deseja remover: ");
                                int posicaoRemover = scanner.nextInt();
                                scanner.nextLine();
                                clienteLogadoAtualmente.cancelarAgendamento(clienteLogadoAtualmente.getAgendamentoPorIndex(posicaoRemover));

                                break;
                            case 5:
                                System.out.println("Listando agendamentos");
                                clienteLogadoAtualmente.mostrarAgendamentos();
                                break;
                            case 6:
                                System.out.println("Listando atendimentos");
                                clienteLogadoAtualmente.mostrarAtendimentos();
                                break;
                                
                            case 7:
                                System.out.println("Realizando compras");
                                System.out.println("Escolha uma loja:");
                                for (int i = 0; i < lojasExistentes.size(); i++) {
                                    System.out.println(i + " - " + lojasExistentes.get(i).getNome());
                                }
                                                               

                                int lojaIndex = scanner.nextInt();
                                scanner.nextLine(); 

                                Loja loja = lojasExistentes.get(lojaIndex);

                                System.out.println("Produtos disponíveis na loja " + loja.getNome() + ":");
                                List<Produto> produtos = loja.getProdutos();
                                for (int i = 0; i < produtos.size(); i++) {
                                    Produto produto = produtos.get(i);
                                    System.out.println(i + " -  " + produto.getNome() + " - R$" + produto.getPreco() + " (Estoque: " + produto.getQuantidade() + ")");
                                }

                                // Escolher produtos e quantidades
                                List<Produto> produtosSelecionados = new ArrayList<>();
                                List<Integer> quantidades = new ArrayList<>();

                                while (true) {
                                    System.out.print("Digite o número do produto para adicionar ao carrinho (ou -1 para finalizar): ");
                                    int produtoEscolhido = scanner.nextInt();
                                    scanner.nextLine(); 

                                    if (produtoEscolhido == -1) break;

                                    Produto produtoSelecionado = produtos.get(produtoEscolhido);

                                    System.out.print("Digite a quantidade: ");
                                    int quantidade = scanner.nextInt();
                                    scanner.nextLine(); 

                                    if (quantidade <= 0 || quantidade > produtoSelecionado.getQuantidade()) {
                                        System.out.println("Quantidade inválida.");
                                        continue;
                                    }

                                    produtosSelecionados.add(produtoSelecionado);
                                    quantidades.add(quantidade);
                                }

                                Compra compra = clienteLogadoAtualmente.criarCompra();
                                for (int i = 0; i < produtosSelecionados.size(); i++) {
                                    Produto produto = produtosSelecionados.get(i);
                                    int quantidade = quantidades.get(i);
                                    clienteLogadoAtualmente.adicionarProdutoNaCompra(compra, produto, quantidade, loja);
                                }

                                compra.realizarPagamento();
                                System.out.println("Compra finalizada com sucesso!");
                                break;
                            case 8: 
                                System.out.println("Seus pets: ");
                                for (Animal pet : clienteLogadoAtualmente.getPets()) {
                                    pet.printar();
                                    System.out.println("\n");
                                }
                                break;

                            case 9:
                                System.out.println("Saindo da conta do cliente: " + clienteLogadoAtualmente.getNome());
                                break;

                            default:
                                System.out.println("Opção inválida! Tente novamente.");
                        }

                    } while (opcaoCliente != 9);

                    break;
                case 4:
                    System.out.println("Prestadores existentes: ");
                    for (int i = 0; i < prestadoresExistentes.size(); i++) {
                        System.out.println(i + ". " + prestadoresExistentes.get(i).getNome());
                    }

                    System.out.print("Digite o numero do prestador que voce quer logar: ");
                    int prestadorLogar = scanner.nextInt();
                    System.out.println("");

                    prestadorLogadoAtualmente = prestadoresExistentes.get(prestadorLogar);
                    System.out.println("Agora voce esta logado como: " + prestadorLogadoAtualmente.getNome());


                    int opcaoPrestador;
                    do {
                        
                        // Opcoes do Prestador de Servico
                        System.out.println("\nMenu do Prestador: " + prestadorLogadoAtualmente.getNome());
                        System.out.println("1. Cadastrar uma Loja");
                        System.out.println("2. Cadastrar uma Clinica");
                        System.out.println("3. Adicionar Produtos estoque");
                        System.out.println("4. Listar Agendamentos");
                        System.out.println("5. Cancelar Agendamento");
                        System.out.println("6. Adiar Agendamento");
                        System.out.println("7. Listar Clinicas");
                        System.out.println("8. Listar Lojas");
                        System.out.println("9. Deslogar do prestador\n");
                        System.out.print("Escolha uma opção: ");
                        
                        opcaoPrestador = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("");

                        switch (opcaoPrestador) {
                            case 1:
                                System.out.println("Cadastrando uma Loja:");
                                System.out.print("Digite o nome: ");
                                String nomeLoja = scanner.nextLine();

                                System.out.print("Digite o CNPJ: ");
                                String CNPJ = scanner.nextLine();

                                Loja loja = estabelecimentoFactory.criarLoja(nomeLoja, CNPJ);
                                prestadorLogadoAtualmente.addEstabelecimento(loja);
                                lojasExistentes.add(loja);

                                break;
                            case 2:
                                System.out.println("Cadastrando uma Loja:");
                                System.out.print("Digite o nome: ");
                                String nomeClinica = scanner.nextLine();

                                System.out.print("Digite o CNPJ: ");
                                String CNPJ2 = scanner.nextLine();

                                Clinica clinica = estabelecimentoFactory.criarClinica(nomeClinica, CNPJ2);
                                prestadorLogadoAtualmente.addEstabelecimento(clinica);
                                clinicasExistentes.add(clinica);
                                break;
                            case 3:
                                prestadorLogadoAtualmente.listarLojas();

                                System.out.print("Digite o número da loja onde deseja adicionar o produto: ");
                                int indiceLoja = scanner.nextInt();
                                scanner.nextLine();
                            
                            
                                Loja lojaSelecionada = prestadorLogadoAtualmente.getLojaPorIndex(indiceLoja);
                            
                                System.out.println("Adicionando produto na Loja: "+ lojaSelecionada.getNome());
                                System.out.print("Digite o nome: ");
                                String nomeProduto = scanner.nextLine();

                                System.out.print("Digite a quantidade: ");
                                int quantidadeProduto = scanner.nextInt();
                                scanner.nextLine();

                                System.out.print("Digite o preco: ");
                                double precoProduto =  scanner.nextDouble();
                                scanner.nextLine();

                                Produto produto = new Produto(precoProduto, quantidadeProduto, nomeProduto);

                                lojaSelecionada.adicionarProduto(produto);

                                System.out.println("Produto adicionado com sucesso na loja: " + lojaSelecionada.getNome());
                                break;
                            case 4:
                                prestadorLogadoAtualmente.listarClinicas();
                                System.out.print("Selecione a sua clinica que voce deseja listar os agendamentos: ");
                                int posicaoClinica = scanner.nextInt();

                                prestadorLogadoAtualmente.listarConsultasClinica(posicaoClinica);

                                break;
                            case 5:
                                prestadorLogadoAtualmente.listarClinicas();
                                System.out.print("Selecione a sua clinica que voce deseja cancelar um agendamento: ");
                                int posicaoClinicaCancelar = scanner.nextInt();

                                prestadorLogadoAtualmente.listarConsultasClinica(posicaoClinicaCancelar);
                                System.out.print("Selecione o agendamento que voce deseja cancelar: ");
                                int posicaoAgendamentoCancelar = scanner.nextInt();

                                // deleteConsulta
                                Clinica clinicaCancelarConsulta = prestadorLogadoAtualmente.getClinicaPorIndex(posicaoClinicaCancelar);
                                Consulta consultaCancelar = clinicaCancelarConsulta.getConsultaPorIndex(posicaoAgendamentoCancelar);
                                clinicaCancelarConsulta.deleteConsulta(consultaCancelar);
                                break;
                            case 6:
                                prestadorLogadoAtualmente.listarClinicas();
                                System.out.print("Selecione a sua clinica que voce deseja adiar um agendamento: ");
                                int posicaoClinicaAdiar = scanner.nextInt();

                                prestadorLogadoAtualmente.listarConsultasClinica(posicaoClinicaAdiar);
                                System.out.print("Selecione o agendamento que voce deseja adiar: ");
                                int posicaoAgendamentoAdiar = scanner.nextInt();

                                // updateConsulta
                                System.out.print("Adiamento - Digite o novo dia para remarcar essa consulta: ");
                                int novoDiaAdiar = scanner.nextInt();
                                Clinica clinicaAdiarConsulta = prestadorLogadoAtualmente.getClinicaPorIndex(posicaoClinicaAdiar);
                                Consulta consultaAdiar = clinicaAdiarConsulta.getConsultaPorIndex(posicaoAgendamentoAdiar);
                                clinicaAdiarConsulta.updateConsulta(consultaAdiar, novoDiaAdiar);

                                break;
                            case 7:
                                System.out.println("Listando suas clinicas: ");
                                prestadorLogadoAtualmente.listarClinicas();
                                break;

                            case 8:
                                System.out.println("Listando suas lojas: ");
                                prestadorLogadoAtualmente.listarLojas();
                                break;

                            case 9: 
                                System.out.println("Saindo da conta do prestador: " + prestadorLogadoAtualmente.getNome());
                                break;
                            default:
                                System.out.println("Opção inválida! Tente novamente.");
                        }

                    } while (opcaoPrestador != 9);

                    break;
                case 5:
                    System.out.println("Saindo do sistema com sucesso!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }


        } while (opcaoInicial != 5);

        scanner.close();
    }

        /*
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
    }*/
}
