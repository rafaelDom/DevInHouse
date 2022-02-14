package recomendacoes;

import java.util.HashSet;
import java.util.Set;

import filmes.Filme;

public class FilmeSugerido {
	 Set<Filme> filmesSugeridos = new HashSet<Filme>();

	public Set<Filme> getFilmesSugeridos() {
		return filmesSugeridos;
	}
	
	public void adicionarFilmeSugerido(Filme filme) {
		filmesSugeridos.add(filme);
	}
	 
}
