package Comparador;

import java.util.Comparator;

import Entidades.Pessoa;

public class comparetorCrescente implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        if (pessoa1.getNome().compareTo(pessoa2.getNome()) > 0) {
            return 1;
        }

        return -1;
    }

}
