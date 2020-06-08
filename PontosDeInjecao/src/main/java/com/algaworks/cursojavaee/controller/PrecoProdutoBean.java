package com.algaworks.cursojavaee.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.algaworks.cursojavaee.service.CalculadoraPreco;

@Named("meuBean")
@SessionScoped
public class PrecoProdutoBean implements Serializable {

	private static final long serialVersionUID = 1L;

//	@Inject
	private CalculadoraPreco calculadora;

	public PrecoProdutoBean() {
	}

	@Inject
	public PrecoProdutoBean(CalculadoraPreco calculadora) {
	System.out.println("Construtor: " + calculadora);
		this.calculadora = calculadora;
	}

	public double getPreco() {
		return calculadora.calcularPreco(12, 44.55);
	}

//	@Inject
	public void setCalculadora(CalculadoraPreco calculadora) {
		System.out.println("SetCalculadora: " + calculadora);
		this.calculadora = calculadora;
	}
}