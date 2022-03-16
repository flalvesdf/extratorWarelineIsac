package br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rcparcel")
public class RecebimentosParcelPG {

	@Id
	@Column(name="numrecebto")
	private Integer numrecebto ;
	
	@Column(name="parcela")
	private Integer parcela ;
	
	@Column(name="datavencto")
	private Date datavencto ;
	
	@Column(name="dataprev")
	private Date dataprev ;
	
	@Column(name="valorvenc")
	private Double valorvenc ;
	
	@Column(name="datrecebto")
	private Date datrecebto ;
	
	@Column(name="vlrecebido")
	private Double vlrecebido ;
	
	@Column(name="valorjuros")
	private Double valorjuros ;
	
	@Column(name="codmotjur")
	private String codmotjur ;
	
	@Column(name="valormulta")
	private Double valormulta ;
	
	@Column(name="codmotmul")
	private String codmotmul ;
	
	@Column(name="valordesc")
	private Double valordesc ;
	
	@Column(name="codmotdesc")
	private String codmotdesc ;
	
	@Column(name="codopebx")
	private String codopebx ;
	
	@Column(name="numrecibov")
	private Integer numrecibov ;
	
	@Column(name="codmotglo")
	private String codmotglo ;
	
	@Column(name="numreciboa")
	private Integer numreciboa ;
	
	@Column(name="valorglosa")
	private Double valorglosa ;
	
	@Column(name="vlimpostos")
	private Double vlimpostos ;
	
	@Column(name="valirrf")
	private Double valirrf ;
	
	@Column(name="valiss")
	private Double valiss ;
	
	@Column(name="valinss")
	private Double valinss ;
	
	@Column(name="valcofins")
	private Double valcofins ;
	
	@Column(name="valpis")
	private Double valpis ;
	
	@Column(name="valcsll")
	private Double valcsll ;
	
	@Column(name="valcpc")
	private Double valcpc ;
	
	@Column(name="valicms")
	private Double valicms ;

	public Integer getNumrecebto() {
		return numrecebto;
	}

	public void setNumrecebto(Integer numrecebto) {
		this.numrecebto = numrecebto;
	}

	public Integer getParcela() {
		return parcela;
	}

	public void setParcela(Integer parcela) {
		this.parcela = parcela;
	}

	public Date getDatavencto() {
		return datavencto;
	}

	public void setDatavencto(Date datavencto) {
		this.datavencto = datavencto;
	}

	public Date getDataprev() {
		return dataprev;
	}

	public void setDataprev(Date dataprev) {
		this.dataprev = dataprev;
	}

	public Double getValorvenc() {
		return valorvenc;
	}

	public void setValorvenc(Double valorvenc) {
		this.valorvenc = valorvenc;
	}

	public Date getDatrecebto() {
		return datrecebto;
	}

	public void setDatrecebto(Date datrecebto) {
		this.datrecebto = datrecebto;
	}

	public Double getVlrecebido() {
		return vlrecebido;
	}

	public void setVlrecebido(Double vlrecebido) {
		this.vlrecebido = vlrecebido;
	}

	public Double getValorjuros() {
		return valorjuros;
	}

	public void setValorjuros(Double valorjuros) {
		this.valorjuros = valorjuros;
	}

	public String getCodmotjur() {
		return codmotjur;
	}

	public void setCodmotjur(String codmotjur) {
		this.codmotjur = codmotjur;
	}

	public Double getValormulta() {
		return valormulta;
	}

	public void setValormulta(Double valormulta) {
		this.valormulta = valormulta;
	}

	public String getCodmotmul() {
		return codmotmul;
	}

	public void setCodmotmul(String codmotmul) {
		this.codmotmul = codmotmul;
	}

	public Double getValordesc() {
		return valordesc;
	}

	public void setValordesc(Double valordesc) {
		this.valordesc = valordesc;
	}

	public String getCodmotdesc() {
		return codmotdesc;
	}

	public void setCodmotdesc(String codmotdesc) {
		this.codmotdesc = codmotdesc;
	}

	public String getCodopebx() {
		return codopebx;
	}

	public void setCodopebx(String codopebx) {
		this.codopebx = codopebx;
	}

	public Integer getNumrecibov() {
		return numrecibov;
	}

	public void setNumrecibov(Integer numrecibov) {
		this.numrecibov = numrecibov;
	}

	public String getCodmotglo() {
		return codmotglo;
	}

	public void setCodmotglo(String codmotglo) {
		this.codmotglo = codmotglo;
	}

	public Integer getNumreciboa() {
		return numreciboa;
	}

	public void setNumreciboa(Integer numreciboa) {
		this.numreciboa = numreciboa;
	}

	public Double getValorglosa() {
		return valorglosa;
	}

	public void setValorglosa(Double valorglosa) {
		this.valorglosa = valorglosa;
	}

	public Double getVlimpostos() {
		return vlimpostos;
	}

	public void setVlimpostos(Double vlimpostos) {
		this.vlimpostos = vlimpostos;
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
}