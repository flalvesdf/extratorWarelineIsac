package br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pt_wl_caddesp")
public class CadDespMySql {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
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
	
	@Column(name="timestamp")
	private Timestamp timestamp;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
}