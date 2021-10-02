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
	private String numpagto ;

	@Column(name="tipodoc")
	private String tipodoc ;

	@Column(name="numentr")
	private String numentr ;

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
	private String parcelas ;

	@Column(name="valortot")
	private String valortot;

	@Column(name="codmoeda")
	private String codmoeda;

	@Column(name="numnotas")
	private String numnotas;

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
	private String percjurosm;

	@Column(name="percjurosd")
	private String percjurosd;

	@Column(name="valorjurod")
	private String valorjurod;

	@Column(name="diasjuros")
	private String diasjuros;

	@Column(name="percmulta")
	private String percmulta;

	@Column(name="valormulta")
	private String valormulta;

	@Column(name="diasmulta")
	private String diasmulta;

	@Column(name="percdescd")
	private String percdescd ;

	@Column(name="fluxo")
	private String fluxo;

	@Column(name="provisiona")
	private String provisiona ;

	@Column(name="mesiniprov")
	private String mesiniprov ;

	@Column(name="mesfimprov")
	private String mesfimprov ;

	@Column(name="valoradian")
	private String valoradian;

	@Column(name="dataadian")
	private Date dataadian ;

	@Column(name="valordev")
	private String valordev ;

	@Column(name="datadev")
	private Date datadev ;

	@Column(name="valorirf")
	private String valorirf ;

	@Column(name="valoripi")
	private String valoripi ;

	@Column(name="valoriss")
	private String valoriss ;

	@Column(name="valorinss")
	private String valorinss ;

	@Column(name="valcofins")
	private String valcofins ;

	@Column(name="codcondpg")
	private String codcondpg ;

	@Column(name="codbarra")
	private String codbarra ;

	@Column(name="valpis")
	private String valpis ;

	@Column(name="valcsll")
	private String valcsll ;

	@Column(name="valcpc")
	private String valcpc;

	@Column(name="valororig")
	private String valororig;

	@Column(name="valorfrete")
	private String valorfrete;

	@Column(name="nomefornec")
	private String nomefornec;

	@Column(name="numatend")
	private String numatend;

	@Column(name="numconta")
	private String numconta;

	@Column(name="numpgtori")
	private String numpgtori;

	@Column(name="nfservicos")
	private String nfservicos;

	@Column(name="codimposto")
	private String codimposto;

	@Column(name="numparcori")
	private String numparcori;

	@Column(name="numbaiori")
	private String numbaiori;

	@Column(name="qtd1")
	private String qtd1;

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
	private String valiva ;

	@Column(name="valit")
	private String valit ;

	@Column(name="valiue")
	private String valiue;

	@Column(name="numcontbol")
	private String numcontbol ;

	@Column(name="traspaso")
	private String traspaso ;

	@Column(name="numprojeto")
	private String numprojeto ;

	@Column(name="mescomp")
	private String mescomp ;

	@Column(name="classidoc")
	private String classidoc;

	@Column(name="codorcaf")
	private String codorcaf;

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

	public String getNumpagto() {
		return numpagto;
	}

	public void setNumpagto(String numpagto) {
		this.numpagto = numpagto;
	}

	public String getTipodoc() {
		return tipodoc;
	}

	public void setTipodoc(String tipodoc) {
		this.tipodoc = tipodoc;
	}

	public String getNumentr() {
		return numentr;
	}

	public void setNumentr(String numentr) {
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

	public String getCodmoeda() {
		return codmoeda;
	}

	public void setCodmoeda(String codmoeda) {
		this.codmoeda = codmoeda;
	}

	public String getNumnotas() {
		return numnotas;
	}

	public void setNumnotas(String numnotas) {
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

	public String getPercjurosm() {
		return percjurosm;
	}

	public void setPercjurosm(String percjurosm) {
		this.percjurosm = percjurosm;
	}

	public String getPercjurosd() {
		return percjurosd;
	}

	public void setPercjurosd(String percjurosd) {
		this.percjurosd = percjurosd;
	}

	public String getValorjurod() {
		return valorjurod;
	}

	public void setValorjurod(String valorjurod) {
		this.valorjurod = valorjurod;
	}

	public String getDiasjuros() {
		return diasjuros;
	}

	public void setDiasjuros(String diasjuros) {
		this.diasjuros = diasjuros;
	}

	public String getPercmulta() {
		return percmulta;
	}

	public void setPercmulta(String percmulta) {
		this.percmulta = percmulta;
	}

	public String getValormulta() {
		return valormulta;
	}

	public void setValormulta(String valormulta) {
		this.valormulta = valormulta;
	}

	public String getDiasmulta() {
		return diasmulta;
	}

	public void setDiasmulta(String diasmulta) {
		this.diasmulta = diasmulta;
	}

	public String getPercdescd() {
		return percdescd;
	}

	public void setPercdescd(String percdescd) {
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

	public String getValoradian() {
		return valoradian;
	}

	public void setValoradian(String valoradian) {
		this.valoradian = valoradian;
	}

	public Date getDataadian() {
		return dataadian;
	}

	public void setDataadian(Date dataadian) {
		this.dataadian = dataadian;
	}

	public String getValordev() {
		return valordev;
	}

	public void setValordev(String valordev) {
		this.valordev = valordev;
	}

	public Date getDatadev() {
		return datadev;
	}

	public void setDatadev(Date datadev) {
		this.datadev = datadev;
	}

	public String getValorirf() {
		return valorirf;
	}

	public void setValorirf(String valorirf) {
		this.valorirf = valorirf;
	}

	public String getValoripi() {
		return valoripi;
	}

	public void setValoripi(String valoripi) {
		this.valoripi = valoripi;
	}

	public String getValoriss() {
		return valoriss;
	}

	public void setValoriss(String valoriss) {
		this.valoriss = valoriss;
	}

	public String getValorinss() {
		return valorinss;
	}

	public void setValorinss(String valorinss) {
		this.valorinss = valorinss;
	}

	public String getValcofins() {
		return valcofins;
	}

	public void setValcofins(String valcofins) {
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

	public String getValpis() {
		return valpis;
	}

	public void setValpis(String valpis) {
		this.valpis = valpis;
	}

	public String getValcsll() {
		return valcsll;
	}

	public void setValcsll(String valcsll) {
		this.valcsll = valcsll;
	}

	public String getValcpc() {
		return valcpc;
	}

	public void setValcpc(String valcpc) {
		this.valcpc = valcpc;
	}

	public String getValororig() {
		return valororig;
	}

	public void setValororig(String valororig) {
		this.valororig = valororig;
	}

	public String getValorfrete() {
		return valorfrete;
	}

	public void setValorfrete(String valorfrete) {
		this.valorfrete = valorfrete;
	}

	public String getNomefornec() {
		return nomefornec;
	}

	public void setNomefornec(String nomefornec) {
		this.nomefornec = nomefornec;
	}

	public String getNumatend() {
		return numatend;
	}

	public void setNumatend(String numatend) {
		this.numatend = numatend;
	}

	public String getNumconta() {
		return numconta;
	}

	public void setNumconta(String numconta) {
		this.numconta = numconta;
	}

	public String getNumpgtori() {
		return numpgtori;
	}

	public void setNumpgtori(String numpgtori) {
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

	public String getNumparcori() {
		return numparcori;
	}

	public void setNumparcori(String numparcori) {
		this.numparcori = numparcori;
	}

	public String getNumbaiori() {
		return numbaiori;
	}

	public void setNumbaiori(String numbaiori) {
		this.numbaiori = numbaiori;
	}

	public String getQtd1() {
		return qtd1;
	}

	public void setQtd1(String qtd1) {
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

	public String getValiva() {
		return valiva;
	}

	public void setValiva(String valiva) {
		this.valiva = valiva;
	}

	public String getValit() {
		return valit;
	}

	public void setValit(String valit) {
		this.valit = valit;
	}

	public String getValiue() {
		return valiue;
	}

	public void setValiue(String valiue) {
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

	public String getNumprojeto() {
		return numprojeto;
	}

	public void setNumprojeto(String numprojeto) {
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

	public String getCodorcaf() {
		return codorcaf;
	}

	public void setCodorcaf(String codorcaf) {
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
	
	
}