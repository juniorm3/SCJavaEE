package com.algaworks.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class PesquisaClientesBean {

	private List<Cliente> clientesFiltrados;

	public PesquisaClientesBean() {
		clientesFiltrados = new ArrayList<>();

		Cliente cliente1 = new Cliente("Supermercado João das Couves Ltda", "Jurídica", "02.493.738/0001-83");

		Cliente cliente2 = new Cliente("Maria Conceição da Abadia", "Física", "045.938.553-99");

		Cliente cliente3 = new Cliente("Supermercado Preço Bom Ltda", "Jurídica", "08.111.344/0001-12");

		clientesFiltrados.add(cliente1);
		clientesFiltrados.add(cliente2);
		clientesFiltrados.add(cliente3);
	}

	public List<Cliente> getClientesFiltrados() {
		return clientesFiltrados;
	}
}
