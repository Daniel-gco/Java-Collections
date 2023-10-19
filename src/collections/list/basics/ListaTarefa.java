package collections.list.basics;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private final List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasPararemover = new ArrayList<>();

        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasPararemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasPararemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa minhaLista = new ListaTarefa();

        System.out.println(minhaLista.obterNumeroTotalTarefas());
        minhaLista.adicionarTarefa("Terminar o bootcamp");
        minhaLista.adicionarTarefa("Terminar o bootcamp");
        minhaLista.adicionarTarefa("Terminar o bootcamp");
        minhaLista.adicionarTarefa("Terminar o curso");
        System.out.println(minhaLista.obterNumeroTotalTarefas());
        minhaLista.obterDescricoesTarefas();
        minhaLista.removerTarefa("Terminar o curso");
        minhaLista.obterDescricoesTarefas();
        System.out.println(minhaLista.obterNumeroTotalTarefas());
    }
}
