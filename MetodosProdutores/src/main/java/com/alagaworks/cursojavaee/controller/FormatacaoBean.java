package com.alagaworks.cursojavaee.controller;

import java.text.DateFormat;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.alagaworks.cursojavaee.service.Brasil;

@Named
@RequestScoped
public class FormatacaoBean {

	@Inject @Brasil
	private DateFormat formatadorData; //new SimpleDateFormat("dd-MMMM-yyyy");

	private Date dataInformada;
	private String dataFormatada;

	public void enviar() {
		dataFormatada = formatadorData.format(dataInformada);
	}

	public Date getDataInformada() {
		return dataInformada;
	}

	public void setDataInformada(Date dataInformada) {
		this.dataInformada = dataInformada;
	}

	public String getDataFormatada() {
		return dataFormatada;
	}

}
