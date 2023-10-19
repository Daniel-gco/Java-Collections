package collections.list.basics;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private final List<Item> carrinhoCompras;

    public CarrinhoCompras() {
        carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : carrinhoCompras) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        carrinhoCompras.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item i : carrinhoCompras) {
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItem() {
        System.out.println(carrinhoCompras);
    }

    public static void main(String[] args) {
        CarrinhoCompras meuCarrinho = new CarrinhoCompras();

        meuCarrinho.exibirItem();

        meuCarrinho.adicionarItem("Iphone 15", 15670, 3);
        meuCarrinho.adicionarItem("Iphone 13 pro", 7000, 2);
        meuCarrinho.exibirItem();
        System.out.println(meuCarrinho.calcularValorTotal());
        meuCarrinho.removerItem("Iphone 15");
        meuCarrinho.exibirItem();
    }
}
