package br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pt_wl_cadgrude")
public class CadGrudeMySql {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="codgrude")
	private String codgrude;
	
	@Column(name="descgrude")
	private String descgrude;
	
	@Column(name="classidesp")
	private String classidesp;
	
	@Column(name="inativo")
	private String inativo;
	
	@Column(name="timestamp")
	private Timestamp timestamp;
	
	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public String getCodgrude() {
		return codgrude;
	}

	public void setCodgrude(String codgrude) {
		this.codgrude = codgrude;
	}

	public String getDescgrude() {
		return descgrude;
	}

	public void setDescgrude(String descgrude) {
		this.descgrude = descgrude;
	}

	public String getClassidesp() {
		return classidesp;
	}

	public void setClassidesp(String classidesp) {
		this.classidesp = classidesp;
	}

	public String getInativo() {
		return inativo;
	}

	public void setInativo(String inativo) {
		this.inativo = inativo;
	}
}
