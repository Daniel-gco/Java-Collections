package collections.list.pesquisa;

public class Livro {
  private final String titulo;
  private final String autor;
  private final int anoLancamento;

  public Livro(String titulo, String autor, int ano){
    this.titulo = titulo;
    this.autor = autor;
    this.anoLancamento = ano;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public int getAnoLancamento() {
    return anoLancamento;
  }

  public static void main(String[] args) {
    Livro oSenhorDosAneis = new Livro("O Senhor dos Anéis", "J.R.Tolkien", 1950);
  }
}
