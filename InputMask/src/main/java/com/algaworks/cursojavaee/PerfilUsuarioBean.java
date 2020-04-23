package com.algaworks.cursojavaee;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class PerfilUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String telefone;
	private String telefoneComerecial;
	private String matricula;

	public void atualizar() {
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Telefone comercial: " + this.telefoneComerecial);
		System.out.println("Matriula: " + this.matricula);

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Pefil atualizado!"));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefoneComerecial() {
		return telefoneComerecial;
	}

	public void setTelefoneComerecial(String telefoneComerecial) {
		this.telefoneComerecial = telefoneComerecial;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
