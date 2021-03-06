package usuarios;

import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import filmes.Filme;
import filmes.Genero;
import financeiro.Financeiro;
import recomendacoes.RecomendaFilme;

public class Usuario {
	private String cpf;
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
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
		System.out.println(usuario.getNome() + " estou te recomendando esse filme: " + filme.getNome() + " porque ele ? excelente!!!");
	}
	
	public void sugerirFilmesPlataforma(List<Filme> filmes) {
		System.out.println("Os seguintes filmes foram sugeridos para plataforma:");
		
		for(Filme filme:filmes) {
			System.out.println(filme.toString());
		}	
		
	}
	
	/*
	 	usu?rio pode sugerir apenas UM filme num per?odo de 1 m?s, 
	  
	 */
	public void sugerirFilmePlataforma(RecomendaFilme filme) {
		System.out.println("Recomendar filme para plataforma...");

		boolean permitidoRecomendarFilme = true;	
		
		if(getFilmesRecomendados().size() > 0) {
			for(RecomendaFilme filmeRecomendado:getFilmesRecomendados()) {
				Period period = Period.between(filmeRecomendado.getDataRecomendacao(), filme.getDataRecomendacao());
				int qtdeMes = period.getMonths();
				if(qtdeMes <= 0) {
					System.out.println("N?o permitido recomendar, pois j? tem uma recomenda??o feita no ?ltimo m?s!!!");
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
		List<String> generosContabilizados = new ArrayList<String>();
		int qtdeVezesAssistidoPorGenero = 0;
		List <String> generoMaisAssistido = new ArrayList<String>();
		
		for(Filme filme:filmesAssistidos) {
			if(!generosContabilizados.contains(filme.getGenero().toString())) {
				int qtdeVezesAssistidoPorGeneroAux = totalGenero(filme.getGenero().toString());
				if(qtdeVezesAssistidoPorGenero <= qtdeVezesAssistidoPorGeneroAux) {
					qtdeVezesAssistidoPorGenero = qtdeVezesAssistidoPorGeneroAux;
					generoMaisAssistido.add(filme.getGenero().toString());
				}
				generosContabilizados.add(filme.getGenero().toString());
			}
		}
		
		if(qtdeVezesAssistidoPorGenero > 0 && generoMaisAssistido.size() > 0) {
			if(generoMaisAssistido.size() == 1) {
				System.out.println("O genero mais assistido ?: " + generoMaisAssistido + " ele foi assistido " + qtdeVezesAssistidoPorGenero + " vezes!!!");
			}else {
				for(String genero:generoMaisAssistido) {
					System.out.println("O genero mais assistido ?: " + genero + " ele foi assistido " + qtdeVezesAssistidoPorGenero + " vezes!!!");
				}
			}
		}else {
			System.out.println("N?o foi poss?vel verificar o filme mais assistido por genero!!!");
		}
	}
	
	public int totalGenero(String generoFilme) {
		int contador = 0;
		for(Filme filme:filmesAssistidos) {
			if(filme.getGenero().toString().equals(generoFilme)) {
				contador = contador + 1;
			}
		}
		return contador;
	}
}



