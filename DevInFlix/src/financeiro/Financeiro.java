package financeiro;

import usuarios.Usuario;

public class Financeiro {
	private boolean inadiplente;
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public boolean isInadiplente() {
		return inadiplente;
	}

	public void setInadiplente(boolean inadiplente) {
		this.inadiplente = inadiplente;
	}
	
	public void temPendenciaFinanceira() {
		setInadiplente(true);
	}
	
	
}
