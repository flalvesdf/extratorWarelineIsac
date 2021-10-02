package br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pt_wareline_pagamentos")
public class PagamentosWareline {
	
	/**
	 * Vindos da tabela pagtos:
		numpagto;
		numdoc;
		codfilial;
		codprest;
		observa;
		datemissao;
		datentrada;
		datdigita;
		dataultatu;
		parcelas;
		valortot;
		mesiniprov;
		mesfimprov;
		nomefornec;
		nfservicos;
		mescomp;
		codopeatu;
		
		Vindos da tabela caduni
		coduni;
		codprest;
		nomeuni;
		secretdest;
		tiposecret;
		
		Vindas da tabela cadfunc
		Codprest;
		datnasfunc;
		sexofunc;
		celfunc;
		Emailfunc;
		cpffunc;
		
		Vindas da tabela cadprest:
		codprest;
		tipoprest;
		categprest;
		nomeprest;
		dataprest;
		cargo;
		apelido;
		cnes;
		codgrupre;
		datultatu;
	 */

	@Id
	@Column(name="numpagto")
	private String numpagto;
	
	@Column(name="numdoc")
	private String numdoc;
	
	@Column(name="codfilial")
	private String codfilial;
	
	@Column(name="codprest")
	private String codprest;
	
	@Column(name="observa")
	private String observa;
	
	@Column(name="datemissao")
	private Date datemissao;
	
	@Column(name="datentrada")
	private Date datentrada;
	
	@Column(name="datdigita")
	private Date datdigita;
	
	@Column(name="dataultatu")
	private Date dataultatu;
	
	@Column(name="parcelas")
	private String parcelas;
	
	@Column(name="valortot")
	private String valortot;
	
	@Column(name="mesiniprov")
	private String mesiniprov;
	
	@Column(name="mesfimprov")
	private String mesfimprov;
	
	@Column(name="nomefornec")
	private String nomefornec;
	
	@Column(name="nfservicos")
	private String nfservicos;
	
	@Column(name="mescomp")
	private String mescomp;
	
	@Column(name="codopeatu")
	private String codopeatu;
	
	@Column(name="coduni")
	private String coduni;
	
	@Column(name="nomeuni")
	private String nomeuni;
	
	@Column(name="tipoprest")
	private String tipoprest;
	
	@Column(name="categprest")
	private String categprest;
	
	@Column(name="nomeprest")
	private String nomeprest;
	
	@Column(name="dataprest")
	private Date dataprest;
	
	@Column(name="cargo")
	private String cargo;
	
	@Column(name="apelido")
	private String apelido;
	
	@Column(name="cnes")
	private String cnes;
	
	@Column(name="codgrupre")
	private String codgrupre;
	
	@Column(name="datultatu")
	private Date datultatu;
	
	@Column(name="tsAtualizacao", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp tsAtualizacao;
	
	@Column(name="idUnidade")
	private Integer idUnidade;

	public String getNumpagto() {
		return numpagto;
	}

	public void setNumpagto(String numpagto) {
		this.numpagto = numpagto;
	}

	public String getNumdoc() {
		return numdoc;
	}

	public void setNumdoc(String numdoc) {
		this.numdoc = numdoc;
	}

	public String getCodfilial() {
		return codfilial;
	}

	public void setCodfilial(String codfilial) {
		this.codfilial = codfilial;
	}

	public String getCodprest() {
		return codprest;
	}

	public void setCodprest(String codprest) {
		this.codprest = codprest;
	}

	public String getObserva() {
		return observa;
	}

	public void setObserva(String observa) {
		this.observa = observa;
	}

	public Date getDatemissao() {
		return datemissao;
	}

	public void setDatemissao(Date datemissao) {
		this.datemissao = datemissao;
	}

	public Date getDatentrada() {
		return datentrada;
	}

	public void setDatentrada(Date datentrada) {
		this.datentrada = datentrada;
	}

	public Date getDatdigita() {
		return datdigita;
	}

	public void setDatdigita(Date datdigita) {
		this.datdigita = datdigita;
	}

	public Date getDataultatu() {
		return dataultatu;
	}

	public void setDataultatu(Date dataultatu) {
		this.dataultatu = dataultatu;
	}

	public String getParcelas() {
		return parcelas;
	}

	public void setParcelas(String parcelas) {
		this.parcelas = parcelas;
	}

	public String getValortot() {
		return valortot;
	}

	public void setValortot(String valortot) {
		this.valortot = valortot;
	}

	public String getMesiniprov() {
		return mesiniprov;
	}

	public void setMesiniprov(String mesiniprov) {
		this.mesiniprov = mesiniprov;
	}

	public String getMesfimprov() {
		return mesfimprov;
	}

	public void setMesfimprov(String mesfimprov) {
		this.mesfimprov = mesfimprov;
	}

	public String getNomefornec() {
		return nomefornec;
	}

	public void setNomefornec(String nomefornec) {
		this.nomefornec = nomefornec;
	}

	public String getNfservicos() {
		return nfservicos;
	}

	public void setNfservicos(String nfservicos) {
		this.nfservicos = nfservicos;
	}

	public String getMescomp() {
		return mescomp;
	}

	public void setMescomp(String mescomp) {
		this.mescomp = mescomp;
	}

	public String getCodopeatu() {
		return codopeatu;
	}

	public void setCodopeatu(String codopeatu) {
		this.codopeatu = codopeatu;
	}

	public String getCoduni() {
		return coduni;
	}

	public void setCoduni(String coduni) {
		this.coduni = coduni;
	}

	public String getNomeuni() {
		return nomeuni;
	}

	public void setNomeuni(String nomeuni) {
		this.nomeuni = nomeuni;
	}

	public String getTipoprest() {
		return tipoprest;
	}

	public void setTipoprest(String tipoprest) {
		this.tipoprest = tipoprest;
	}

	public String getCategprest() {
		return categprest;
	}

	public void setCategprest(String categprest) {
		this.categprest = categprest;
	}

	public String getNomeprest() {
		return nomeprest;
	}

	public void setNomeprest(String nomeprest) {
		this.nomeprest = nomeprest;
	}

	public Date getDataprest() {
		return dataprest;
	}

	public void setDataprest(Date dataprest) {
		this.dataprest = dataprest;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getCnes() {
		return cnes;
	}

	public void setCnes(String cnes) {
		this.cnes = cnes;
	}

	public String getCodgrupre() {
		return codgrupre;
	}

	public void setCodgrupre(String codgrupre) {
		this.codgrupre = codgrupre;
	}

	public Date getDatultatu() {
		return datultatu;
	}

	public void setDatultatu(Date datultatu) {
		this.datultatu = datultatu;
	}

	public Timestamp getTsAtualizacao() {
		return tsAtualizacao;
	}

	public void setTsAtualizacao(Timestamp tsAtualizacao) {
		this.tsAtualizacao = tsAtualizacao;
	}

	public Integer getIdUnidade() {
		return idUnidade;
	}

	public void setIdUnidade(Integer idUnidade) {
		this.idUnidade = idUnidade;
	}
	
	
}