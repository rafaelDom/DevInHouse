package catalogo;

import java.util.ArrayList;
import java.util.List;

import comentario.Comentario;
import filmes.Filme;

public class CatalogoFilme {
	List<Filme> catalogoFilmes = new ArrayList<Filme>();
	private Comentario comentario;
	private Filme filme;
	
	

	public CatalogoFilme(Comentario comentario, Filme filme) {
		super();
		this.setComentario(comentario);
		this.filme = filme;
		adicionarFilmeCatalogo(this.filme);
	}

	public List<Filme> getFilmes() {
		return catalogoFilmes;
	}
	
	public void adicionarFilmeCatalogo(Filme filme) {
		catalogoFilmes.add(filme);
	}

	public Comentario getComentario() {
		return comentario;
	}

	public void setComentario(Comentario comentario) {
		this.comentario = comentario;
	}
	
}
