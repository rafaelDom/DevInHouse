package catalogo;

import java.util.ArrayList;
import java.util.List;

import filmes.Filme;

public class CatalogoFilme {
	List<Filme> catalogoFilmes = new ArrayList<Filme>();

	public List<Filme> getFilmes() {
		return catalogoFilmes;
	}
	
	public void adicionarFilmeCatalogo(Filme filme) {
		catalogoFilmes.add(filme);
	}
	
}
