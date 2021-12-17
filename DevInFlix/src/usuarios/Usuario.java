package usuarios;

import java.util.List;

import filmes.Filme;

public class Usuario {
	private String nome;
	private String dataNascimento;
	private String endereco;
	
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
}
