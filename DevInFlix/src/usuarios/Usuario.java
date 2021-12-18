package usuarios;

import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import filmes.Filme;
import filmes.Genero;
import recomendacoes.RecomendaFilme;

public class Usuario {
	private String nome;
	private String dataNascimento;
	private String endereco;
	private List<RecomendaFilme> filmesRecomendados = new ArrayList<>();
	private List<Filme> filmesAssistidos = new ArrayList<>();

	public List<Filme> getFilmesAssistidos() {
		return filmesAssistidos;
	}

	public List<RecomendaFilme> getFilmesRecomendados() {
		return filmesRecomendados;
	}

	public Usuario(String nome, String dataNascimento, String endereco) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void curtirFilme(Filme filme) {
		System.out.println("Filme curtido: " + filme.getNome());
	}
	
	public void descurtirFilme(Filme filme) {
		System.out.println("Filme descurtido: " + filme.getNome());
	}
	
	public void indicarFilme(Usuario usuario, Filme filme) {
		System.out.println(usuario.getNome() + " estou te recomendando esse filme: " + filme.getNome() + " porque ele é excelente!!!");
	}
	
	public void sugerirFilmesPlataforma(List<Filme> filmes) {
		System.out.println("Os seguintes filmes foram sugeridos para plataforma:");
		
		for(Filme filme:filmes) {
			System.out.println(filme.toString());
		}	
		
	}
	
	/*
	 	usuário pode sugerir apenas UM filme num período de 1 mês, 
	  
	 */
	public void sugerirFilmePlataforma(RecomendaFilme filme) {
		System.out.println("Recomendar filme para plataforma...");

		boolean permitidoRecomendarFilme = true;	
		
		if(getFilmesRecomendados().size() > 0) {
			for(RecomendaFilme filmeRecomendado:getFilmesRecomendados()) {
				Period period = Period.between(filmeRecomendado.getDataRecomendacao(), filme.getDataRecomendacao());
				int qtdeMes = period.getMonths();
				if(qtdeMes <= 0) {
					System.out.println("Não permitido recomendar, pois já tem uma recomendação feita no último mês!!!");
					permitidoRecomendarFilme = false;
					break;
				}
			}
		}else {
			System.out.println("Primeiro filme sendo recomendado para plataforma agora!!!");
		}
		
		if(permitidoRecomendarFilme) {
			filmesRecomendados.add(filme);
			System.out.println("Filme recomendado com sucesso!!!");
			System.out.println(filme.toString());
		}
		
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", dataNascimento=" + dataNascimento + ", endereco=" + endereco
				+ "]";
	}
	
	
	public void assistirFilme(Filme filme) {
		System.out.println("Assistir o Filme: " + filme.toString());
		if(getFilmesAssistidos().size() > 0) {
			filmesAssistidos.add(filme);
		}else {
			System.out.println("Assistindo o primeiro filme!!!");
			filmesAssistidos.add(filme);
		}	
	}
	
	public void getGeneroFilmeMaisAssitido() {

		
	}
	
	
}



