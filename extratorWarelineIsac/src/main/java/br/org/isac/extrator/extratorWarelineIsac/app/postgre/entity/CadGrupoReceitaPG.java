package br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cadgrurc")
public class CadGrupoReceitaPG {
	
	@Id
	@Column(name="codgrurc")
	private String codgrurc;
	
	@Column(name="descgrurc")
	private String descgrurc;
	
	@Column(name="classirece")
	private String classirece;
	
	@Column(name="inativo")
	private String inativo;

	public String getCodgrurc() {
		return codgrurc;
	}

	public void setCodgrurc(String codgrurc) {
		this.codgrurc = codgrurc;
	}

	public String getDescgrurc() {
		return descgrurc;
	}

	public void setDescgrurc(String descgrurc) {
		this.descgrurc = descgrurc;
	}

	public String getClassirece() {
		return classirece;
	}

	public void setClassirece(String classirece) {
		this.classirece = classirece;
	}

	public String getInativo() {
		return inativo;
	}

	public void setInativo(String inativo) {
		this.inativo = inativo;
	}
}