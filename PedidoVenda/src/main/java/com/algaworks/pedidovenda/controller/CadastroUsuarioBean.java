package com.algaworks.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CadastroUsuarioBean {

	private List<String> grupos;

	public CadastroUsuarioBean() {
		grupos = new ArrayList<>();
		grupos.add("Auxiliares");
		grupos.add("Vendedores");
	}

	public List<String> getGrupos() {
		return grupos;
	}
}
