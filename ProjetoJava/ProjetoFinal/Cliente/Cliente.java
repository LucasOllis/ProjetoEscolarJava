package Cliente;

import Entidades.Pessoa;

public class Cliente extends Pessoa {
    private String ultimaCompra ;

    public Cliente(String cpf, String nome, String cell,String ultimaCompra, String endereco, int id) {
        super(cpf, nome, cell, endereco, id);
        this.ultimaCompra= ultimaCompra;
    }

    public String getUltimaCompra() {
        return ultimaCompra;
    }

    public void setUltimaCompra(String ultimaCompra) {
        this.ultimaCompra = ultimaCompra;
    }

}
