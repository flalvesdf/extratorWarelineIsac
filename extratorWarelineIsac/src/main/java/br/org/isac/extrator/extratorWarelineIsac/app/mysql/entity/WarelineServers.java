package br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pt_wl_servidores")
public class WarelineServers {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="iphost")
	private String iphost;
	
	@Column(name="ipdatabase")
	private String ipdatabase;
	
	@Column(name="unidade")
	private Integer unidade;
	
	@Column(name="status")
	private String status;
	
	@Column(name="servername")
	private String servername;
	
	@Column(name="ativo")
	private String ativo;
	
	@Column(name="ultimaverificacao")
	private Timestamp ultimaverificacao;
	
	@Column(name="codfilial")
	private Integer codfilial;
	
	@Column(name="databasename")
	private String databasename;
	
	@Column(name="schedule")
	private String schedule;
	
	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	public String getDatabasename() {
		return databasename;
	}

	public void setDatabasename(String databasename) {
		this.databasename = databasename;
	}
	
	public Integer getCodfilial() {
		return codfilial;
	}

	public void setCodfilial(Integer codfilial) {
		this.codfilial = codfilial;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIphost() {
		return iphost;
	}

	public void setIphost(String iphost) {
		this.iphost = iphost;
	}

	public String getIpdatabase() {
		return ipdatabase;
	}

	public void setIpdatabase(String ipdatabase) {
		this.ipdatabase = ipdatabase;
	}

	public Integer getUnidade() {
		return unidade;
	}

	public void setUnidade(Integer unidade) {
		this.unidade = unidade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getServername() {
		return servername;
	}

	public void setServername(String servername) {
		this.servername = servername;
	}

	public Timestamp getUltimaverificacao() {
		return ultimaverificacao;
	}

	public void setUltimaverificacao(Timestamp ultimaverificacao) {
		this.ultimaverificacao = ultimaverificacao;
	}
}