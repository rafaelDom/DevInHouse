package com.example.demo.model;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public class Cliente {

    @NotNull @NotEmpty
    private String nome;

    @NotNull @NotEmpty
    private String cpf;

    private List<String> nomesClientes;

    public Cliente(String nome, String cpf, List<String> nomesClientes) {
        this.nome = nome;
        this.cpf = cpf;
        this.nomesClientes = nomesClientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

	public String getcpf() {
		return cpf;
	}

	public void setcpf(String cpf) {
		this.cpf = cpf;
	}

	public List<String> getNomesClientes() {
		return nomesClientes;
	}

	public void setNomesClientes(List<String> nomesClientes) {
		this.nomesClientes = nomesClientes;
	}




}

