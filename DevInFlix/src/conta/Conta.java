package conta;

import usuarios.Usuario;

public class Conta {
	private String email;
	private String senha;
	private String statusPagamento;
	private Usuario usuario;
	

	
	public Conta(String email, String senha, String statusPagamento, Usuario usuario) {
		super();
		this.email = email;
		this.senha = senha;
		this.statusPagamento = statusPagamento;
		this.setUsuario(usuario);
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getStatusPagamento() {
		return statusPagamento;
	}
	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
