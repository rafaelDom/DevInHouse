package recomendacoes;

import java.time.LocalDate;

import filmes.Filme;
import filmes.Genero;
import usuarios.Usuario;

public class RecomendaFilme extends Filme{
	private LocalDate dataRecomendacao;
	private Usuario usuario;

	public RecomendaFilme(String nome, String sinopse, String link, Enum<Genero> genero, LocalDate data, Usuario usuario) {
		super(nome, sinopse, link, genero);
		this.dataRecomendacao = data;
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public LocalDate getDataRecomendacao() {
		return dataRecomendacao;
	}

	public void setDataRecomendacao(LocalDate dataRecomendacao) {
		this.dataRecomendacao = dataRecomendacao;
	}

	@Override
	public String toString() {
		return "RecomendaFilme [dataRecomendacao=" + dataRecomendacao + ", filme=" + super.toString() + ", usuario=" + usuario.toString() + "]";
	}

}
