package br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "pagtos")
public class PagtosPostGre {

	@Id
	@Column(name="numpagto")
	private Integer numpagto ;

	@Column(name="tipodoc")
	private String tipodoc ;

	@Column(name="numentr")
	private Integer numentr ;

	@Column(name="numdoc")
	private String numdoc ;

	@Column(name="codfilial")
	private String codfilial ;

	@Column(name="codprest")
	private String codprest;

	@Column(name="portador")
	private String portador;

	@Column(name="observa")
	private String observa ;

	@Column(name="datemissao")
	private Date datemissao ;

	@Column(name="datentrada")
	private Date datentrada ;

	@Column(name="datdigita")
	private Date datdigita ;

	@Column(name="codope")
	private String codope ;

	@Column(name="dataultatu")
	private Date dataultatu ;

	@Column(name="codopeatu")
	private String codopeatu ;

	@Column(name="parcelas")
	private Integer parcelas ;

	@Column(name="valortot")
	private Double valortot;

	@Column(name="codmoeda")
	private String codmoeda;

	@Column(name="numnotas")
	private Integer numnotas;

	@Column(name="tipocobr")
	private String tipocobr;

	@Column(name="posicao")
	private String posicao;

	@Column(name="contabinc")
	private String contabinc;

	@Column(name="codeveninc")
	private String codeveninc;

	@Column(name="contabbai")
	private String contabbai;

	@Column(name="codevenbai")
	private String codevenbai;

	@Column(name="percjurosm")
	private Double percjurosm;

	@Column(name="percjurosd")
	private Double percjurosd;

	@Column(name="valorjurod")
	private Double valorjurod;

	@Column(name="diasjuros")
	private Integer diasjuros;

	@Column(name="percmulta")
	private Double percmulta;

	@Column(name="valormulta")
	private Double valormulta;

	@Column(name="diasmulta")
	private Integer diasmulta;

	@Column(name="percdescd")
	private Double percdescd ;

	@Column(name="fluxo")
	private String fluxo;

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

	@Column(name="valordev")
	private Double valordev ;

	@Column(name="datadev")
	private Date datadev ;

	@Column(name="valorirf")
	private Double valorirf ;

	@Column(name="valoripi")
	private Double valoripi ;

	@Column(name="valoriss")
	private Double valoriss ;

	@Column(name="valorinss")
	private Double valorinss ;

	@Column(name="valcofins")
	private Double valcofins ;

	@Column(name="codcondpg")
	private String codcondpg ;

	@Column(name="codbarra")
	private String codbarra ;

	@Column(name="valpis")
	private Double valpis ;

	@Column(name="valcsll")
	private Double valcsll ;

	@Column(name="valcpc")
	private Double valcpc;

	@Column(name="valororig")
	private Double valororig;

	@Column(name="valorfrete")
	private Double valorfrete;

	@Column(name="nomefornec")
	private String nomefornec;

	@Column(name="numatend")
	private Integer numatend;

	@Column(name="numconta")
	private Integer numconta;

	@Column(name="numpgtori")
	private Integer numpgtori;

	@Column(name="nfservicos")
	private String nfservicos;

	@Column(name="codimposto")
	private String codimposto;

	@Column(name="numparcori")
	private Integer numparcori;

	@Column(name="numbaiori")
	private Integer numbaiori;

	@Column(name="qtd1")
	private Integer qtd1;

	@Column(name="codbansuge")
	private String codbansuge;

	@Column(name="formasuge")
	private String formasuge ;

	@Column(name="coddarf")
	private String coddarf;

	@Column(name="exportada")
	private String exportada ;

	@Column(name="codserv3")
	private String codserv3;

	@Column(name="seriedoc")
	private String seriedoc;

	@Column(name="chavenf")
	private String chavenf;

	@Column(name="valiva")
	private Double valiva ;

	@Column(name="valit")
	private Double valit ;

	@Column(name="valiue")
	private Double valiue;

	@Column(name="numcontbol")
	private String numcontbol ;

	@Column(name="traspaso")
	private String traspaso ;

	@Column(name="numprojeto")
	private Integer numprojeto ;

	@Column(name="mescomp")
	private String mescomp ;

	@Column(name="classidoc")
	private String classidoc;

	@Column(name="codorcaf")
	private Integer codorcaf;

	@Column(name="mesorcaf")
	private String mesorcaf ;

	@Column(name="matriz")
	private String matriz ;

	@Column(name="regdirf")
	private String regdirf;

	@Column(name="desregdirf")
	private String desregdirf ;
	
	@Transient
	private String tipoprest; 
	
	@Transient
	private String categprest;
	
	@Transient
	private String nomeprest;
	
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

	public Integer getNumpagto() {
		return numpagto;
	}

	public void setNumpagto(Integer numpagto) {
		this.numpagto = numpagto;
	}

	public String getTipodoc() {
		return tipodoc;
	}

	public void setTipodoc(String tipodoc) {
		this.tipodoc = tipodoc;
	}

	public Integer getNumentr() {
		return numentr;
	}

	public void setNumentr(Integer numentr) {
		this.numentr = numentr;
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

	public Integer getNumnotas() {
		return numnotas;
	}

	public void setNumnotas(Integer numnotas) {
		this.numnotas = numnotas;
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

	public Double getPercjurosm() {
		return percjurosm;
	}

	public void setPercjurosm(Double percjurosm) {
		this.percjurosm = percjurosm;
	}

	public Double getPercjurosd() {
		return percjurosd;
	}

	public void setPercjurosd(Double percjurosd) {
		this.percjurosd = percjurosd;
	}

	public Double getValorjurod() {
		return valorjurod;
	}

	public void setValorjurod(Double valorjurod) {
		this.valorjurod = valorjurod;
	}

	public Integer getDiasjuros() {
		return diasjuros;
	}

	public void setDiasjuros(Integer diasjuros) {
		this.diasjuros = diasjuros;
	}

	public Double getPercmulta() {
		return percmulta;
	}

	public void setPercmulta(Double percmulta) {
		this.percmulta = percmulta;
	}

	public Double getValormulta() {
		return valormulta;
	}

	public void setValormulta(Double valormulta) {
		this.valormulta = valormulta;
	}

	public Integer getDiasmulta() {
		return diasmulta;
	}

	public void setDiasmulta(Integer diasmulta) {
		this.diasmulta = diasmulta;
	}

	public Double getPercdescd() {
		return percdescd;
	}

	public void setPercdescd(Double percdescd) {
		this.percdescd = percdescd;
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

	public Double getValordev() {
		return valordev;
	}

	public void setValordev(Double valordev) {
		this.valordev = valordev;
	}

	public Date getDatadev() {
		return datadev;
	}

	public void setDatadev(Date datadev) {
		this.datadev = datadev;
	}

	public Double getValorirf() {
		return valorirf;
	}

	public void setValorirf(Double valorirf) {
		this.valorirf = valorirf;
	}

	public Double getValoripi() {
		return valoripi;
	}

	public void setValoripi(Double valoripi) {
		this.valoripi = valoripi;
	}

	public Double getValoriss() {
		return valoriss;
	}

	public void setValoriss(Double valoriss) {
		this.valoriss = valoriss;
	}

	public Double getValorinss() {
		return valorinss;
	}

	public void setValorinss(Double valorinss) {
		this.valorinss = valorinss;
	}

	public Double getValcofins() {
		return valcofins;
	}

	public void setValcofins(Double valcofins) {
		this.valcofins = valcofins;
	}

	public String getCodcondpg() {
		return codcondpg;
	}

	public void setCodcondpg(String codcondpg) {
		this.codcondpg = codcondpg;
	}

	public String getCodbarra() {
		return codbarra;
	}

	public void setCodbarra(String codbarra) {
		this.codbarra = codbarra;
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

	public Double getValororig() {
		return valororig;
	}

	public void setValororig(Double valororig) {
		this.valororig = valororig;
	}

	public Double getValorfrete() {
		return valorfrete;
	}

	public void setValorfrete(Double valorfrete) {
		this.valorfrete = valorfrete;
	}

	public String getNomefornec() {
		return nomefornec;
	}

	public void setNomefornec(String nomefornec) {
		this.nomefornec = nomefornec;
	}

	public Integer getNumatend() {
		return numatend;
	}

	public void setNumatend(Integer numatend) {
		this.numatend = numatend;
	}

	public Integer getNumconta() {
		return numconta;
	}

	public void setNumconta(Integer numconta) {
		this.numconta = numconta;
	}

	public Integer getNumpgtori() {
		return numpgtori;
	}

	public void setNumpgtori(Integer numpgtori) {
		this.numpgtori = numpgtori;
	}

	public String getNfservicos() {
		return nfservicos;
	}

	public void setNfservicos(String nfservicos) {
		this.nfservicos = nfservicos;
	}

	public String getCodimposto() {
		return codimposto;
	}

	public void setCodimposto(String codimposto) {
		this.codimposto = codimposto;
	}

	public Integer getNumparcori() {
		return numparcori;
	}

	public void setNumparcori(Integer numparcori) {
		this.numparcori = numparcori;
	}

	public Integer getNumbaiori() {
		return numbaiori;
	}

	public void setNumbaiori(Integer numbaiori) {
		this.numbaiori = numbaiori;
	}

	public Integer getQtd1() {
		return qtd1;
	}

	public void setQtd1(Integer qtd1) {
		this.qtd1 = qtd1;
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

	public String getCoddarf() {
		return coddarf;
	}

	public void setCoddarf(String coddarf) {
		this.coddarf = coddarf;
	}

	public String getExportada() {
		return exportada;
	}

	public void setExportada(String exportada) {
		this.exportada = exportada;
	}

	public String getCodserv3() {
		return codserv3;
	}

	public void setCodserv3(String codserv3) {
		this.codserv3 = codserv3;
	}

	public String getSeriedoc() {
		return seriedoc;
	}

	public void setSeriedoc(String seriedoc) {
		this.seriedoc = seriedoc;
	}

	public String getChavenf() {
		return chavenf;
	}

	public void setChavenf(String chavenf) {
		this.chavenf = chavenf;
	}

	public Double getValiva() {
		return valiva;
	}

	public void setValiva(Double valiva) {
		this.valiva = valiva;
	}

	public Double getValit() {
		return valit;
	}

	public void setValit(Double valit) {
		this.valit = valit;
	}

	public Double getValiue() {
		return valiue;
	}

	public void setValiue(Double valiue) {
		this.valiue = valiue;
	}

	public String getNumcontbol() {
		return numcontbol;
	}

	public void setNumcontbol(String numcontbol) {
		this.numcontbol = numcontbol;
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

	public String getMescomp() {
		return mescomp;
	}

	public void setMescomp(String mescomp) {
		this.mescomp = mescomp;
	}

	public String getClassidoc() {
		return classidoc;
	}

	public void setClassidoc(String classidoc) {
		this.classidoc = classidoc;
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

	public String getRegdirf() {
		return regdirf;
	}

	public void setRegdirf(String regdirf) {
		this.regdirf = regdirf;
	}

	public String getDesregdirf() {
		return desregdirf;
	}

	public void setDesregdirf(String desregdirf) {
		this.desregdirf = desregdirf;
	}
}