package br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rcrece")
public class RecebimentosVinculacaoReceitaPG {
	
	@Id
	@Column(name="numrecebto")
	private Integer numrecebto;
	
	@Column(name="codrece")
	private String codrece;
	
	@Column(name="codcc")
	private String codcc;
	
	@Column(name="valor")
	private Double valor;
	
	@Column(name="valorperc")
	private Double valorperc;
	
	@Column(name="rateado")
	private String rateado;

	public Integer getNumrecebto() {
		return numrecebto;
	}

	public void setNumrecebto(Integer numrecebto) {
		this.numrecebto = numrecebto;
	}

	public String getCodrece() {
		return codrece;
	}

	public void setCodrece(String codrece) {
		this.codrece = codrece;
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

	public String getRateado() {
		return rateado;
	}

	public void setRateado(String rateado) {
		this.rateado = rateado;
	}
}
