package br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pgdesp")
public class PgDespPG {

	@Id
	@Column(name="numpagto")
	private Integer numpagto;
	
	@Column(name="coddesp")
	private String coddesp;
	
	@Column(name="codcc")
	private String codcc;
	
	@Column(name="valor")
	private Double valor;
	
	@Column(name="valorperc")
	private Double valorperc;
	
	@Column(name="tipoentra")
	private String tipoentra;

	public Integer getNumpagto() {
		return numpagto;
	}

	public void setNumpagto(Integer numpagto) {
		this.numpagto = numpagto;
	}

	public String getCoddesp() {
		return coddesp;
	}

	public void setCoddesp(String coddesp) {
		this.coddesp = coddesp;
	}

	public String getCodcc() {
		return codcc;
	}

	public void setCodcc(String codcc) {
		this.codcc = codcc;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getValorperc() {
		return valorperc;
	}

	public void setValorperc(Double valorperc) {
		this.valorperc = valorperc;
	}

	public String getTipoentra() {
		return tipoentra;
	}

	public void setTipoentra(String tipoentra) {
		this.tipoentra = tipoentra;
	}
}