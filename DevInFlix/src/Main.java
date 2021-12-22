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

		Usuario usuario2 = new Usuario("Usuario2", "01/01/2001", "Rua XPTO n 186");
		Usuario usuario3 = new Usuario("Usuario3", "01/01/2001", "Rua XPTO n 186");
		Usuario usuario4 = new Usuario("Usuario4", "01/01/2001", "Rua XPTO n 186");
		Usuario usuario5 = new Usuario("Usuario5", "01/01/2001", "Rua XPTO n 186");
		Usuario usuario6 = new Usuario("Usuario6", "01/01/2001", "Rua XPTO n 186");
		Usuario usuario7 = new Usuario("Usuario7", "01/01/2001", "Rua XPTO n 186");
		Usuario usuario8 = new Usuario("Usuario8", "01/01/2001", "Rua XPTO n 186");
		Usuario usuario9 = new Usuario("Usuario9", "01/01/2001", "Rua XPTO n 186");
		Usuario usuario10 = new Usuario("Usuario10", "01/01/2001", "Rua XPTO n 186");
		Usuario usuario11 = new Usuario("Usuario11", "01/01/2001", "Rua XPTO n 186");
		Usuario usuario12 = new Usuario("Usuario12", "01/01/2001", "Rua XPTO n 186");
		Usuario usuario13 = new Usuario("Usuario13", "01/01/2001", "Rua XPTO n 186");
		Usuario usuario14 = new Usuario("Usuario14", "01/01/2001", "Rua XPTO n 186");
		Usuario usuario15 = new Usuario("Usuario15", "01/01/2001", "Rua XPTO n 186");
		
		
		
		usuario1.assistirFilme(filme1);
		usuario1.assistirFilme(filme1);
		usuario1.assistirFilme(filme1);
		usuario1.assistirFilme(filme1);
		usuario1.assistirFilme(filme2);
		usuario1.assistirFilme(filme2);
		usuario1.assistirFilme(filme2);
		usuario1.assistirFilme(filme2);
		usuario1.assistirFilme(filme3);
		usuario1.getGeneroFilmeMaisAssitido();
		
		
		usuario2.assistirFilme(filme1);
		usuario3.assistirFilme(filme2);
		usuario4.assistirFilme(filme3);
		usuario5.assistirFilme(filme3);
		usuario6.assistirFilme(filme2);
		usuario7.assistirFilme(filme2);
		usuario8.assistirFilme(filme2);
		usuario9.assistirFilme(filme2);
		usuario10.assistirFilme(filme3);
		
		
		
		
		/*
		TESTE PARA O EXERCICIO [M1S03] - Ex 7 - O melhor catálogo de filmes++
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
