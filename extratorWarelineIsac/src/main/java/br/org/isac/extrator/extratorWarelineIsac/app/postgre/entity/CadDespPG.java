package br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "caddesp")
public class CadDespPG {
	
	@Id
	@Column(name="coddesp")
	private String coddesp;
	
	@Column(name="descridesp")
	private String descridesp;
	
	@Column(name="tipodesp")
	private String tipodesp;
	
	@Column(name="codcontab")
	private String codcontab;
	
	@Column(name="districc")
	private String districc;
	
	@Column(name="codcc")
	private String codcc;
	
	@Column(name="numtabrat")
	private Integer numtabrat;
	
	@Column(name="tipocusto")
	private String tipocusto;
	
	@Column(name="percentfix")
	private Integer percentfix;
	
	@Column(name="inativo")
	private String inativo;
	
	@Column(name="codgrude")
	private String codgrude;
	
	@Column(name="coddepara")
	private String coddepara;

	public String getCoddesp() {
		return coddesp;
	}

	public void setCoddesp(String coddesp) {
		this.coddesp = coddesp;
	}

	public String getDescridesp() {
		return descridesp;
	}

	public void setDescridesp(String descridesp) {
		this.descridesp = descridesp;
	}

	public String getTipodesp() {
		return tipodesp;
	}

	public void setTipodesp(String tipodesp) {
		this.tipodesp = tipodesp;
	}

	public String getCodcontab() {
		return codcontab;
	}

	public void setCodcontab(String codcontab) {
		this.codcontab = codcontab;
	}

	public String getDistricc() {
		return districc;
	}

	public void setDistricc(String districc) {
		this.districc = districc;
	}

	public String getCodcc() {
		return codcc;
	}

	public void setCodcc(String codcc) {
		this.codcc = codcc;
	}

	public Integer getNumtabrat() {
		return numtabrat;
	}

	public void setNumtabrat(Integer numtabrat) {
		this.numtabrat = numtabrat;
	}

	public String getTipocusto() {
		return tipocusto;
	}

	public void setTipocusto(String tipocusto) {
		this.tipocusto = tipocusto;
	}

	public Integer getPercentfix() {
		return percentfix;
	}

	public void setPercentfix(Integer percentfix) {
		this.percentfix = percentfix;
	}

	public String getInativo() {
		return inativo;
	}

	public void setInativo(String inativo) {
		this.inativo = inativo;
	}

	public String getCodgrude() {
		return codgrude;
	}

	public void setCodgrude(String codgrude) {
		this.codgrude = codgrude;
	}

	public String getCoddepara() {
		return coddepara;
	}

	public void setCoddepara(String coddepara) {
		this.coddepara = coddepara;
	}
}