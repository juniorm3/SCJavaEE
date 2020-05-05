package com.algaworks.cursojavaee;

import java.io.Serializable;
import java.math.BigDecimal;
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
	
	private static final String[] nomes = { "João", "Maria", "José", "Eduardo", "Sebastião", "Mariana", "Francisco",
			"Manoel", "Fernanda", "Gabriela", "Mário", "Marcos" };
	
	private static final String[] documentos = { "52.458.214/0001-00", "68.096.557/0001-01", "80.757.697/0001-89", "46.080.844/0001-90", 
			"82.487.670/0001-49", "19.527.803/0001-27", "08.685.752/0001-45", "49.476.543/0001-79", "15.599.542/0001-08", "49.582.429/0001-23", 
			"10.903.201/0001-52", "79.246.795/0001-72" };
	
	private static final String[] modalidades = {"EAD","Presencial"};
	
	private static final String[] metodosPagamento = {"Credito","Cheque","Boleto"};
	

	private Contrato contrato;
	private List<Contrato> contratos;
	private List<String> cursosContratados;
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
		
		contratos = new ArrayList<>();
		
		for (int i = 0; i < 50; i++) {
			adicionarContrato();
		}
	}


	private void adicionarContrato() {
		String cnpj = gerarCnpjAleatorio();
		contratos.add(new Contrato(getRazaoSocialAleatoria(), cnpj, getCidadesContrato(), gerarModalidade(), 
				getDataAleatoria(), getValorContrato(), gerarMetodoPagamento()));
	}


	private String gerarMetodoPagamento() {
		int posicao = (int) Math.round(Math.random() * (metodosPagamento.length - 1));
		return metodosPagamento[posicao];
	}


	private String gerarModalidade() {
		int posicao = (int) Math.round(Math.random() * (modalidades.length - 1));
		return modalidades[posicao];
	}




	private BigDecimal getValorContrato() {
		return new BigDecimal(1000 + (Math.random() * 29000));
	}


	private String getCidadesContrato() {
		int posicao = (int) Math.round(Math.random() * (cidades.size() - 1));
		return cidades.get(posicao);
	}

	private String gerarCnpjAleatorio() {
		int posicao = (int) Math.round(Math.random() * (documentos.length - 1));
		return documentos[posicao];
	}

	private String getRazaoSocialAleatoria() {
		int posicao = (int) Math.round(Math.random() * (nomes.length - 1));
		return nomes[posicao];
	}

	private Date getDataAleatoria() {
		long dezAnosEmMillis = 24 * 60 * 60 * 1000;
		long periodoSorteadoEmMillis = ((long) (Math.random() * 10 * 365)) * dezAnosEmMillis;
		return new Date(System.currentTimeMillis() - periodoSorteadoEmMillis);
	}

	public void cadastrar() {
		System.out.println("Razão social: " + this.contrato.getRazaoSocial());
		System.out.println("CNPJ: " + this.contrato.getRazaoSocial());
		System.out.println("Cidade do contrato: " + this.contrato.getCidadeContrato());
		System.out.println("Modalidade: " + this.contrato.getModalidade());
		System.out.println("Data Contrato: " + this.contrato.getDataContrato());
		System.out.println("Valor Contrato: " + this.contrato.getValorContrato());
		System.out.println("Metodo de pagamento: " + this.contrato.getMetodoPagamento());
		System.out.println("Forma de pagamento: " + this.contrato.getFormaPagamento());
		
		System.out.print("Cursos contratados: " + this.cursosContratados);
		for (String curso : cursosContratados) {
			System.out.print(curso + " | ");
		}

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadastro efeutado com sucesso!"));
	}

	public void carregarPagamentos() {
		pagamentos.clear();

		if ("Credito".equals(contrato.getMetodoPagamento())) {
			pagamentos.add("À vista");
			pagamentos.add("1x");
			pagamentos.add("2x");
			pagamentos.add("6x");

		} else if ("Cheque".equals(contrato.getMetodoPagamento())) {
			pagamentos.add("À vista");
			pagamentos.add("Entrada + 30 dias");

		} else if ("Boleto".equals(contrato.getMetodoPagamento())) {
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


	public List<String> getCursosContratados() {
		return cursosContratados;
	}

	public void setCursosContratados(List<String> cursosContratados) {
		this.cursosContratados = cursosContratados;
	}
	
	public List<Contrato> getContratos() {
		return contratos;
	}
	
	public Contrato getContrato() {
		return contrato;
	}

}
