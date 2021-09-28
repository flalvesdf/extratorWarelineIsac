package br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cadfunc")
public class CadFuncPostGre {
	
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
	
	
	
//	CREATE TABLE "PACIENTE".cadfunc
//	(
//	  codprest character varying(6) NOT NULL,
//	  datnasfunc date NOT NULL,
//	  sexofunc character varying(1) NOT NULL,
//	  estcivfunc character varying(1) NOT NULL,
//	  enderfunc character varying(70) NOT NULL,
//	  cepfunc character varying(8) NOT NULL,
//	  bairrofunc character varying(30),
//	  cidadefunc character varying(30) NOT NULL,
//	  uffunc character varying(2) NOT NULL,
//	  cidnasfunc character varying(30) NOT NULL,
//	  ufnasfunc character varying(2) NOT NULL,
//	  nacnasfunc character varying(10) NOT NULL,
//	  datentfunc date,
//	  fonefunc character varying(15),
//	  faxfunc character varying(15),
//	  celfunc character varying(15),
//	  bipfunc character varying(15),
//	  emailfunc character varying(100),
//	  paifunc character varying(50),
//	  maefunc character varying(50),
//	  conjfunc character varying(50),
//	  rgfunc character varying(15),
//	  ufrgfunc character varying(2),
//	  orgrgfunc character varying(2),
//	  datargfunc date,
//	  tipcerfunc character varying(1),
//	  cartofunc character varying(20),
//	  livrofunc character varying(8),
//	  flsfunc character varying(4),
//	  termofunc character varying(8),
//	  datcerfunc date,
//	  cpffunc character varying(11),
//	  pisfunc character varying(11),
//	  corfunc character varying(1),
//	  cartrafunc character varying(15),
//	  corpocli character varying(1) DEFAULT 'N'::character varying,
//	  guerrafunc character varying(15),
//	  emirgfunc character varying(10),
//	  numdepend numeric(2,0),
//	  tipologrfu character varying(10),
//	  lografu character varying(40),
//	  numlogrfu character varying(7),
//	  complefu character varying(15),
//	  ibgefu character varying(6),
//	  email2func character varying(100),
//	  serietrfunc character varying(10),
//	  CONSTRAINT cadfunc_codprest_pk PRIMARY KEY (codprest),
//	  CONSTRAINT cadfunc_codprest_fk FOREIGN KEY (codprest)
//	      REFERENCES "PACIENTE".cadprest (codprest) MATCH SIMPLE
//	      ON UPDATE NO ACTION ON DELETE CASCADE,
//	  CONSTRAINT cadfunc_cpffunc_uk UNIQUE (cpffunc)
//	)

}
