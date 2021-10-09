package br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pt_wl_cadfunc")
public class CadFuncWareline {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="codprest")
	private String codprest;
	
	@Column(name="datnasfunc")
	private String datnasfunc;
	
	@Column(name="sexofunc")
	private String sexofunc;
	
	@Column(name="estcivfunc")
	private String estcivfunc;
	
	@Column(name="enderfunc")
	private String enderfunc;
	
	@Column(name="cepfunc")
	private String cepfunc;
	
	@Column(name="bairrofunc")
	private String bairrofunc;
	
	@Column(name="cidadefunc")
	private String cidadefunc;
	
	@Column(name="uffunc")
	private String uffunc;
	
	@Column(name="cidnasfunc")
	private String cidnasfunc;
	
	@Column(name="ufnasfunc")
	private String ufnasfunc;
	
	@Column(name="nacnasfunc")
	private String nacnasfunc;
	
	@Column(name="datentfunc")
	private Date datentfunc;
	
	@Column(name="fonefunc")
	private String fonefunc;
	
	@Column(name="faxfunc")
	private String faxfunc;
	
	@Column(name="celfunc")
	private String celfunc;
	
	@Column(name="bipfunc")
	private String bipfunc;
	
	@Column(name="emailfunc")
	private String emailfunc;
	
	@Column(name="paifunc")
	private String paifunc;
	
	@Column(name="maefunc")
	private String maefunc;
	
	@Column(name="conjfunc")
	private String conjfunc;
	
	@Column(name="rgfunc")
	private String rgfunc;
	
	@Column(name="ufrgfunc")
	private String ufrgfunc;
	
	@Column(name="orgrgfunc")
	private String orgrgfunc;
	
	@Column(name="datargfunc")
	private Date datargfunc;
	
	@Column(name="tipcerfunc")
	private String tipcerfunc;
	
	@Column(name="cartofunc")
	private String cartofunc;
	
	@Column(name="livrofunc")
	private String livrofunc;
	
	@Column(name="flsfunc")
	private String flsfunc;
	
	@Column(name="termofunc")
	private String termofunc;
	
	@Column(name="datcerfunc")
	private Date datcerfunc;
	
	@Column(name="cpffunc")
	private String cpffunc;
	
	@Column(name="pisfunc")
	private String pisfunc;

	@Column(name="corfunc")
	private String corfunc;
	
	@Column(name="cartrafunc")
	private String cartrafunc;
	
	@Column(name="corpocli")
	private String corpocli;
	
	@Column(name="guerrafunc")
	private String guerrafunc;
	
	@Column(name="emirgfunc")
	private String emirgfunc;
	
	@Column(name="numdepend")
	private Integer numdepend;
	
	@Column(name="tipologrfu")
	private String tipologrfu;
	
	@Column(name="lografu")
	private String lografu;
	
	@Column(name="numlogrfu")
	private String numlogrfu;
	
	@Column(name="complefu")
	private String complefu;
	
	@Column(name="ibgefu")
	private String ibgefu;
	
	@Column(name="email2func")
	private String email2func;
	
	@Column(name="serietrfunc")
	private String serietrfunc;
	
	@Column(name="unidade")
	private String unidade;
	
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

	public String getDatnasfunc() {
		return datnasfunc;
	}

	public void setDatnasfunc(String datnasfunc) {
		this.datnasfunc = datnasfunc;
	}

	public String getSexofunc() {
		return sexofunc;
	}

	public void setSexofunc(String sexofunc) {
		this.sexofunc = sexofunc;
	}

	public String getEstcivfunc() {
		return estcivfunc;
	}

	public void setEstcivfunc(String estcivfunc) {
		this.estcivfunc = estcivfunc;
	}

	public String getEnderfunc() {
		return enderfunc;
	}

	public void setEnderfunc(String enderfunc) {
		this.enderfunc = enderfunc;
	}

	public String getCepfunc() {
		return cepfunc;
	}

	public void setCepfunc(String cepfunc) {
		this.cepfunc = cepfunc;
	}

	public String getBairrofunc() {
		return bairrofunc;
	}

	public void setBairrofunc(String bairrofunc) {
		this.bairrofunc = bairrofunc;
	}

	public String getCidadefunc() {
		return cidadefunc;
	}

	public void setCidadefunc(String cidadefunc) {
		this.cidadefunc = cidadefunc;
	}

	public String getUffunc() {
		return uffunc;
	}

	public void setUffunc(String uffunc) {
		this.uffunc = uffunc;
	}

	public String getCidnasfunc() {
		return cidnasfunc;
	}

	public void setCidnasfunc(String cidnasfunc) {
		this.cidnasfunc = cidnasfunc;
	}

	public String getUfnasfunc() {
		return ufnasfunc;
	}

	public void setUfnasfunc(String ufnasfunc) {
		this.ufnasfunc = ufnasfunc;
	}

	public String getNacnasfunc() {
		return nacnasfunc;
	}

	public void setNacnasfunc(String nacnasfunc) {
		this.nacnasfunc = nacnasfunc;
	}

	public Date getDatentfunc() {
		return datentfunc;
	}

	public void setDatentfunc(Date datentfunc) {
		this.datentfunc = datentfunc;
	}

	public String getFonefunc() {
		return fonefunc;
	}

	public void setFonefunc(String fonefunc) {
		this.fonefunc = fonefunc;
	}

	public String getFaxfunc() {
		return faxfunc;
	}

	public void setFaxfunc(String faxfunc) {
		this.faxfunc = faxfunc;
	}

	public String getCelfunc() {
		return celfunc;
	}

	public void setCelfunc(String celfunc) {
		this.celfunc = celfunc;
	}

	public String getBipfunc() {
		return bipfunc;
	}

	public void setBipfunc(String bipfunc) {
		this.bipfunc = bipfunc;
	}

	public String getEmailfunc() {
		return emailfunc;
	}

	public void setEmailfunc(String emailfunc) {
		this.emailfunc = emailfunc;
	}

	public String getPaifunc() {
		return paifunc;
	}

	public void setPaifunc(String paifunc) {
		this.paifunc = paifunc;
	}

	public String getMaefunc() {
		return maefunc;
	}

	public void setMaefunc(String maefunc) {
		this.maefunc = maefunc;
	}

	public String getConjfunc() {
		return conjfunc;
	}

	public void setConjfunc(String conjfunc) {
		this.conjfunc = conjfunc;
	}

	public String getRgfunc() {
		return rgfunc;
	}

	public void setRgfunc(String rgfunc) {
		this.rgfunc = rgfunc;
	}

	public String getUfrgfunc() {
		return ufrgfunc;
	}

	public void setUfrgfunc(String ufrgfunc) {
		this.ufrgfunc = ufrgfunc;
	}

	public String getOrgrgfunc() {
		return orgrgfunc;
	}

	public void setOrgrgfunc(String orgrgfunc) {
		this.orgrgfunc = orgrgfunc;
	}

	public Date getDatargfunc() {
		return datargfunc;
	}

	public void setDatargfunc(Date datargfunc) {
		this.datargfunc = datargfunc;
	}

	public String getTipcerfunc() {
		return tipcerfunc;
	}

	public void setTipcerfunc(String tipcerfunc) {
		this.tipcerfunc = tipcerfunc;
	}

	public String getCartofunc() {
		return cartofunc;
	}

	public void setCartofunc(String cartofunc) {
		this.cartofunc = cartofunc;
	}

	public String getLivrofunc() {
		return livrofunc;
	}

	public void setLivrofunc(String livrofunc) {
		this.livrofunc = livrofunc;
	}

	public String getFlsfunc() {
		return flsfunc;
	}

	public void setFlsfunc(String flsfunc) {
		this.flsfunc = flsfunc;
	}

	public String getTermofunc() {
		return termofunc;
	}

	public void setTermofunc(String termofunc) {
		this.termofunc = termofunc;
	}

	public Date getDatcerfunc() {
		return datcerfunc;
	}

	public void setDatcerfunc(Date datcerfunc) {
		this.datcerfunc = datcerfunc;
	}

	public String getCpffunc() {
		return cpffunc;
	}

	public void setCpffunc(String cpffunc) {
		this.cpffunc = cpffunc;
	}

	public String getPisfunc() {
		return pisfunc;
	}

	public void setPisfunc(String pisfunc) {
		this.pisfunc = pisfunc;
	}

	public String getCorfunc() {
		return corfunc;
	}

	public void setCorfunc(String corfunc) {
		this.corfunc = corfunc;
	}

	public String getCartrafunc() {
		return cartrafunc;
	}

	public void setCartrafunc(String cartrafunc) {
		this.cartrafunc = cartrafunc;
	}

	public String getCorpocli() {
		return corpocli;
	}

	public void setCorpocli(String corpocli) {
		this.corpocli = corpocli;
	}

	public String getGuerrafunc() {
		return guerrafunc;
	}

	public void setGuerrafunc(String guerrafunc) {
		this.guerrafunc = guerrafunc;
	}

	public String getEmirgfunc() {
		return emirgfunc;
	}

	public void setEmirgfunc(String emirgfunc) {
		this.emirgfunc = emirgfunc;
	}

	public Integer getNumdepend() {
		return numdepend;
	}

	public void setNumdepend(Integer numdepend) {
		this.numdepend = numdepend;
	}

	public String getTipologrfu() {
		return tipologrfu;
	}

	public void setTipologrfu(String tipologrfu) {
		this.tipologrfu = tipologrfu;
	}

	public String getLografu() {
		return lografu;
	}

	public void setLografu(String lografu) {
		this.lografu = lografu;
	}

	public String getNumlogrfu() {
		return numlogrfu;
	}

	public void setNumlogrfu(String numlogrfu) {
		this.numlogrfu = numlogrfu;
	}

	public String getComplefu() {
		return complefu;
	}

	public void setComplefu(String complefu) {
		this.complefu = complefu;
	}

	public String getIbgefu() {
		return ibgefu;
	}

	public void setIbgefu(String ibgefu) {
		this.ibgefu = ibgefu;
	}

	public String getEmail2func() {
		return email2func;
	}

	public void setEmail2func(String email2func) {
		this.email2func = email2func;
	}

	public String getSerietrfunc() {
		return serietrfunc;
	}

	public void setSerietrfunc(String serietrfunc) {
		this.serietrfunc = serietrfunc;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public Timestamp getTsobtencaoinformacao() {
		return tsobtencaoinformacao;
	}

	public void setTsobtencaoinformacao(Timestamp tsobtencaoinformacao) {
		this.tsobtencaoinformacao = tsobtencaoinformacao;
	}
}