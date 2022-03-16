package br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pt_wl_cadgrurc")
public class CadGrupoReceitasMySql {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="codgrurc")
	private String codgrurc;
	
	@Column(name="descgrurc")
	private String descgrurc;
	
	@Column(name="classirece")
	private String classirece;
	
	@Column(name="inativo")
	private String inativo;
	
	@Column(name="timestamp")
	private Timestamp timestamp;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
}