package br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pt_wl_caduni")
public class CadUniWareline {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="coduni")
	private String coduni;
	
	@Column(name="codprest")
	private String codprest;
	
	@Column(name="codsus")
	private String codsus;
	
	@Column(name="orgaorec")
	private String orgaorec;
	
	@Column(name="medicoresp")
	private String medicoresp;
	
	@Column(name="medicoaudi")
	private String medicoaudi;
	
	@Column(name="medigestor")
	private String medigestor;
	
	@Column(name="percivhe")
	private String percivhe;
	
	@Column(name="percfideps")
	private String percfideps;
	
	@Column(name="numleitsus")
	private String numleitsus;
	
	@Column(name="distritsan")
	private String distritsan;
	
	@Column(name="regiaosaud")
	private String regiaosaud;
	
	@Column(name="nomeuni")
	private String nomeuni;
	
	@Column(name="orgaoemi")
	private String orgaoemi;
	
	@Column(name="secretdest")
	private String secretdest;
	
	@Column(name="tiposecret")
	private String tiposecret;
	
	@Column(name="medrespcir")
	private String medrespcir;
	
	@Column(name="medrespobs")
	private String medrespobs;
	
	@Column(name="digitpasta")
	private String digitpasta;
	
	@Column(name="codconexa")
	private String codconexa;
	
	@Column(name="inativo")
	private String inativo;
	
	@Column(name="cnes")
	private String cnes;
	
	@Column(name="idUnidade")
	private Integer idUnidade;
	
	@Column(name="tsObtencaoInformacao")
	private Timestamp tsObtencaoInformacao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCoduni() {
		return coduni;
	}

	public void setCoduni(String coduni) {
		this.coduni = coduni;
	}

	public String getCodprest() {
		return codprest;
	}

	public void setCodprest(String codprest) {
		this.codprest = codprest;
	}

	public String getCodsus() {
		return codsus;
	}

	public void setCodsus(String codsus) {
		this.codsus = codsus;
	}

	public String getOrgaorec() {
		return orgaorec;
	}

	public void setOrgaorec(String orgaorec) {
		this.orgaorec = orgaorec;
	}

	public String getMedicoresp() {
		return medicoresp;
	}

	public void setMedicoresp(String medicoresp) {
		this.medicoresp = medicoresp;
	}

	public String getMedicoaudi() {
		return medicoaudi;
	}

	public void setMedicoaudi(String medicoaudi) {
		this.medicoaudi = medicoaudi;
	}

	public String getMedigestor() {
		return medigestor;
	}

	public void setMedigestor(String medigestor) {
		this.medigestor = medigestor;
	}

	public String getPercivhe() {
		return percivhe;
	}

	public void setPercivhe(String percivhe) {
		this.percivhe = percivhe;
	}

	public String getPercfideps() {
		return percfideps;
	}

	public void setPercfideps(String percfideps) {
		this.percfideps = percfideps;
	}

	public String getNumleitsus() {
		return numleitsus;
	}

	public void setNumleitsus(String numleitsus) {
		this.numleitsus = numleitsus;
	}

	public String getDistritsan() {
		return distritsan;
	}

	public void setDistritsan(String distritsan) {
		this.distritsan = distritsan;
	}

	public String getRegiaosaud() {
		return regiaosaud;
	}

	public void setRegiaosaud(String regiaosaud) {
		this.regiaosaud = regiaosaud;
	}

	public String getNomeuni() {
		return nomeuni;
	}

	public void setNomeuni(String nomeuni) {
		this.nomeuni = nomeuni;
	}

	public String getOrgaoemi() {
		return orgaoemi;
	}

	public void setOrgaoemi(String orgaoemi) {
		this.orgaoemi = orgaoemi;
	}

	public String getSecretdest() {
		return secretdest;
	}

	public void setSecretdest(String secretdest) {
		this.secretdest = secretdest;
	}

	public String getTiposecret() {
		return tiposecret;
	}

	public void setTiposecret(String tiposecret) {
		this.tiposecret = tiposecret;
	}

	public String getMedrespcir() {
		return medrespcir;
	}

	public void setMedrespcir(String medrespcir) {
		this.medrespcir = medrespcir;
	}

	public String getMedrespobs() {
		return medrespobs;
	}

	public void setMedrespobs(String medrespobs) {
		this.medrespobs = medrespobs;
	}

	public String getDigitpasta() {
		return digitpasta;
	}

	public void setDigitpasta(String digitpasta) {
		this.digitpasta = digitpasta;
	}

	public String getCodconexa() {
		return codconexa;
	}

	public void setCodconexa(String codconexa) {
		this.codconexa = codconexa;
	}

	public String getInativo() {
		return inativo;
	}

	public void setInativo(String inativo) {
		this.inativo = inativo;
	}

	public String getCnes() {
		return cnes;
	}

	public void setCnes(String cnes) {
		this.cnes = cnes;
	}

	public Integer getIdUnidade() {
		return idUnidade;
	}

	public void setIdUnidade(Integer idUnidade) {
		this.idUnidade = idUnidade;
	}

	public Timestamp getTsObtencaoInformacao() {
		return tsObtencaoInformacao;
	}

	public void setTsObtencaoInformacao(Timestamp tsObtencaoInformacao) {
		this.tsObtencaoInformacao = tsObtencaoInformacao;
	}
}