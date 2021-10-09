package br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pt_wl_solicitacao_atualizacao")
public class SolicitacaoAtualizacaoWareline {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "tabela")
	private String tabela;
	
	@Column(name = "ano")
	private Integer ano;
	
	@Column(name = "mes")
	private Integer mes;
	
	/*
	 * se ZERO = todas as unidades
	 */
	@Column(name = "unidade")
	private Integer unidade;
	
	@Column(name = "datahorapedido")
	private Timestamp datahorapedido;
	
	@Column(name = "usuario")
	private Integer usuario;
	
	/*P - Incluída, pendente de atualização
	 * C - Concluída
	 * */
	@Column(name = "status")
	private String status; 
	
	@Column(name = "resultado")
	private String resultado; 
	
	@Column(name = "datahoraatualizacao")
	private Timestamp datahoraatualizacao;

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTabela() {
		return tabela;
	}

	public void setTabela(String tabela) {
		this.tabela = tabela;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getUnidade() {
		return unidade;
	}

	public void setUnidade(Integer unidade) {
		this.unidade = unidade;
	}

	public Timestamp getDatahorapedido() {
		return datahorapedido;
	}

	public void setDatahorapedido(Timestamp datahorapedido) {
		this.datahorapedido = datahorapedido;
	}

	public Integer getUsuario() {
		return usuario;
	}

	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getDatahoraatualizacao() {
		return datahoraatualizacao;
	}

	public void setDatahoraatualizacao(Timestamp datahoraatualizacao) {
		this.datahoraatualizacao = datahoraatualizacao;
	}
}