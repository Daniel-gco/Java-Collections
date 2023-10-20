package collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  private final List<Livro> catalogoLivros;

  public CatalogoLivros() {
    this.catalogoLivros = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao){
    catalogoLivros.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livrosPorAutor = new ArrayList<>();
    if(!catalogoLivros.isEmpty()) {
      for(Livro l : catalogoLivros) {
        if (l.getAutor().equalsIgnoreCase(autor)) {
          livrosPorAutor.add(l);
        }
      }
    }
    return livrosPorAutor;
  }

  public List<Livro> pesquisaPorIntervaloAno(int anoInicial, int anoFinal) {
    List<Livro> livrosPorAno = new ArrayList<>();
    if(!catalogoLivros.isEmpty()){
      for(Livro l : catalogoLivros) {
        if (l.getAnoLancamento() <= anoInicial && l.getAnoLancamento() <= anoFinal){
          livrosPorAno.add(l);
        }
      }
    }
    return livrosPorAno;
  }

  public Livro pesquisarPorTitulo(String titulo) {
    Livro livroEncontrado = null;
    if(!catalogoLivros.isEmpty()) {
      for (Livro l : catalogoLivros) {
        if (l.getTitulo().equalsIgnoreCase(titulo)) {
          livroEncontrado = l;
          break;
        }
      }
    }
    return livroEncontrado;
  }
}
