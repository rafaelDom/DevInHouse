package financeiro;

import usuarios.Usuario;

public class Financeiro {
	private Usuario usuario;

	
	public Financeiro(Usuario usuario) {
		super();
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
	public boolean isInadiplente() {
		if(verificarPendenciaFinanceira(usuario.getCpf())) {
			return true;
		}
		return false;
	}
	
	public boolean verificarPendenciaFinanceira(String cpf) {
		// TO DO
		return false;
	}
	
	
}
