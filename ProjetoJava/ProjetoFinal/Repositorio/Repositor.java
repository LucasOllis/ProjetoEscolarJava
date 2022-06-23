package Repositorio;

//Importando
import Entidades.Pessoa;
import java.util.ArrayList;
import java.util.List;

//Criação do Repositorio  e implemetando metodos
public class Repositor{
    
    List<Pessoa> persons = new ArrayList<>();

    public boolean criarPessoa(Pessoa pessoa) {
        try {
            persons.add(pessoa);
        } catch (Exception e){
            return false;
        }
        return true;
    }

    public List<Pessoa> listarPessoas() {
        return persons;
    }
}


