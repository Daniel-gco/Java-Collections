package collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaPessoa {
    private List<Pessoa> listaPessoas;

    public ListaPessoa() {
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> listaPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(listaPorIdade);
        return listaPorIdade;
    }

    public List<Pessoa> ordenaPorAltura() {
        List<Pessoa> listaPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(listaPorAltura, new ComparatorPorAltura() );
        return listaPorAltura;
    }
}
