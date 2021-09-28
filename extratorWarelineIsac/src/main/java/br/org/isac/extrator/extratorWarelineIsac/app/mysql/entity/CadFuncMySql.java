package br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cadfunc")
public class CadFuncMySql {
	
	@Id
	@Column(name="codprest")
	private String codprest;
	
	@Column(name="datnasfunc")
	private String datnasfunc;
	
	@Column(name="sexofunc")
	private String sexofunc;
	
	@Column(name="estcivfunc")
	private String estcivfunc;
	
	@Column(name="enderfunc")
	private String enderfunc;

	public String getCodprest() {
		return codprest;
	}

	public void setCodprest(String codprest) {
		this.codprest = codprest;
	}

	public String getDatnasfunc() {
		return datnasfunc;
	}

	public void setDatnasfunc(String datnasfunc) {
		this.datnasfunc = datnasfunc;
	}

	public String getSexofunc() {
		return sexofunc;
	}

	public void setSexofunc(String sexofunc) {
		this.sexofunc = sexofunc;
	}

	public String getEstcivfunc() {
		return estcivfunc;
	}

	public void setEstcivfunc(String estcivfunc) {
		this.estcivfunc = estcivfunc;
	}

	public String getEnderfunc() {
		return enderfunc;
	}

	public void setEnderfunc(String enderfunc) {
		this.enderfunc = enderfunc;
	}
}