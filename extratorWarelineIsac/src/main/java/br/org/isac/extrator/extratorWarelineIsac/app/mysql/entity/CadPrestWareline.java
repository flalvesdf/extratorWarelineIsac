package br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "pt_wl_cadprest")
public class CadPrestWareline {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Size(min=0, max=6)
	@Column(name="codprest")
	private String codprest;
	
	@Size(min=0, max=1)
	@Column(name="tipoprest")
	private String tipoprest;
	
	@Size(min=0, max=2)
	@Column(name="categprest")
	private String categprest;
	
	@Size(min=0, max=255)
	@Column(name="nomeprest")
	private String nomeprest;
	
	@Column(name="dataprest")
	private Date dataprest;
	
	@Size(min=0, max=3)
	@Column(name="bancoprest")
	private String bancoprest;
	
	@Size(min=0, max=13)
	@Column(name="contaprest")
	private String contaprest;
	
	@Size(min=0, max=6)
	@Column(name="codalter")
	private String codalter;
	
	@Size(min=0, max=6)
	@Column(name="crmdos")
	private String crmdos;
	
	@Size(min=0, max=6)
	@Column(name="codctbpre")
	private String codctbpre;
	
	@Size(min=0, max=6)
	@Column(name="codctbadi")
	private String codctbadi;
	
	@Size(min=0, max=6)
	@Column(name="codctbdesp")
	private String codctbdesp;
	
	@Size(min=0, max=1)
	@Column(name="soexames")
	private String soexames;
	
	@Column(name="datacorpo")
	private Date datacorpo;
	
	@Column(name="saidacorpo")
	private Date saidacorpo;
	
	@Size(min=0, max=30)
	@Column(name="cargo")
	private String cargo;
	
	@Size(min=0, max=6)
	@Column(name="codcc")
	private String codcc;
	
	@Size(min=0, max=1)
	@Column(name="inativo")
	private String inativo;
	
	@Size(min=0, max=10)
	@Column(name="crprest")
	private String crprest;
	
	@Size(min=0, max=20)
	@Column(name="apelido")
	private String apelido;
	
	@Size(min=0, max=15)
	@Column(name="cnes")
	private String cnes;
	
	@Size(min=0, max=7)
	@Column(name="siglacr")
	private String siglacr;
	
	@Size(min=0, max=1)
	@Column(name="permiteate")
	private String permiteate;
	
	@Size(min=0, max=2)
	@Column(name="ufcr")
	private String ufcr;
	
	@Column(name="datacrm")
	private Date datacrm;
	
	@Size(min=0, max=5)
	@Column(name="cbos")
	private String cbos;
	
	@Size(min=0, max=2)
	@Column(name="vincsus")
	private String vincsus;
	
	@Size(min=0, max=10)
	@Column(name="perceirrf")
	private String perceirrf;
	
	@Size(min=0, max=10)
	@Column(name="perceiss")
	private String perceiss;
	
	@Size(min=0, max=10)
	@Column(name="perceinss")
	private String perceinss;
	
	@Size(min=0, max=10)
	@Column(name="percecofin")
	private String percecofin;
	
	@Size(min=0, max=10)
	@Column(name="percepis")
	private String percepis;
	
	@Size(min=0, max=10)
	@Column(name="percecsll")
	private String percecsll;
	
	@Size(min=0, max=10)
	@Column(name="percecpc")
	private String percecpc;
	
	@Size(min=0, max=6)
	@Column(name="coddesp")
	private String coddesp;
	
	@Size(min=0, max=4)
	@Column(name="hpcompraav")
	private String hpcompraav;
	
	@Size(min=0, max=4)
	@Column(name="hpcomprapr")
	private String hpcomprapr;
	
	@Size(min=0, max=4)
	@Column(name="hppagtoav")
	private String hppagtoav;
	
	@Size(min=0, max=4)
	@Column(name="hppagtoprz")
	private String hppagtoprz;
	
	@Size(min=0, max=4)
	@Column(name="hppagtopar")
	private String hppagtopar;
	
	@Size(min=0, max=1)
	@Column(name="obrigcompl")
	private String obrigcompl;
	
	@Size(min=0, max=6)
	@Column(name="ageprest")
	private String ageprest;
	
	@Size(min=0, max=11)
	@Column(name="fatuminimo")
	private String fatuminimo;
	
	@Size(min=0, max=4)
	@Column(name="gruporepa")
	private String gruporepa;
	
	@Size(min=0, max=4000)
	@Column(name="obsprest")
	private String obsprest;
	
	@Size(min=0, max=6)
	@Column(name="equipesug")
	private String equipesug;
	
	@Size(min=0, max=6)
	@Column(name="cbo")
	private String cbo;
	
	@Size(min=0, max=1)
	@Column(name="divideval")
	private String divideval;
	
	@Size(min=0, max=3)
	@Column(name="prazoentr")
	private String prazoentr;
	
	@Size(min=0, max=20)
	@Column(name="formapg")
	private String formapg;
	
	@Size(min=0, max=4)
	@Column(name="prioridade")
	private String prioridade;
	
	@Size(min=0, max=3)
	@Column(name="valiprop")
	private String valiprop;
	
	@Size(min=0, max=3)
	@Column(name="condpagto")
	private String condpagto;
	
	@Size(min=0, max=5)
	@Column(name="percecompl")
	private String percecompl;
	
	@Size(min=0, max=6)
	@Column(name="codopecad")
	private String codopecad;
	
	@Size(min=0, max=6)
	@Column(name="codopeatu")
	private String codopeatu;
	
	@Column(name="dtdemissao")
	private Date dtdemissao;
	
	@Size(min=0, max=4)
	@Column(name="txtevomed")
	private String txtevomed;
	
	@Size(min=0, max=4)
	@Column(name="txtevoana")
	private String txtevoana;
	
	@Size(min=0, max=4)
	@Column(name="txtevoenf")
	private String txtevoenf;
	
	@Size(min=0, max=4)
	@Column(name="txtevorec")
	private String txtevorec;
	
	@Size(min=0, max=11)
	@Column(name="codconexa")
	private String codconexa;
	
	@Size(min=0, max=1)
	@Column(name="qtd1")
	private String qtd1;
	
	@Size(min=0, max=4000)
	@Column(name="obsrestri")
	private String obsrestri;
	
	@Size(min=0, max=1)
	@Column(name="permitei")
	private String permitei;
	
	@Size(min=0, max=1)
	@Column(name="permitea")
	private String permitea;
	
	@Size(min=0, max=1)
	@Column(name="permitee")
	private String permitee;
	
	@Size(min=0, max=4)
	@Column(name="codgrupre")
	private String codgrupre;
	
	@Size(min=0, max=1)
	@Column(name="recebfilme")
	private String recebfilme;
	
	@Size(min=0, max=6)
	@Column(name="ctbexcede")
	private String ctbexcede;
	
	@Size(min=0, max=14)
	@Column(name="maxpedmes")
	private String maxpedmes;
	
	@Size(min=0, max=1)
	@Column(name="outrafonte")
	private String outrafonte;
	
	@Size(min=0, max=1)
	@Column(name="tiprepasse")
	private String tiprepasse;
	
	@Column(name="dtadmissao")
	private String dtadmissao;
	
	@Size(min=0, max=14)
	@Column(name="maxpedido")
	private String maxpedido;
	
	@Size(min=0, max=1)
	@Column(name="obrigaequi")
	private String obrigaequi;
	
	@Size(min=0, max=6)
	@Column(name="prestresp")
	private String prestresp;
	
	@Size(min=0, max=1)
	@Column(name="assinaelet")
	private String assinaelet;
	
	@Size(min=0, max=7)
	@Column(name="cnespf")
	private String cnespf;
	
	@Size(min=0, max=1)
	@Column(name="prefeitura")
	private String prefeitura;
	
	@Size(min=0, max=1)
	@Column(name="tiprecolhe")
	private String tiprecolhe;
	
	@Size(min=0, max=40)
	@Column(name="tiposervi")
	private String tiposervi;
	
	@Size(min=0, max=40)
	@Column(name="tipoativ")
	private String tipoativ;
	
	@Size(min=0, max=1)
	@Column(name="assinamax")
	private String assinamax;
	
	@Size(min=0, max=1)
	@Column(name="prestserv")
	private String prestserv;
	
	@Size(min=0, max=20)
	@Column(name="codarquivo")
	private String codarquivo;
	
	@Size(min=0, max=200)
	@Column(name="recados")
	private String recados;
	
	@Size(min=0, max=1)
	@Column(name="autoraih")
	private String autoraih;
	
	@Size(min=0, max=5)
	@Column(name="codperiodo")
	private String codperiodo;
	
	@Size(min=0, max=1)
	@Column(name="msgagravo")
	private String msgagravo;
	
	@Size(min=0, max=9)
	@Column(name="tiposervico")
	private String tiposervico;
	
	@Size(min=0, max=30)
	@Column(name="coddepara")
	private String coddepara;
	
	@Size(min=0, max=1)
	@Column(name="formapagto")
	private String formapagto;
	
	@Size(min=0, max=2)
	@Column(name="formalanca")
	private String formalanca;
	
	@Size(min=0, max=1)
	@Column(name="prevfds")
	private String prevfds;
	
	@Size(min=0, max=11)
	@Column(name="agendaweb")
	private String agendaweb;
	
	@Size(min=0, max=6)
	@Column(name="prestprec")
	private String prestprec;
	
	@Column(name="datultatu")
	private Timestamp tipodatultatuservico;
	
	@Size(min=0, max=6)
	@Column(name="domfisca")
	private String domfisca;
	
	@Size(min=0, max=10)
	@Column(name="cfps")
	private String cfps;
	
	@Size(min=0, max=1)
	@Column(name="recebevadv")
	private String recebevadv;
	
	@Size(min=0, max=11)
	@Column(name="codativ")
	private String codativ;
	
	@Size(min=0, max=1)
	@Column(name="contcprb")
	private String contcprb;
	
	@Size(min=0, max=3)
	@Column(name="subcateg")
	private String subcateg;
	
	@Size(min=0, max=11)
	@Column(name="indcprb")
	private String indcprb;
	
	@Column(name="unidade")
	private Integer unidade;
	
	@Column(name="tsobtencaoinformacao")
	private Timestamp tsobtencaoinformacao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public Integer getUnidade() {
		return unidade;
	}

	public void setunidade(Integer unidade) {
		this.unidade = unidade;
	}

	public Timestamp getTsobtencaoinformacao() {
		return tsobtencaoinformacao;
	}

	public void setTsobtencaoinformacao(Timestamp tsobtencaoinformacao) {
		this.tsobtencaoinformacao = tsobtencaoinformacao;
	}
}