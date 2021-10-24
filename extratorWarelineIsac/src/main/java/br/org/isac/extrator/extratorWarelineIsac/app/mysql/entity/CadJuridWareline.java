package br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pt_wl_cadjurid")
public class CadJuridWareline {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="codprest")
	private String codprest;
	
	@Column(name="razaojuri")
	private String razaojuri;
	
	@Column(name="enderjuri")
	private String enderjuri;
	
	@Column(name="cepjuri")
	private String cepjuri;
	
	@Column(name="bairrojuri")
	private String bairrojuri;
	
	@Column(name="cidadejuri")
	private String cidadejuri;
	
	@Column(name="ufjuri")
	private String ufjuri;
	
	@Column(name="fonejuri")
	private String fonejuri;
	
	@Column(name="faxjuri")
	private String faxjuri;
	
	@Column(name="emailjuri")
	private String emailjuri;
	
	@Column(name="contatjuri")
	private String contatjuri;
	
	@Column(name="fonconjuri")
	private String fonconjuri;
	
	@Column(name="responjuri")
	private String responjuri;
	
	@Column(name="cnpjjuri")
	private String cnpjjuri;
	
	@Column(name="iejuri")
	private String iejuri;
	
	@Column(name="imjuri")
	private String imjuri;
	
	@Column(name="tipologrju")
	private String tipologrju;
	
	@Column(name="lograju")
	private String lograju;
	
	@Column(name="numlogrju")
	private String numlogrju;
	
	@Column(name="compleju")
	private String compleju;
	
	@Column(name="ibgeju")
	private String ibgeju;
	
	@Column(name="email2juri")
	private String email2juri;
	
	@Column(name="celjuri")
	private String celjuri;
	
	@Column(name="cooperativ")
	private String cooperativ;
	
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

	public String getRazaojuri() {
		return razaojuri;
	}

	public void setRazaojuri(String razaojuri) {
		this.razaojuri = razaojuri;
	}

	public String getEnderjuri() {
		return enderjuri;
	}

	public void setEnderjuri(String enderjuri) {
		this.enderjuri = enderjuri;
	}

	public String getCepjuri() {
		return cepjuri;
	}

	public void setCepjuri(String cepjuri) {
		this.cepjuri = cepjuri;
	}

	public String getBairrojuri() {
		return bairrojuri;
	}

	public void setBairrojuri(String bairrojuri) {
		this.bairrojuri = bairrojuri;
	}

	public String getCidadejuri() {
		return cidadejuri;
	}

	public void setCidadejuri(String cidadejuri) {
		this.cidadejuri = cidadejuri;
	}

	public String getUfjuri() {
		return ufjuri;
	}

	public void setUfjuri(String ufjuri) {
		this.ufjuri = ufjuri;
	}

	public String getFonejuri() {
		return fonejuri;
	}

	public void setFonejuri(String fonejuri) {
		this.fonejuri = fonejuri;
	}

	public String getFaxjuri() {
		return faxjuri;
	}

	public void setFaxjuri(String faxjuri) {
		this.faxjuri = faxjuri;
	}

	public String getEmailjuri() {
		return emailjuri;
	}

	public void setEmailjuri(String emailjuri) {
		this.emailjuri = emailjuri;
	}

	public String getContatjuri() {
		return contatjuri;
	}

	public void setContatjuri(String contatjuri) {
		this.contatjuri = contatjuri;
	}

	public String getFonconjuri() {
		return fonconjuri;
	}

	public void setFonconjuri(String fonconjuri) {
		this.fonconjuri = fonconjuri;
	}

	public String getResponjuri() {
		return responjuri;
	}

	public void setResponjuri(String responjuri) {
		this.responjuri = responjuri;
	}

	public String getCnpjjuri() {
		return cnpjjuri;
	}

	public void setCnpjjuri(String cnpjjuri) {
		this.cnpjjuri = cnpjjuri;
	}

	public String getIejuri() {
		return iejuri;
	}

	public void setIejuri(String iejuri) {
		this.iejuri = iejuri;
	}

	public String getImjuri() {
		return imjuri;
	}

	public void setImjuri(String imjuri) {
		this.imjuri = imjuri;
	}

	public String getTipologrju() {
		return tipologrju;
	}

	public void setTipologrju(String tipologrju) {
		this.tipologrju = tipologrju;
	}

	public String getLograju() {
		return lograju;
	}

	public void setLograju(String lograju) {
		this.lograju = lograju;
	}

	public String getNumlogrju() {
		return numlogrju;
	}

	public void setNumlogrju(String numlogrju) {
		this.numlogrju = numlogrju;
	}

	public String getCompleju() {
		return compleju;
	}

	public void setCompleju(String compleju) {
		this.compleju = compleju;
	}

	public String getIbgeju() {
		return ibgeju;
	}

	public void setIbgeju(String ibgeju) {
		this.ibgeju = ibgeju;
	}

	public String getEmail2juri() {
		return email2juri;
	}

	public void setEmail2juri(String email2juri) {
		this.email2juri = email2juri;
	}

	public String getCeljuri() {
		return celjuri;
	}

	public void setCeljuri(String celjuri) {
		this.celjuri = celjuri;
	}

	public String getCooperativ() {
		return cooperativ;
	}

	public void setCooperativ(String cooperativ) {
		this.cooperativ = cooperativ;
	}

	public Integer getUnidade() {
		return unidade;
	}

	public void setUnidade(Integer unidade) {
		this.unidade = unidade;
	}

	public Timestamp getTsobtencaoinformacao() {
		return tsobtencaoinformacao;
	}

	public void setTsobtencaoinformacao(Timestamp tsobtencaoinformacao) {
		this.tsobtencaoinformacao = tsobtencaoinformacao;
	}
}