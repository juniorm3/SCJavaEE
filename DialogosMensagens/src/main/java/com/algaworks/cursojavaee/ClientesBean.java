package com.algaworks.cursojavaee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ClientesBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Cliente> clientes = new ArrayList<>();
	private Cliente clienteSelecionado;

	public ClientesBean() {
		Cliente cliente = new Cliente("João da Silva", "34 999-000");
		clientes.add(cliente);

		cliente = new Cliente("Maria Abadia Pereira", "11 1234-5678");
		clientes.add(cliente);

		cliente = new Cliente("Sebastião Moreira Júnior", "34 3333-1111");
		clientes.add(cliente);
	}

	public void removerCliente() {
		clientes.remove(clienteSelecionado);
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public Cliente getClienteSelecionado() {
		return clienteSelecionado;
	}

	public void setClienteSelecionado(Cliente clienteSelecionado) {
		this.clienteSelecionado = clienteSelecionado;
	}

}
