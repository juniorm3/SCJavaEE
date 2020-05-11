package com.algaworks.pedidovenda.controller;

public class Cliente {

	private String nome;
	private String tipo;
	private String documento;

	public Cliente(String nome, String tipo, String documento) {
		this.nome = nome;
		this.tipo = tipo;
		this.documento = documento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

}
