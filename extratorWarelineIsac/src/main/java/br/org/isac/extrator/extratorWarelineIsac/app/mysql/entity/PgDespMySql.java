package br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pt_wl_pgdesp")
public class PgDespMySql {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
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
	
	@Column(name="unidade")
	private Integer unidade;
	
	@Column(name="timestamp")
	private Timestamp timestamp;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public Integer getUnidade() {
		return unidade;
	}

	public void setUnidade(Integer unidade) {
		this.unidade = unidade;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
}