import java.time.LocalDate;


import filmes.Filme;
import filmes.Genero;
import recomendacoes.RecomendaFilme;
import usuarios.Usuario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Usuario usuario1 = new Usuario("Usuario1", "01/01/2001", "Rua XPTO n 185");
		Filme filme1 = new Filme("Filme1","XXXXX","www.www.com.br/fimes",Genero.ACAO);
		Filme filme2 = new Filme("Filme2","XXXXX","www.www.com.br/fimes",Genero.AVENTURA);
		Filme filme3 = new Filme("Filme3","XXXXX","www.www.com.br/fimes",Genero.COMEDIA);
		usuario1.assistirFilme(filme1);
		usuario1.assistirFilme(filme1);
		usuario1.assistirFilme(filme1);
		usuario1.assistirFilme(filme2);
		usuario1.assistirFilme(filme2);
		usuario1.assistirFilme(filme3);
		usuario1.getGeneroFilmeMaisAssitido();
		
		
		
		
		
		/*
		TESTE PARA O EXERCICIO [M1S03] - Ex 7 - O melhor cat�logo de filmes++
		LocalDate testeData = null;
		LocalDate dataAgr = testeData.now();
		
		Usuario usuario1 = new Usuario("Usuario1", "01/01/2001", "Rua XPTO n 185");
		Filme filme1 = new Filme("Filme1","XXXXX","www.www.com.br/fimes",Genero.ACAO);
		RecomendaFilme recomendaFilme = new RecomendaFilme(filme1.getNome(), filme1.getSinopse(), filme1.getLink(), filme1.getGenero(), dataAgr, usuario1);
		usuario1.sugerirFilmePlataforma(recomendaFilme);
		RecomendaFilme recomendaFilme1 = new RecomendaFilme(filme1.getNome(), filme1.getSinopse(), filme1.getLink(), filme1.getGenero(), dataAgr.plusMonths(1), usuario1);
		usuario1.sugerirFilmePlataforma(recomendaFilme1);
		*/
		
		
		
		/*
		 * EXERCICIO [M1S03] - Ex 6 - Unindo todos os pontos
		Filme filme1 = new Filme("Filme1","XXXXX","www.www.com.br/fimes",Genero.ACAO);
		Filme filme2 = new Filme("Filme2","XXXXX","www.www.com.br/fimes",Genero.AVENTURA);
		Filme filme3 = new Filme("Filme3","XXXXX","www.www.com.br/fimes",Genero.COMEDIA);
		Filme filme4 = new Filme("Filme4","XXXXX","www.www.com.br/fimes",Genero.DRAMA);
		Filme filme5 = new Filme("Filme5","XXXXX","www.www.com.br/fimes",Genero.ACAO);
		Filme filme6 = new Filme("Filme6","XXXXX","www.www.com.br/fimes",Genero.COMEDIA);
		
		Usuario usuario1 = new Usuario("Usuario1", "01/01/2001", "Rua XPTO n 185");
		Usuario usuario2 = new Usuario("Usuario2", "01/01/2001", "Rua XPTO n 186");
		Usuario usuario3 = new Usuario("Usuario3", "01/01/2001", "Rua XPTO n 187");
		Usuario usuario4 = new Usuario("Usuario4", "01/01/2001", "Rua XPTO n 188");
		Usuario usuario5 = new Usuario("Usuario5", "01/01/2001", "Rua XPTO n 189");
		
		
		Filme filmeNovo1 = new Filme("FilmeNovo1","XXXXX","www.www.com.br/fimes",Genero.ACAO);
		Filme filmeNovo2 = new Filme("FilmeNovo2","XXXXX","www.www.com.br/fimes",Genero.ACAO);
		Filme filmeNovo3 = new Filme("FilmeNovo3","XXXXX","www.www.com.br/fimes",Genero.ACAO);
		List<Filme> listaFilme = new ArrayList<Filme>();
		listaFilme.add(filmeNovo1);
		listaFilme.add(filmeNovo2);
		listaFilme.add(filmeNovo3);
		
		usuario1.curtirFilme(filme1);
		usuario1.descurtirFilme(filme2);
		usuario1.indicarFilme(usuario5, filme6);
		usuario1.sugerirFilmesPlataforma(null);
		usuario1.sugerirFilmesPlataforma(listaFilme);
		
		usuario2.curtirFilme(filme3);
		usuario2.descurtirFilme(filme4);
		usuario2.indicarFilme(usuario1, filme3);
		usuario2.sugerirFilmesPlataforma(listaFilme);
		
		usuario3.curtirFilme(filme5);
		usuario3.descurtirFilme(filme6);
		usuario3.indicarFilme(usuario4, filme6);
		usuario3.sugerirFilmesPlataforma(listaFilme);
		*/
	}

}
