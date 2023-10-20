package collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaDeNumeros {
    private final List<Integer> listaInteiro;

    public SomaDeNumeros() {
        this.listaInteiro = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaInteiro.add(numero);
    }

    public int soma() {
        Integer soma = 0;
        if(!listaInteiro.isEmpty()) {
            for (Integer i : listaInteiro) {
                soma += i;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        Integer maiorNumero = 0;
        if(!listaInteiro.isEmpty()){
            maiorNumero = listaInteiro.get(0);
            for (int i : listaInteiro) {
                if (maiorNumero.compareTo(i) > 0) {
                    maiorNumero = i;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        Integer maiorNumero = 0;
        if(!listaInteiro.isEmpty()){
            maiorNumero = listaInteiro.get(0);
            for (int i : listaInteiro) {
                if (maiorNumero.compareTo(i) < 0) {
                    maiorNumero = i;
                }
            }
        }
        return maiorNumero;
    }

    public void exibirNumeros() {
        System.out.println(listaInteiro);
    }

    public static void main(String[] args) {
        SomaDeNumeros novaLista = new SomaDeNumeros();
        novaLista.adicionarNumero(10);
        novaLista.adicionarNumero(11);
        novaLista.adicionarNumero(15);
        novaLista.adicionarNumero(16);
        novaLista.adicionarNumero(1120);
        novaLista.adicionarNumero(1327);
        System.out.println(novaLista.soma());
        System.out.println(novaLista.encontrarMenorNumero());
        System.out.println(novaLista.encontrarMaiorNumero());
        novaLista.exibirNumeros();
    }
}
