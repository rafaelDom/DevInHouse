package curtir_descurtir_filme;


import filmes.Filme;
import usuarios.Usuario;

public class CurtirDescurtirFilmeModelo {
	private Usuario usuario;
	private boolean curtiu;
	private Filme filme;
	
	
	
	public CurtirDescurtirFilmeModelo(Usuario usuario, boolean curtiu, Filme filme) {
		super();
		this.usuario = usuario;
		this.curtiu = curtiu;
		this.filme = filme;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public boolean isCurtiu() {
		return curtiu;
	}
	public void setCurtiu(boolean curtiu) {
		this.curtiu = curtiu;
	}
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	
}
