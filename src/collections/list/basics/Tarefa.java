package collections.list.basics;

public class Tarefa {
    private final String descricao;

    public Tarefa(String des){
        this.descricao = des;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
