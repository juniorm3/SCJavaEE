package com.algaworks.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class PesquisaUsuariosBean {

	private List<Usuario> usuariosFiltrados;

	public PesquisaUsuariosBean() {
		usuariosFiltrados = new ArrayList<>();

		Usuario usuario1 = new Usuario("João das Couves", "joaodas_couves42@hotmail.com");

		Usuario usuario2 = new Usuario("Maria Abadia das Couves", "mariaabadiadascouves2013@gmail.com");

		Usuario usuario3 = new Usuario("João das Couves Júnior", "junior_couves_joao@yahoo.com.br");

		usuariosFiltrados.add(usuario1);
		usuariosFiltrados.add(usuario2);
		usuariosFiltrados.add(usuario3);
	}

	public List<Usuario> getUsuariosFiltrados() {
		return usuariosFiltrados;
	}

}
