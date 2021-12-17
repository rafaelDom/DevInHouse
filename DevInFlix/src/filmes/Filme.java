package filmes;

public class Filme {
	private String nome;
	private String sinopse;
	private String link;
	private Enum<Genero> genero;
	
	public Filme(String nome, String sinopse, String link, Enum<Genero> genero) {
		super();
		this.nome = nome;
		this.sinopse = sinopse;
		this.link = link;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSinopse() {
		return sinopse;
	}
	
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public Enum<Genero> getGenero() {
		return genero;
	}

	public void setGenero(Enum<Genero> genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Filme [nome=" + nome + ", sinopse=" + sinopse + ", link=" + link + ", genero=" + genero + "]";
	}
	
	
}
