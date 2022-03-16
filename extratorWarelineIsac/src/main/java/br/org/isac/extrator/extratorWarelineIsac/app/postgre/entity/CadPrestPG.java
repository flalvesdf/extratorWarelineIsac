package br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cadprest")
public class CadPrestPG {
	
	@Id
	@Column(name="codprest")
	private String codprest;
	
	@Column(name="tipoprest")
	private String tipoprest;
	
	@Column(name="categprest")
	private String categprest;
	
	@Column(name="nomeprest")
	private String nomeprest;
	
	@Column(name="dataprest")
	private Date dataprest;
	
	@Column(name="bancoprest")
	private String bancoprest;
	
	@Column(name="contaprest")
	private String contaprest;
	
	@Column(name="codalter")
	private String codalter;
	
	@Column(name="crmdos")
	private String crmdos;
	
	@Column(name="codctbpre")
	private String codctbpre;
	
	@Column(name="codctbadi")
	private String codctbadi;
	
	@Column(name="codctbdesp")
	private String codctbdesp;
	
	@Column(name="soexames")
	private String soexames;
	
	@Column(name="datacorpo")
	private Date datacorpo;
	
	@Column(name="saidacorpo")
	private Date saidacorpo;
	
	@Column(name="cargo")
	private String cargo;
	
	@Column(name="codcc")
	private String codcc;
	
	@Column(name="inativo")
	private String inativo;
	
	@Column(name="crprest")
	private String crprest;
	
	@Column(name="apelido")
	private String apelido;
	
	@Column(name="cnes")
	private String cnes;
	
	@Column(name="siglacr")
	private String siglacr;
	
	@Column(name="permiteate")
	private String permiteate;
	
	@Column(name="ufcr")
	private String ufcr;
	
	@Column(name="datacrm")
	private Date datacrm;
	
	@Column(name="cbos")
	private String cbos;
	
	@Column(name="vincsus")
	private String vincsus;
	
	@Column(name="perceirrf")
	private String perceirrf;
	
	@Column(name="perceiss")
	private String perceiss;
	
	@Column(name="perceinss")
	private String perceinss;
	
	@Column(name="percecofin")
	private String percecofin;
	
	@Column(name="percepis")
	private String percepis;
	
	@Column(name="percecsll")
	private String percecsll;
	
	@Column(name="percecpc")
	private String percecpc;
	
	@Column(name="coddesp")
	private String coddesp;
	
	@Column(name="hpcompraav")
	private String hpcompraav;
	
	@Column(name="hpcomprapr")
	private String hpcomprapr;
	
	@Column(name="hppagtoav")
	private String hppagtoav;
	
	@Column(name="hppagtoprz")
	private String hppagtoprz;
	
	@Column(name="hppagtopar")
	private String hppagtopar;
	
	@Column(name="obrigcompl")
	private String obrigcompl;
	
	@Column(name="ageprest")
	private String ageprest;
	
	@Column(name="fatuminimo")
	private String fatuminimo;
	
	@Column(name="gruporepa")
	private String gruporepa;
	
	@Column(name="obsprest")
	private String obsprest;
	
	@Column(name="equipesug")
	private String equipesug;
	
	@Column(name="cbo")
	private String cbo;
	
	@Column(name="divideval")
	private String divideval;
	
	@Column(name="prazoentr")
	private String prazoentr;
	
	@Column(name="formapg")
	private String formapg;
	
	@Column(name="prioridade")
	private String prioridade;
	
	@Column(name="valiprop")
	private String valiprop;
	
	@Column(name="condpagto")
	private String condpagto;
	
	@Column(name="percecompl")
	private String percecompl;
	
	@Column(name="codopecad")
	private String codopecad;
	
	@Column(name="codopeatu")
	private String codopeatu;
	
	@Column(name="dtdemissao")
	private Date dtdemissao;
	
	@Column(name="txtevomed")
	private String txtevomed;
	
	@Column(name="txtevoana")
	private String txtevoana;
	
	@Column(name="txtevoenf")
	private String txtevoenf;
	
	@Column(name="txtevorec")
	private String txtevorec;
	
	@Column(name="codconexa")
	private String codconexa;
	
	@Column(name="qtd1")
	private String qtd1;
	
	@Column(name="obsrestri")
	private String obsrestri;
	
	@Column(name="permitei")
	private String permitei;
	
	@Column(name="permitea")
	private String permitea;
	
	@Column(name="permitee")
	private String permitee;
	
	@Column(name="codgrupre")
	private String codgrupre;
	
	@Column(name="recebfilme")
	private String recebfilme;
	
	@Column(name="ctbexcede")
	private String ctbexcede;
	
	@Column(name="maxpedmes")
	private String maxpedmes;
	
	@Column(name="outrafonte")
	private String outrafonte;
	
	@Column(name="tiprepasse")
	private String tiprepasse;
	
	@Column(name="dtadmissao")
	private String dtadmissao;
	
	@Column(name="maxpedido")
	private String maxpedido;
	
	@Column(name="obrigaequi")
	private String obrigaequi;
	
	@Column(name="prestresp")
	private String prestresp;
	
	@Column(name="assinaelet")
	private String assinaelet;
	
	@Column(name="cnespf")
	private String cnespf;
	
	@Column(name="prefeitura")
	private String prefeitura;
	
	@Column(name="tiprecolhe")
	private String tiprecolhe;
	
	@Column(name="tiposervi")
	private String tiposervi;
	
	@Column(name="tipoativ")
	private String tipoativ;
	
	@Column(name="assinamax")
	private String assinamax;
	
	@Column(name="prestserv")
	private String prestserv;
	
	@Column(name="codarquivo")
	private String codarquivo;
	
	@Column(name="recados")
	private String recados;
	
	@Column(name="autoraih")
	private String autoraih;
	
	@Column(name="codperiodo")
	private String codperiodo;
	
	@Column(name="msgagravo")
	private String msgagravo;
	
	@Column(name="tiposervico")
	private String tiposervico;
	
	@Column(name="coddepara")
	private String coddepara;
	
	@Column(name="formapagto")
	private String formapagto;
	
	@Column(name="formalanca")
	private String formalanca;
	
	@Column(name="prevfds")
	private String prevfds;
	
	@Column(name="agendaweb")
	private String agendaweb;
	
	@Column(name="prestprec")
	private String prestprec;
	
	@Column(name="datultatu")
	private Timestamp tipodatultatuservico;
	
	@Column(name="domfisca")
	private String domfisca;
	
	@Column(name="cfps")
	private String cfps;
	
	@Column(name="recebevadv")
	private String recebevadv;
	
	@Column(name="codativ")
	private String codativ;
	
	@Column(name="contcprb")
	private String contcprb;
	
	@Column(name="subcateg")
	private String subcateg;
	
	@Column(name="indcprb")
	private String indcprb;
	
	public String getCodprest() {
		return codprest;
	}

	public void setCodprest(String codprest) {
		this.codprest = codprest;
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

	public String getBancoprest() {
		return bancoprest;
	}

	public void setBancoprest(String bancoprest) {
		this.bancoprest = bancoprest;
	}

	public String getContaprest() {
		return contaprest;
	}

	public void setContaprest(String contaprest) {
		this.contaprest = contaprest;
	}

	public String getCodalter() {
		return codalter;
	}

	public void setCodalter(String codalter) {
		this.codalter = codalter;
	}

	public String getCrmdos() {
		return crmdos;
	}

	public void setCrmdos(String crmdos) {
		this.crmdos = crmdos;
	}

	public String getCodctbpre() {
		return codctbpre;
	}

	public void setCodctbpre(String codctbpre) {
		this.codctbpre = codctbpre;
	}

	public String getCodctbadi() {
		return codctbadi;
	}

	public void setCodctbadi(String codctbadi) {
		this.codctbadi = codctbadi;
	}

	public String getCodctbdesp() {
		return codctbdesp;
	}

	public void setCodctbdesp(String codctbdesp) {
		this.codctbdesp = codctbdesp;
	}

	public String getSoexames() {
		return soexames;
	}

	public void setSoexames(String soexames) {
		this.soexames = soexames;
	}

	public Date getDatacorpo() {
		return datacorpo;
	}

	public void setDatacorpo(Date datacorpo) {
		this.datacorpo = datacorpo;
	}

	public Date getSaidacorpo() {
		return saidacorpo;
	}

	public void setSaidacorpo(Date saidacorpo) {
		this.saidacorpo = saidacorpo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCodcc() {
		return codcc;
	}

	public void setCodcc(String codcc) {
		this.codcc = codcc;
	}

	public String getInativo() {
		return inativo;
	}

	public void setInativo(String inativo) {
		this.inativo = inativo;
	}

	public String getCrprest() {
		return crprest;
	}

	public void setCrprest(String crprest) {
		this.crprest = crprest;
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

	public String getSiglacr() {
		return siglacr;
	}

	public void setSiglacr(String siglacr) {
		this.siglacr = siglacr;
	}

	public String getPermiteate() {
		return permiteate;
	}

	public void setPermiteate(String permiteate) {
		this.permiteate = permiteate;
	}

	public String getUfcr() {
		return ufcr;
	}

	public void setUfcr(String ufcr) {
		this.ufcr = ufcr;
	}

	public Date getDatacrm() {
		return datacrm;
	}

	public void setDatacrm(Date datacrm) {
		this.datacrm = datacrm;
	}

	public String getCbos() {
		return cbos;
	}

	public void setCbos(String cbos) {
		this.cbos = cbos;
	}

	public String getVincsus() {
		return vincsus;
	}

	public void setVincsus(String vincsus) {
		this.vincsus = vincsus;
	}

	public String getPerceirrf() {
		return perceirrf;
	}

	public void setPerceirrf(String perceirrf) {
		this.perceirrf = perceirrf;
	}

	public String getPerceiss() {
		return perceiss;
	}

	public void setPerceiss(String perceiss) {
		this.perceiss = perceiss;
	}

	public String getPerceinss() {
		return perceinss;
	}

	public void setPerceinss(String perceinss) {
		this.perceinss = perceinss;
	}

	public String getPercecofin() {
		return percecofin;
	}

	public void setPercecofin(String percecofin) {
		this.percecofin = percecofin;
	}

	public String getPercepis() {
		return percepis;
	}

	public void setPercepis(String percepis) {
		this.percepis = percepis;
	}

	public String getPercecsll() {
		return percecsll;
	}

	public void setPercecsll(String percecsll) {
		this.percecsll = percecsll;
	}

	public String getPercecpc() {
		return percecpc;
	}

	public void setPercecpc(String percecpc) {
		this.percecpc = percecpc;
	}

	public String getCoddesp() {
		return coddesp;
	}

	public void setCoddesp(String coddesp) {
		this.coddesp = coddesp;
	}

	public String getHpcompraav() {
		return hpcompraav;
	}

	public void setHpcompraav(String hpcompraav) {
		this.hpcompraav = hpcompraav;
	}

	public String getHpcomprapr() {
		return hpcomprapr;
	}

	public void setHpcomprapr(String hpcomprapr) {
		this.hpcomprapr = hpcomprapr;
	}

	public String getHppagtoav() {
		return hppagtoav;
	}

	public void setHppagtoav(String hppagtoav) {
		this.hppagtoav = hppagtoav;
	}

	public String getHppagtoprz() {
		return hppagtoprz;
	}

	public void setHppagtoprz(String hppagtoprz) {
		this.hppagtoprz = hppagtoprz;
	}

	public String getHppagtopar() {
		return hppagtopar;
	}

	public void setHppagtopar(String hppagtopar) {
		this.hppagtopar = hppagtopar;
	}

	public String getObrigcompl() {
		return obrigcompl;
	}

	public void setObrigcompl(String obrigcompl) {
		this.obrigcompl = obrigcompl;
	}

	public String getAgeprest() {
		return ageprest;
	}

	public void setAgeprest(String ageprest) {
		this.ageprest = ageprest;
	}

	public String getFatuminimo() {
		return fatuminimo;
	}

	public void setFatuminimo(String fatuminimo) {
		this.fatuminimo = fatuminimo;
	}

	public String getGruporepa() {
		return gruporepa;
	}

	public void setGruporepa(String gruporepa) {
		this.gruporepa = gruporepa;
	}

	public String getObsprest() {
		return obsprest;
	}

	public void setObsprest(String obsprest) {
		this.obsprest = obsprest;
	}

	public String getEquipesug() {
		return equipesug;
	}

	public void setEquipesug(String equipesug) {
		this.equipesug = equipesug;
	}

	public String getCbo() {
		return cbo;
	}

	public void setCbo(String cbo) {
		this.cbo = cbo;
	}

	public String getDivideval() {
		return divideval;
	}

	public void setDivideval(String divideval) {
		this.divideval = divideval;
	}

	public String getPrazoentr() {
		return prazoentr;
	}

	public void setPrazoentr(String prazoentr) {
		this.prazoentr = prazoentr;
	}

	public String getFormapg() {
		return formapg;
	}

	public void setFormapg(String formapg) {
		this.formapg = formapg;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public String getValiprop() {
		return valiprop;
	}

	public void setValiprop(String valiprop) {
		this.valiprop = valiprop;
	}

	public String getCondpagto() {
		return condpagto;
	}

	public void setCondpagto(String condpagto) {
		this.condpagto = condpagto;
	}

	public String getPercecompl() {
		return percecompl;
	}

	public void setPercecompl(String percecompl) {
		this.percecompl = percecompl;
	}

	public String getCodopecad() {
		return codopecad;
	}

	public void setCodopecad(String codopecad) {
		this.codopecad = codopecad;
	}

	public String getCodopeatu() {
		return codopeatu;
	}

	public void setCodopeatu(String codopeatu) {
		this.codopeatu = codopeatu;
	}

	public Date getDtdemissao() {
		return dtdemissao;
	}

	public void setDtdemissao(Date dtdemissao) {
		this.dtdemissao = dtdemissao;
	}

	public String getTxtevomed() {
		return txtevomed;
	}

	public void setTxtevomed(String txtevomed) {
		this.txtevomed = txtevomed;
	}

	public String getTxtevoana() {
		return txtevoana;
	}

	public void setTxtevoana(String txtevoana) {
		this.txtevoana = txtevoana;
	}

	public String getTxtevoenf() {
		return txtevoenf;
	}

	public void setTxtevoenf(String txtevoenf) {
		this.txtevoenf = txtevoenf;
	}

	public String getTxtevorec() {
		return txtevorec;
	}

	public void setTxtevorec(String txtevorec) {
		this.txtevorec = txtevorec;
	}

	public String getCodconexa() {
		return codconexa;
	}

	public void setCodconexa(String codconexa) {
		this.codconexa = codconexa;
	}

	public String getQtd1() {
		return qtd1;
	}

	public void setQtd1(String qtd1) {
		this.qtd1 = qtd1;
	}

	public String getObsrestri() {
		return obsrestri;
	}

	public void setObsrestri(String obsrestri) {
		this.obsrestri = obsrestri;
	}

	public String getPermitei() {
		return permitei;
	}

	public void setPermitei(String permitei) {
		this.permitei = permitei;
	}

	public String getPermitea() {
		return permitea;
	}

	public void setPermitea(String permitea) {
		this.permitea = permitea;
	}

	public String getPermitee() {
		return permitee;
	}

	public void setPermitee(String permitee) {
		this.permitee = permitee;
	}

	public String getCodgrupre() {
		return codgrupre;
	}

	public void setCodgrupre(String codgrupre) {
		this.codgrupre = codgrupre;
	}

	public String getRecebfilme() {
		return recebfilme;
	}

	public void setRecebfilme(String recebfilme) {
		this.recebfilme = recebfilme;
	}

	public String getCtbexcede() {
		return ctbexcede;
	}

	public void setCtbexcede(String ctbexcede) {
		this.ctbexcede = ctbexcede;
	}

	public String getMaxpedmes() {
		return maxpedmes;
	}

	public void setMaxpedmes(String maxpedmes) {
		this.maxpedmes = maxpedmes;
	}

	public String getOutrafonte() {
		return outrafonte;
	}

	public void setOutrafonte(String outrafonte) {
		this.outrafonte = outrafonte;
	}

	public String getTiprepasse() {
		return tiprepasse;
	}

	public void setTiprepasse(String tiprepasse) {
		this.tiprepasse = tiprepasse;
	}

	public String getDtadmissao() {
		return dtadmissao;
	}

	public void setDtadmissao(String dtadmissao) {
		this.dtadmissao = dtadmissao;
	}

	public String getMaxpedido() {
		return maxpedido;
	}

	public void setMaxpedido(String maxpedido) {
		this.maxpedido = maxpedido;
	}

	public String getObrigaequi() {
		return obrigaequi;
	}

	public void setObrigaequi(String obrigaequi) {
		this.obrigaequi = obrigaequi;
	}

	public String getPrestresp() {
		return prestresp;
	}

	public void setPrestresp(String prestresp) {
		this.prestresp = prestresp;
	}

	public String getAssinaelet() {
		return assinaelet;
	}

	public void setAssinaelet(String assinaelet) {
		this.assinaelet = assinaelet;
	}

	public String getCnespf() {
		return cnespf;
	}

	public void setCnespf(String cnespf) {
		this.cnespf = cnespf;
	}

	public String getPrefeitura() {
		return prefeitura;
	}

	public void setPrefeitura(String prefeitura) {
		this.prefeitura = prefeitura;
	}

	public String getTiprecolhe() {
		return tiprecolhe;
	}

	public void setTiprecolhe(String tiprecolhe) {
		this.tiprecolhe = tiprecolhe;
	}

	public String getTiposervi() {
		return tiposervi;
	}

	public void setTiposervi(String tiposervi) {
		this.tiposervi = tiposervi;
	}

	public String getTipoativ() {
		return tipoativ;
	}

	public void setTipoativ(String tipoativ) {
		this.tipoativ = tipoativ;
	}

	public String getAssinamax() {
		return assinamax;
	}

	public void setAssinamax(String assinamax) {
		this.assinamax = assinamax;
	}

	public String getPrestserv() {
		return prestserv;
	}

	public void setPrestserv(String prestserv) {
		this.prestserv = prestserv;
	}

	public String getCodarquivo() {
		return codarquivo;
	}

	public void setCodarquivo(String codarquivo) {
		this.codarquivo = codarquivo;
	}

	public String getRecados() {
		return recados;
	}

	public void setRecados(String recados) {
		this.recados = recados;
	}

	public String getAutoraih() {
		return autoraih;
	}

	public void setAutoraih(String autoraih) {
		this.autoraih = autoraih;
	}

	public String getCodperiodo() {
		return codperiodo;
	}

	public void setCodperiodo(String codperiodo) {
		this.codperiodo = codperiodo;
	}

	public String getMsgagravo() {
		return msgagravo;
	}

	public void setMsgagravo(String msgagravo) {
		this.msgagravo = msgagravo;
	}

	public String getTiposervico() {
		return tiposervico;
	}

	public void setTiposervico(String tiposervico) {
		this.tiposervico = tiposervico;
	}

	public String getCoddepara() {
		return coddepara;
	}

	public void setCoddepara(String coddepara) {
		this.coddepara = coddepara;
	}

	public String getFormapagto() {
		return formapagto;
	}

	public void setFormapagto(String formapagto) {
		this.formapagto = formapagto;
	}

	public String getFormalanca() {
		return formalanca;
	}

	public void setFormalanca(String formalanca) {
		this.formalanca = formalanca;
	}

	public String getPrevfds() {
		return prevfds;
	}

	public void setPrevfds(String prevfds) {
		this.prevfds = prevfds;
	}

	public String getAgendaweb() {
		return agendaweb;
	}

	public void setAgendaweb(String agendaweb) {
		this.agendaweb = agendaweb;
	}

	public String getPrestprec() {
		return prestprec;
	}

	public void setPrestprec(String prestprec) {
		this.prestprec = prestprec;
	}

	public Timestamp getTipodatultatuservico() {
		return tipodatultatuservico;
	}

	public void setTipodatultatuservico(Timestamp tipodatultatuservico) {
		this.tipodatultatuservico = tipodatultatuservico;
	}

	public String getDomfisca() {
		return domfisca;
	}

	public void setDomfisca(String domfisca) {
		this.domfisca = domfisca;
	}

	public String getCfps() {
		return cfps;
	}

	public void setCfps(String cfps) {
		this.cfps = cfps;
	}

	public String getRecebevadv() {
		return recebevadv;
	}

	public void setRecebevadv(String recebevadv) {
		this.recebevadv = recebevadv;
	}

	public String getCodativ() {
		return codativ;
	}

	public void setCodativ(String codativ) {
		this.codativ = codativ;
	}

	public String getContcprb() {
		return contcprb;
	}

	public void setContcprb(String contcprb) {
		this.contcprb = contcprb;
	}

	public String getSubcateg() {
		return subcateg;
	}

	public void setSubcateg(String subcateg) {
		this.subcateg = subcateg;
	}

	public String getIndcprb() {
		return indcprb;
	}

	public void setIndcprb(String indcprb) {
		this.indcprb = indcprb;
	}
}