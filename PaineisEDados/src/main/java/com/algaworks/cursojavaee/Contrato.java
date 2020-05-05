package com.algaworks.cursojavaee;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Contrato implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String razaoSocial;
	private String cnpj;
	private String cidadeContrato;
	private String modalidade;
	private Date dataContrato;
	private BigDecimal valorContrato;
	private String metodoPagamento;
	private String formaPagamento;
	private List<String> cursosContratados;
	
	public Contrato(String razaoSocial, String cnpj, String cidadeContrato, String modalidade, Date dataContrato,
			BigDecimal valorContrato, String metodoPagamento) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.cidadeContrato = cidadeContrato;
		this.modalidade = modalidade;
		this.dataContrato = dataContrato;
		this.valorContrato = valorContrato;
		this.metodoPagamento = metodoPagamento;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCidadeContrato() {
		return cidadeContrato;
	}

	public void setCidadeContrato(String cidadeContrato) {
		this.cidadeContrato = cidadeContrato;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}


	public BigDecimal getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(BigDecimal valorContrato) {
		this.valorContrato = valorContrato;
	}

	public String getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public List<String> getCursosContratados() {
		return cursosContratados;
	}

	public void setCursosContratados(List<String> cursosContratados) {
		this.cursosContratados = cursosContratados;
	}
	
	
	
	

}
