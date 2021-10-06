package br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cadgrude")
public class CadGrudePostGre {

	@Id
	@Column(name="codgrude")
	private String codgrude;
	
	@Column(name="descgrude")
	private String descgrude;
	
	@Column(name="classidesp")
	private String classidesp;
	
	@Column(name="inativo")
	private String inativo;

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
