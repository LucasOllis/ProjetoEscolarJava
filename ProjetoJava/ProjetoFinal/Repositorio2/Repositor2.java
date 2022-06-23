package Repositorio2;

//Importando
import Produtos.Produto;
import java.util.ArrayList;
import java.util.List;

//Criação do Repositorio  e implemetando metodos
public class Repositor2 {

    List<Produto> produt = new ArrayList<>();

    public boolean criarProduto(Produto produtos) {
        try {
            produt.add(produtos);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<Produto> cardapio() {
        return produt;
    }
}