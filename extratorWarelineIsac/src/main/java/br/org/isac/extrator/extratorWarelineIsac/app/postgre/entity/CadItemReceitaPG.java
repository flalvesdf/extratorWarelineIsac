package br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cadrece")
public class CadItemReceitaPG {
	
	@Id
	@Column(name="codrece")
	private String codrece;
	
	@Column(name="descrirece")
	private String descrirece ;
	
	@Column(name="tiporece")
	private String tiporece;
	
	@Column(name="codcontab")
	private String codcontab;
	
	@Column(name="districc")
	private String districc;
	
	@Column(name="codcc")
	private String codcc;
	
	@Column(name="numtabrat")
	private Integer numtabrat;
	
	@Column(name="provisiona")
	private String provisiona ;
	
	@Column(name="codgrurc")
	private String codgrurc;
	
	@Column(name="inativo")
	private String inativo;

	public String getCodrece() {
		return codrece;
	}

	public void setCodrece(String codrece) {
		this.codrece = codrece;
	}

	public String getDescrirece() {
		return descrirece;
	}

	public void setDescrirece(String descrirece) {
		this.descrirece = descrirece;
	}

	public String getTiporece() {
		return tiporece;
	}

	public void setTiporece(String tiporece) {
		this.tiporece = tiporece;
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

	public String getProvisiona() {
		return provisiona;
	}

	public void setProvisiona(String provisiona) {
		this.provisiona = provisiona;
	}

	public String getCodgrurc() {
		return codgrurc;
	}

	public void setCodgrurc(String codgrurc) {
		this.codgrurc = codgrurc;
	}

	public String getInativo() {
		return inativo;
	}

	public void setInativo(String inativo) {
		this.inativo = inativo;
	}
}