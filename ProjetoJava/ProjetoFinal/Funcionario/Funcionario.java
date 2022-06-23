package Funcionario;

import Entidades.Pessoa;

public class Funcionario extends Pessoa {
    private String matricula;

    public Funcionario(String cpf, String nome, String cell, String endereco, String matricula, int id) {
        super(cpf, nome, cell, endereco, id);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
