package com.example.demo.model;

public class Conta {
	private Integer conta = 0;
	private Double saldo;
	private Cliente cliente;
	
	
	
	public Conta(Double saldo, Cliente cliente) {
		super();
		this.conta = 0;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	public Integer getConta() {
		return conta;
	}
	public void setConta(Integer conta) {
		this.conta = conta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public boolean sacar(Double valor) {
		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}
		return false;
	}

	public boolean depositar(Double valor) {
		if(valor > 0) {
			this.setSaldo(this.getSaldo() + valor);
			return true;
		}
		
		return false;
	}
	
	
	@Override
	public String toString() {
		return "Conta [conta=" + conta + ", saldo=" + saldo + ", cliente=" + cliente.getcpf() + "]";
	}	
	
}
