import filmes.Filme;
import usuarios.Usuario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario user1 = new Usuario();
		user1.setNome("Rafael Alberto Domingos");
		
		Filme filme1 = new Filme();
		filme1.setNome("A volta dos que não foram!!!");
		user1.curtirFilme(filme1);
		
		Filme filme2 = new Filme();
		filme2.setNome("Garantindo a garantia!!!");
		user1.descurtirFilme(filme2);
		
		Usuario user2 = new Usuario();
		user2.setNome("Danilo Silva Sauro");
		
		user1.indicarFilme(user2, filme2);
		
	}

}
