package com.example.demo.model;

public class Tranferencia {
	private Conta contaOrigem;
	private Conta contaDestino;
	private Double valor;
	

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Tranferencia(Conta contaOrigem, Conta contaDestino) {
		super();
		this.contaOrigem = contaOrigem;
		this.contaDestino = contaDestino;
	}
	
	public Conta getContaOrigem() {
		return contaOrigem;
	}


	public void setContaOrigem(Conta contaOrigem) {
		this.contaOrigem = contaOrigem;
	}


	public Conta getContaDestino() {
		return contaDestino;
	}


	public void setContaDestino(Conta contaDestino) {
		this.contaDestino = contaDestino;
	}
	
	public boolean transferir(){
		if(contaOrigem.getSaldo() >= this.valor) {
			contaDestino.setSaldo(contaDestino.getSaldo() + this.valor);
			contaOrigem.setSaldo(contaOrigem.getSaldo() - this.valor);
			return true;
		}else {
			System.out.println("Limite não autorizado para transferência!!!");
		}
	
		return false;
	}

	@Override
	public String toString() {
		return "Tranferencia [contaOrigem=" + contaOrigem.toString() + ", contaDestino=" + contaDestino.toString() + ", valor=" + valor + "]";
	}
	
	
	
}
