package com.algaworks.cursojavaee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class PerfilUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String sobre;

	public void atualizar() {
		System.out.println("Sobre: " + this.nome);

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}

	public List<String> completarTexto(String consulta) {
		List<String> resultados = new ArrayList<>();

		if (consulta.startsWith("Ma")) {
			resultados.add("Mario");
			resultados.add("Mario Mariano");
			resultados.add("Mario Mariano Martins");
			resultados.add("Mario Mariano Martins Junior");
		}

		return resultados;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}

}
