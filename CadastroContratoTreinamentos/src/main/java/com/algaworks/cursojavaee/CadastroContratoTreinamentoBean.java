package com.algaworks.cursojavaee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class CadastroContratoTreinamentoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<String> cidades = new ArrayList<>();
	private List<String> pagamentos = new ArrayList<>();

	public CadastroContratoTreinamentoBean() {
		cidades.add("São Paulo");
		cidades.add("Rio de Janeiro");
		cidades.add("Belo Horizonte");
		cidades.add("Maceió");
		cidades.add("Rio Branco");
		cidades.add("Macapá");
		cidades.add("Manaus");
		cidades.add("Salvador");
		cidades.add("Fortaleza");
		cidades.add("Palmas");
		cidades.add("Aracaju");
		cidades.add("Florianópolis");
		cidades.add("Porto Velho");
		cidades.add("Porto Alegre");
		cidades.add("Natal");
		cidades.add("Teresina");
		cidades.add("Recife");
		cidades.add("Curitiba");
		cidades.add("Brasília");
		cidades.add("João Pessoa");
		cidades.add("Belém");
		cidades.add("Campo Grande");
		cidades.add("Cuiabá");
		cidades.add("São Luís");
		cidades.add("Goiânia");
		cidades.add("Vitória");
	}

	private String razaoSocial;
	private String cnpj;
	private String cidadeContrato;
	private String modalidade;
	private Date dataContrato;
	private String valorContrato;
	private String metodoPagamento;
	private String formaPagamento;
	private List<String> cursosContratados;

	public void cadastrar() {
		System.out.println("Razão social: " + this.razaoSocial);
		System.out.println("CNPJ: " + this.razaoSocial);
		System.out.println("Cidade do contrato: " + this.cidadeContrato);
		System.out.println("Modalidade: " + this.modalidade);
		System.out.println("Data Contrato: " + this.dataContrato);
		System.out.println("Valor Contrato: " + this.valorContrato);
		System.out.println("Metodo de pagamento: " + this.metodoPagamento);
		System.out.println("Forma de pagamento: " + this.formaPagamento);
		
		System.out.print("Cursos contratados: " + this.cursosContratados);
		for (String curso : cursosContratados) {
			System.out.print(curso + " | ");
		}

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadastro efeutado com sucesso!"));
	}

	public void carregarPagamentos() {
		pagamentos.clear();

		if ("Credito".equals(metodoPagamento)) {
			pagamentos.add("À vista");
			pagamentos.add("1x");
			pagamentos.add("2x");
			pagamentos.add("6x");

		} else if ("Cheque".equals(metodoPagamento)) {
			pagamentos.add("À vista");
			pagamentos.add("Entrada + 30 dias");

		} else if ("Boleto".equals(metodoPagamento)) {
			pagamentos.add("À vista");
		}
	}

	public List<String> sugerirCidades(String consulta) {
		List<String> cidadesSugeridas = new ArrayList<>();

		for (String cidade : cidades) {
			if (cidade.toLowerCase().startsWith(consulta.toLowerCase())) {
				cidadesSugeridas.add(cidade);
			}
		}

		return cidadesSugeridas;
	}

	public List<String> getCidades() {
		return cidades;
	}

	public void setCidades(List<String> cidades) {
		this.cidades = cidades;
	}

	public List<String> getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(List<String> pagamentos) {
		this.pagamentos = pagamentos;
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

	public String getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(String valorContrato) {
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
