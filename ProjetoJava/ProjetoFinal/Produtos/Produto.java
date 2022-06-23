package Produtos;

//Criando a entidade 'Produto'
public class Produto {

    // Atribuindo produtos com encapsulamento
    private String nome;
    private double preco;
    private int id;
    private int quantia;

    // Criação do 'Construtor'pradão
    public Produto() {
    }

    // Criação dos 'get' e 'set'
    public int getQuantia() {
        return quantia;
    }

    public void setQuantia(int quantia) {
        this.quantia = quantia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
