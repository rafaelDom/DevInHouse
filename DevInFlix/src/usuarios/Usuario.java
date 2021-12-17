package usuarios;

import filmes.Filme;

public class Usuario {
	private String nome;
	private String dataNascimento;
	private String endereco;
	
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
}
