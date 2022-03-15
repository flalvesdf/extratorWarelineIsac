package br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class RecebimentosMySql {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="numrecebto")
	private Integer numrecebto;
	
	@Column(name="tipodoc")
	private String tipodoc;
	
	@Column(name="numnffat")
	private Integer numnffat ;
	
	@Column(name="numreciboa")
	private Integer numreciboa ;
	
	@Column(name="numrecibov")
	private Integer numrecibov ;
	
	@Column(name="numdoc")
	private String numdoc ;
	
	@Column(name="codfilial")
	private String codfilial ;
	
	@Column(name="codconv")
	private String codconv ;
	
	@Column(name="nomecli")
	private String nomecli ;
	
	@Column(name="nomeresp")
	private String nomeresp ;
	
	@Column(name="portador")
	private String portador ;
	
	@Column(name="observa")
	private String observa ;
	
	@Column(name="datemissao")
	private Date datemissao;
	
	@Column(name="datdigita")
	private Date datdigita;
	
	@Column(name="codope")
	private String codope;
	
	@Column(name="dataultatu")
	private Date dataultatu;
	
	@Column(name="codopeatu")
	private String codopeatu;
	
	@Column(name="codcondpg")
	private String codcondpg ;
	
	@Column(name="parcelas")
	private Integer parcelas ;
	
	@Column(name="valortot")
	private Double valortot ;
	
	@Column(name="codmoeda")
	private String codmoeda ;
	
	@Column(name="tipocobr")
	private String tipocobr ;
	
	@Column(name="posicao")
	private String posicao ;
	
	@Column(name="contabinc")
	private String contabinc ;
	
	@Column(name="codeveninc")
	private String codeveninc ;
	
	@Column(name="contabbai")
	private String contabbai ;
	
	@Column(name="codevenbai")
	private String codevenbai ;
	
	@Column(name="fluxo")
	private String fluxo ;
	
	@Column(name="provisiona")
	private String provisiona ;
	
	@Column(name="mesiniprov")
	private String mesiniprov ;
	
	@Column(name="mesfimprov")
	private String mesfimprov ;
	
	@Column(name="valoradian")
	private Double valoradian;
	
	@Column(name="dataadian")
	private Date dataadian ;
	
	@Column(name="valorglosa")
	private Double valorglosa ;
	
	@Column(name="dataglosas")
	private Date dataglosas ;
	
	@Column(name="valororig")
	private Double valororig ;
	
	@Column(name="valirrf")
	private Double valirrf;
	
	@Column(name="valiss")
	private Double valiss ;
	
	@Column(name="valinss")
	private Double valinss;
	
	@Column(name="valcofins")
	private Double valcofins ;
	
	@Column(name="valpis")
	private Double valpis ;
	
	@Column(name="valcsll")
	private Double valcsll;
	
	@Column(name="valcpc")
	private Double valcpc;
	
	@Column(name="valicms")
	private Double valicms ;
	
	@Column(name="numrecibo")
	private Integer numrecibo;
	
	@Column(name="cpfresp")
	private String cpfresp;
	
	@Column(name="codpac")
	private Integer qtd1;
	
	@Column(name="codpac")
	private Integer codpac ;
	
	@Column(name="codbansuge")
	private String codbansuge ;
	
	@Column(name="formasuge")
	private String formasuge;
	
	@Column(name="numsolver")
	private Integer numsolver;
	
	@Column(name="traspaso")
	private String traspaso;
	
	@Column(name="numprojeto")
	private Integer numprojeto;
	
	@Column(name="classidoc")
	private String classidoc;
	
	@Column(name="numatend")
	private Integer numatend;
	
	@Column(name="codorcaf")
	private Integer codorcaf;
	
	@Column(name="mesorcaf")
	private String mesorcaf;
	
	@Column(name="matriz")
	private String matriz;
	
	@Column(name="idcontapac")
	private Integer idcontapac;
	
	@Column(name="unidade")
	private Integer unidade;
	
	@Column(name="timestamp")
	private Timestamp timestamp;

	@Column(name="mescompetencia")
	private Integer mescompetencia;
	
	@Column(name="anocompetencia")
	private Integer anocompetencia;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumrecebto() {
		return numrecebto;
	}

	public void setNumrecebto(Integer numrecebto) {
		this.numrecebto = numrecebto;
	}

	public String getTipodoc() {
		return tipodoc;
	}

	public void setTipodoc(String tipodoc) {
		this.tipodoc = tipodoc;
	}

	public Integer getNumnffat() {
		return numnffat;
	}

	public void setNumnffat(Integer numnffat) {
		this.numnffat = numnffat;
	}

	public Integer getNumreciboa() {
		return numreciboa;
	}

	public void setNumreciboa(Integer numreciboa) {
		this.numreciboa = numreciboa;
	}

	public Integer getNumrecibov() {
		return numrecibov;
	}

	public void setNumrecibov(Integer numrecibov) {
		this.numrecibov = numrecibov;
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

	public String getCodconv() {
		return codconv;
	}

	public void setCodconv(String codconv) {
		this.codconv = codconv;
	}

	public String getNomecli() {
		return nomecli;
	}

	public void setNomecli(String nomecli) {
		this.nomecli = nomecli;
	}

	public String getNomeresp() {
		return nomeresp;
	}

	public void setNomeresp(String nomeresp) {
		this.nomeresp = nomeresp;
	}

	public String getPortador() {
		return portador;
	}

	public void setPortador(String portador) {
		this.portador = portador;
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

	public Date getDatdigita() {
		return datdigita;
	}

	public void setDatdigita(Date datdigita) {
		this.datdigita = datdigita;
	}

	public String getCodope() {
		return codope;
	}

	public void setCodope(String codope) {
		this.codope = codope;
	}

	public Date getDataultatu() {
		return dataultatu;
	}

	public void setDataultatu(Date dataultatu) {
		this.dataultatu = dataultatu;
	}

	public String getCodopeatu() {
		return codopeatu;
	}

	public void setCodopeatu(String codopeatu) {
		this.codopeatu = codopeatu;
	}

	public String getCodcondpg() {
		return codcondpg;
	}

	public void setCodcondpg(String codcondpg) {
		this.codcondpg = codcondpg;
	}

	public Integer getParcelas() {
		return parcelas;
	}

	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}

	public Double getValortot() {
		return valortot;
	}

	public void setValortot(Double valortot) {
		this.valortot = valortot;
	}

	public String getCodmoeda() {
		return codmoeda;
	}

	public void setCodmoeda(String codmoeda) {
		this.codmoeda = codmoeda;
	}

	public String getTipocobr() {
		return tipocobr;
	}

	public void setTipocobr(String tipocobr) {
		this.tipocobr = tipocobr;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getContabinc() {
		return contabinc;
	}

	public void setContabinc(String contabinc) {
		this.contabinc = contabinc;
	}

	public String getCodeveninc() {
		return codeveninc;
	}

	public void setCodeveninc(String codeveninc) {
		this.codeveninc = codeveninc;
	}

	public String getContabbai() {
		return contabbai;
	}

	public void setContabbai(String contabbai) {
		this.contabbai = contabbai;
	}

	public String getCodevenbai() {
		return codevenbai;
	}

	public void setCodevenbai(String codevenbai) {
		this.codevenbai = codevenbai;
	}

	public String getFluxo() {
		return fluxo;
	}

	public void setFluxo(String fluxo) {
		this.fluxo = fluxo;
	}

	public String getProvisiona() {
		return provisiona;
	}

	public void setProvisiona(String provisiona) {
		this.provisiona = provisiona;
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

	public Double getValoradian() {
		return valoradian;
	}

	public void setValoradian(Double valoradian) {
		this.valoradian = valoradian;
	}

	public Date getDataadian() {
		return dataadian;
	}

	public void setDataadian(Date dataadian) {
		this.dataadian = dataadian;
	}

	public Double getValorglosa() {
		return valorglosa;
	}

	public void setValorglosa(Double valorglosa) {
		this.valorglosa = valorglosa;
	}

	public Date getDataglosas() {
		return dataglosas;
	}

	public void setDataglosas(Date dataglosas) {
		this.dataglosas = dataglosas;
	}

	public Double getValororig() {
		return valororig;
	}

	public void setValororig(Double valororig) {
		this.valororig = valororig;
	}

	public Double getValirrf() {
		return valirrf;
	}

	public void setValirrf(Double valirrf) {
		this.valirrf = valirrf;
	}

	public Double getValiss() {
		return valiss;
	}

	public void setValiss(Double valiss) {
		this.valiss = valiss;
	}

	public Double getValinss() {
		return valinss;
	}

	public void setValinss(Double valinss) {
		this.valinss = valinss;
	}

	public Double getValcofins() {
		return valcofins;
	}

	public void setValcofins(Double valcofins) {
		this.valcofins = valcofins;
	}

	public Double getValpis() {
		return valpis;
	}

	public void setValpis(Double valpis) {
		this.valpis = valpis;
	}

	public Double getValcsll() {
		return valcsll;
	}

	public void setValcsll(Double valcsll) {
		this.valcsll = valcsll;
	}

	public Double getValcpc() {
		return valcpc;
	}

	public void setValcpc(Double valcpc) {
		this.valcpc = valcpc;
	}

	public Double getValicms() {
		return valicms;
	}

	public void setValicms(Double valicms) {
		this.valicms = valicms;
	}

	public Integer getNumrecibo() {
		return numrecibo;
	}

	public void setNumrecibo(Integer numrecibo) {
		this.numrecibo = numrecibo;
	}

	public String getCpfresp() {
		return cpfresp;
	}

	public void setCpfresp(String cpfresp) {
		this.cpfresp = cpfresp;
	}

	public Integer getQtd1() {
		return qtd1;
	}

	public void setQtd1(Integer qtd1) {
		this.qtd1 = qtd1;
	}

	public Integer getCodpac() {
		return codpac;
	}

	public void setCodpac(Integer codpac) {
		this.codpac = codpac;
	}

	public String getCodbansuge() {
		return codbansuge;
	}

	public void setCodbansuge(String codbansuge) {
		this.codbansuge = codbansuge;
	}

	public String getFormasuge() {
		return formasuge;
	}

	public void setFormasuge(String formasuge) {
		this.formasuge = formasuge;
	}

	public Integer getNumsolver() {
		return numsolver;
	}

	public void setNumsolver(Integer numsolver) {
		this.numsolver = numsolver;
	}

	public String getTraspaso() {
		return traspaso;
	}

	public void setTraspaso(String traspaso) {
		this.traspaso = traspaso;
	}

	public Integer getNumprojeto() {
		return numprojeto;
	}

	public void setNumprojeto(Integer numprojeto) {
		this.numprojeto = numprojeto;
	}

	public String getClassidoc() {
		return classidoc;
	}

	public void setClassidoc(String classidoc) {
		this.classidoc = classidoc;
	}

	public Integer getNumatend() {
		return numatend;
	}

	public void setNumatend(Integer numatend) {
		this.numatend = numatend;
	}

	public Integer getCodorcaf() {
		return codorcaf;
	}

	public void setCodorcaf(Integer codorcaf) {
		this.codorcaf = codorcaf;
	}

	public String getMesorcaf() {
		return mesorcaf;
	}

	public void setMesorcaf(String mesorcaf) {
		this.mesorcaf = mesorcaf;
	}

	public String getMatriz() {
		return matriz;
	}

	public void setMatriz(String matriz) {
		this.matriz = matriz;
	}

	public Integer getIdcontapac() {
		return idcontapac;
	}

	public void setIdcontapac(Integer idcontapac) {
		this.idcontapac = idcontapac;
	}

	public Integer getUnidade() {
		return unidade;
	}

	public void setUnidade(Integer unidade) {
		this.unidade = unidade;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getMescompetencia() {
		return mescompetencia;
	}

	public void setMescompetencia(Integer mescompetencia) {
		this.mescompetencia = mescompetencia;
	}

	public Integer getAnocompetencia() {
		return anocompetencia;
	}

	public void setAnocompetencia(Integer anocompetencia) {
		this.anocompetencia = anocompetencia;
	}
}