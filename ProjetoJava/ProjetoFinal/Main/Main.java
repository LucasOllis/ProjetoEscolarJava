package Main;

//Importamdo
import java.util.Scanner;

import Comparador.comparetorCrescente;
import Comparador.comparetorDecrescente;
import Entidades.Pessoa;
import Produtos.Produto;
import Repositorio.Repositor;
import Repositorio2.Repositor2;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static Scanner input = new Scanner(System.in);
    static Repositor rp = new Repositor();
    static Repositor2 rpro = new Repositor2();

    public static void editar() {
        List<Pessoa> listar = new ArrayList<>();
        List<Produto> listar2 = new ArrayList<>();

        listar2 = rpro.cardapio();
        listar = rp.listarPessoas();

        System.out.println("***Menu de editar***\nDigite 1 para editar uma pessoa\nDigite 2 para editar um produto");
        int confirmacao = input.nextInt();
        boolean encontrar = false;
        if (confirmacao == 1) {
            System.out.println("Digite o ID da pessoa para começar a edição: ");
            int procurarId = input.nextInt();
            for (Pessoa pessoa : listar) {
                if (pessoa.getId() == procurarId) {
                    System.out.println("Pessoa encontrada, exibindo dados: ");

                    System.out.println("Nome: " + pessoa.getNome());
                    System.out.println("CPF: " + pessoa.getCpf());
                    System.out.println("Telefone: " + pessoa.getCell());
                    System.out.println("Endereço: " + pessoa.getEndereco());
                    System.out.println("ID: " + pessoa.getId() + "\n");
                    System.out.println("Começando a edição... ");

                    System.out.print("Digite o novo Nome : ");
                    String nome = input.nextLine();
                    nome = input.nextLine();

                    System.out.print("Digite o novo Cpf: ");
                    String Cpf = input.nextLine();

                    System.out.print("Digite o novo numero de telefone: ");
                    String cell = input.nextLine();

                    System.out.print("Digite o novo endereço: ");
                    String endereco = input.nextLine();

                    // Setando variaveis com os valores passados
                    pessoa.setNome(nome);
                    pessoa.setCpf(Cpf);
                    pessoa.setCell(cell);
                    pessoa.setEndereco(endereco);

                    System.out.println("edição feita, por favor verificar procedimento");
                    encontrar = true;
                    break;
                }
            }
        } else if (confirmacao == 2) {
            System.out.println("Digite o ID do produto para começar a edição: ");
            int procurarId = input.nextInt();
            for (Produto produtos : listar2) {
                if (produtos.getId() == procurarId) {
                    System.out.println("Produto encontrada, exibindo dados: ");

                    System.out.println("Nome: " + produtos.getNome());
                    System.out.println("Preço: " + produtos.getPreco());
                    System.out.println("ID: " + produtos.getId());

                    System.out.println("Começando a edição... ");

                    System.out.print("Digite o novo Nome do produto : ");
                    String nome = input.nextLine();
                    nome = input.nextLine();
                    produtos.setNome(nome);

                    System.out.print("Digite o novo preço do produto : ");
                    double valor = input.nextInt();
                    produtos.setPreco(valor);

                    System.out.println("edição feita, por favor verificar procedimento");
                    encontrar = true;
                    break;
                }
            }
        }
        if (!encontrar) {
            System.out.println("Id não encontrado, repita o preçosso por favor...");
        }

    }

    public static void deletarPessoa() {
        List<Pessoa> listar = new ArrayList<>();

        listar = rp.listarPessoas();

        System.out.println("***Menu de deletar***\nPor favor, insira o ID para que possamos deletar uma pessoa:\n");
        int procurarId = input.nextInt();
        boolean encontrar = false;

        for (Pessoa pessoa : listar) {
            if (pessoa.getId() == procurarId) {
                System.out.println("Pessoa encontrada, exibindo dados: ");

                System.out.println("Nome: " + pessoa.getNome());
                System.out.println("CPF: " + pessoa.getCpf());
                System.out.println("Telefone: " + pessoa.getCell());
                System.out.println("Endereço: " + pessoa.getEndereco());
                System.out.println("ID: " + pessoa.getId() + "\n");

                System.out.println("VOCÊ DESEJA CONFIRMAR REMOÇÃO ?\nDigite 1 para 'sim'\nDigite 2 para 'não'");
                int confirmacao = input.nextInt();
                if (confirmacao == 1) {

                    System.out.println("Começando a removação... ");
                    listar.remove(pessoa);
                    System.out.println("Remoção feita, por favor verificar procedimento");
                } else if (confirmacao == 2) {
                    System.out.println("Cancelamento da remoção... ");
                    System.out.println("Voltando ao menu inicial");
                } else {
                    System.out.println("ERROR DE DIGITAÇÂO, RETORNANDO AO MENU INICIAL");
                }

                encontrar = true;
                break;
            }
        }
        if (!encontrar) {
            System.out.println("Id não encontrado, repita o preçosso por favor...");
        }
    }

    public static void deletarProduto() {
        List<Produto> listar2 = new ArrayList<>();

        listar2 = rpro.cardapio();

        System.out.println("***Menu de deletar***\nPor favor, insira o ID para que possamos deletar um Produto:\n");
        int procurarId = input.nextInt();
        boolean encontrar = false;

        for (Produto produtos : listar2) {
            if (produtos.getId() == procurarId) {
                System.out.println("Produto encontrada, exibindo dados: ");

                System.out.println("Nome do produto: " + produtos.getNome());
                System.out.println("Valor do produto: R$" + produtos.getPreco());
                System.out.println("ID do produto: " + produtos.getId());
                System.out.println("\n");

                System.out.println("VOCÊ DESEJA CONFIRMAR REMOÇÃO ?\nDigite 1 para 'sim'\nDigite 2 para 'não'");
                int confirmacao = input.nextInt();
                if (confirmacao == 1) {

                    System.out.println("Começando a removação... ");
                    listar2.remove(produtos);
                    System.out.println("Remoção feita, por favor verificar procedimento");
                } else if (confirmacao == 2) {
                    System.out.println("Cancelamento da remoção... ");
                    System.out.println("Voltando ao menu inicial");
                } else {
                    System.out.println("ERROR DE DIGITAÇÂO, RETORNANDO AO MENU INICIAL");
                }

                encontrar = true;
                break;
            }
        }
        if (!encontrar) {
            System.out.println("Id não encontrado, repita o preçosso por favor...");
        }
    }

    // Metodo para fazer o pedido através do ID pessoal
    public static void fazerPedido() {

        // Criando ArrayList
        List<Pessoa> listar = new ArrayList<>();
        List<Produto> listar2 = new ArrayList<>();

        // Atribuição
        listar = rp.listarPessoas();
        listar2 = rpro.cardapio();

        System.out.println(
                "***Bem vindo ao menu de pedidos***\nPor favor, insira seu ID para que possamos registrar o seu pedido:\n");
        int procurarId = input.nextInt();
        boolean encontrar = false;

        // Comparação entre ID: Pessoa
        for (Pessoa pessoa : listar) {
            if (pessoa.getId() == procurarId) {

                System.out.println("ID encontrado, registrando na seguinte conta...\n\n");

                // Exibindo todos os dados da pessoa vinculado ao ID
                System.out.println("Nome: " + pessoa.getNome());
                System.out.println("CPF: " + pessoa.getCpf());
                System.out.println("Telefone: " + pessoa.getCell());
                System.out.println("Endereço: " + pessoa.getEndereco());
                System.out.println("ID: " + pessoa.getId());
                System.out.println(" ");

                System.out.println("*Digite o ID de um dos produtos*");
                cardapio();
                System.out.println("\n");
                int ProcurarProduto = input.nextInt();

                // Comparação entre ID: Produto
                for (Produto produtos : listar2) {
                    if (produtos.getId() == ProcurarProduto) {
                        System.out.println("Produto encontrado, nome do produto: " + produtos.getNome());

                        System.out.println("*Agora digite a quantia que deseja comprar*");
                        int quantia = input.nextInt();
                        produtos.setQuantia(quantia);

                        // Desenvolvimento do calculo
                        System.out.println(
                                "*Você pediu " + quantia + " unidades de " + produtos.getNome() + ".\nPreço total: "
                                        + (quantia * produtos.getPreco()));

                        System.out.println("Registrando comprar no seu ID...\nRegistrado com sucesso !!!");
                    }
                }
                encontrar = true;
                break;
            }
        }
        // Condição de erro
        if (!encontrar) {
            System.out.println("Id não encontrado, repita o preçosso por favor...");
        }

    }

    // Metodo ja preenchido para criar produtos completos
    public static void encherCardapio() {

        Produto produtos1 = new Produto();
        produtos1.setNome("Brigadeiro");
        produtos1.setPreco(12.00);
        produtos1.setId(1);
        rpro.criarProduto(produtos1);

        Produto produtos2 = new Produto();
        produtos2.setNome("Coxinha");
        produtos2.setPreco(15.00);
        produtos2.setId(2);
        rpro.criarProduto(produtos2);

        Produto produtos3 = new Produto();
        produtos3.setNome("Bolo");
        produtos3.setPreco(20.00);
        produtos3.setId(3);
        rpro.criarProduto(produtos3);

        Produto produtos4 = new Produto();
        produtos4.setNome("Suco");
        produtos4.setPreco(8.00);
        produtos4.setId(4);
        rpro.criarProduto(produtos4);

    }

    // Metodo para cadastrar produtos
    public static void cadastarProduto() {

        // iniciando objeto
        Produto produtos = new Produto();
        Random random = new Random();

        System.out.print("Digite o Nome do produto que você deseja cadastrar: ");
        String nome = input.nextLine();
        nome = input.nextLine();
        produtos.setNome(nome);

        System.out.print("Digite o preço do produto para ser comercializado: ");
        double valor = input.nextInt();
        produtos.setPreco(valor);

        System.out.print("Gerando ID do produto... ");
        int id = random.nextInt(1000);
        System.out.print("ID criado...\nSeu Id é: " + id);
        produtos.setId(id);

        // Adicionando ao repositor 'produto' com os valores passados
        rpro.criarProduto(produtos);

        System.out.println("\nProduto(s) cadastrado(s) !!!");

    }

    // Metodo para cadastrar funcionarios
    public static void cadastrarFuncionario() {

        // iniciando objeto
        Pessoa pessoa = new Pessoa(null, null, null, null, 0);
        Random random = new Random();

        System.out.print("Digite o Nome do funcionario: ");
        String nome = input.nextLine();
        nome = input.nextLine();

        System.out.print("Digite o Cpf: ");
        String Cpf = input.nextLine();

        System.out.print("Digite o numero de telefone: ");
        String cell = input.nextLine();

        System.out.print("Digite o endereço: ");
        String endereco = input.nextLine();

        System.out.print("Criando ID... ");
        int id = random.nextInt(1000);
        System.out.print("ID criado...\nSeu Id é: " + id);

        // Setando variaveis com os valores passados
        pessoa.setNome(nome);
        pessoa.setCpf(Cpf);
        pessoa.setCell(cell);
        pessoa.setEndereco(endereco);
        pessoa.setId(id);

        // Adicionando ao repositor 'pessoa' com os valores passados
        rp.criarPessoa(pessoa);

        System.out.println("\nFuncionario cadastrado !!!");

    }

    // Metodo para cadastrar novos clientes
    public static void cadastrarCliente() {

        // iniciando objeto
        Pessoa pessoa = new Pessoa(null, null, null, null, 0);
        Random random = new Random();

        System.out.print("Digite o Nome do Cliente: ");
        String nome = input.nextLine();
        nome = input.nextLine();

        System.out.print("Digite o Cpf: ");
        String Cpf = input.nextLine();

        System.out.print("Digite o numero de telefone: ");
        String cell = input.nextLine();

        System.out.print("Digite o endereço: ");
        String endereco = input.nextLine();

        System.out.print("Criando ID... ");
        int id = random.nextInt(1000);
        System.out.print("ID criado...\nSeu Id é: " + id);

        // Setando variaveis com os valores passados
        pessoa.setNome(nome);
        pessoa.setCpf(Cpf);
        pessoa.setCell(cell);
        pessoa.setEndereco(endereco);
        pessoa.setId(id);
        rp.criarPessoa(pessoa);

        System.out.println("\nCliente cadastrado !!!");

    }

    // Metodo para Listar todas as pessoas cadastradas
    public static void listarPessoas() {
        // Criando ArrayList
        List<Pessoa> listar = new ArrayList<>();

        // Atribuição
        listar = rp.listarPessoas();

        System.out.println("*Exibindo todas as pessoas cadastradas*");

        // Laço de condição 'if'
        if (listar.size() == 0) {
            System.out.println("Não foi encontrado nem uma pessoa cadastrada...");
        }

        // Laço de repetição 'For'
        for (Pessoa pessoa : listar) {

            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("CPF: " + pessoa.getCpf());
            System.out.println("Telefone: " + pessoa.getCell());
            System.out.println(" ");

        }
    }

    // Metodo para exibir 'cardapio' com todos os produtos cadastrados
    public static void cardapio() {

        // Criando ArrayList
        List<Produto> listar = new ArrayList<>();

        // Atribuição
        listar = rpro.cardapio();

        // Laço de repetição 'For'
        for (Produto produtos : listar) {

            System.out.println("Nome do produto: " + produtos.getNome());
            System.out.println("Valor do produto: R$" + produtos.getPreco());
            System.out.println("ID do produto: " + produtos.getId());
            System.out.println("\n");

        }
    }

    public static void ordenar() {
        List<Pessoa> listar = new ArrayList<>();

        listar = rp.listarPessoas();
        Collections.sort(listar, new comparetorCrescente());

        System.out.println("***Começando listagem*** ");
        for (Pessoa pessoa : listar) {
            System.out.println("Listando pessoas pelo nome na ordem Crescente: ");
            System.out.println(pessoa.getNome());
        }

        Collections.sort(listar, new comparetorDecrescente());
        System.out.println("***Começando outra listagem*** ");
        for (Pessoa pessoa : listar) {
            System.out.println("Listando pessoas pelo nome na ordem decrescente: ");
            System.out.println(pessoa.getNome());
        }

    }

    // Metodo para exibir o menu
    public static void menu() {

        // Printando todo o menu principal
        System.out.println("\n### Loja de salgados ###");
        System.out.println("Ola tudo bem ? O que deseja ? \n\n");
        System.out.println("1 - Cadastrar funcionario:");
        System.out.println("2 - Cadastrar cliente:");
        System.out.println("3 - Cadastrar produtos: ");
        System.out.println("4 - Listar pessoas cadastradas:");
        System.out.println("5 - Fazer pedido:");
        System.out.println("6 - Cardapio: ");
        System.out.println("7 - deletar Pessoa: ");
        System.out.println("8 - deletar produto: ");
        System.out.println("9 - editar: ");
        System.out.println("10 - ordenar: ");
        System.out.println("0 - Sair:");
    }

    public static void main(String[] args) {
        // Declarando variaveis
        int opcao;
        boolean sair = false;

        // Chamando metodo
        encherCardapio();

        // Laço de repetição DO-While
        do {
            // Chamando meotodo para printar menu
            menu();

            // Atribuindo valor para variavel
            opcao = input.nextInt();
            System.out.print("\n");

            // Criando estrutura de decisão 'switch' e apresentando suas opções
            switch (opcao) {

                case 1:
                    cadastrarFuncionario();
                    System.out.println("Pressione a tecla 'Enter' para continuar o sistema");

                    // Try-catch criado para tratar erros que podem acontecer dentro do sistema
                    try {
                        System.in.read();
                    } catch (Exception e) {

                    }
                    break;
                case 2:

                    cadastrarCliente();
                    System.out.println("Pressione a tecla 'Enter' para continuar o sistema");
                    try {
                        System.in.read();
                    } catch (Exception e) {

                    }
                    break;
                case 3:

                    cadastarProduto();
                    System.out.println("Pressione a tecla 'Enter' para continuar o sistema");
                    try {
                        System.in.read();
                    } catch (Exception e) {

                    }
                    break;
                case 4:
                    listarPessoas();
                    System.out.println("Pressione a tecla 'Enter' para continuar o sistema");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                    break;

                case 5:
                    fazerPedido();
                    System.out.println("Pressione a tecla 'Enter' para continuar o sistema");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                    break;
                case 6:
                    cardapio();
                    System.out.println("Pressione a tecla 'Enter' para continuar o sistema");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                    break;
                case 7:
                    deletarPessoa();
                    System.out.println("Pressione a tecla 'Enter' para continuar o sistema");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                    break;
                case 8:
                    deletarProduto();
                    System.out.println("Pressione a tecla 'Enter' para continuar o sistema");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                    break;
                case 9:
                    editar();
                    System.out.println("Pressione a tecla 'Enter' para continuar o sistema");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                    break;
                case 10:
                    ordenar();
                    System.out.println("Pressione a tecla 'Enter' para continuar o sistema");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                    break;
                case 0:

                    System.out.println("Obrigado e Volte Sempre!");
                    sair = true;
                    break;
                default:

                    System.out.println("ERROR\n Opcao Inválida!");
                    System.out.println("Pressione a tecla 'Enter' para continuar o sistema");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                    break;
            }
        } while (!sair);
    }
}
