package br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pt_wl_recebimentos")
public class RecebimentosWareline {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "numrecebto")
	private Integer numrecebto;
	
	@Column(name = "numrecibo")
	private Integer numrecibo;
	
	@Column(name = "tipodoc")
	private String tipodoc; 
	
	@Column(name = "numdoc")
	private String numdoc;
	
	@Column(name = "codfilial")
	private String codfilial;
	
	@Column(name = "codconv")
	private String codconv;
	
	@Column(name = "nomecli")
	private String nomecli; 
	
	@Column(name = "nomeresp")
	private String nomeresp;
	
	@Column(name = "observa")
	private String observa; 
	
	@Column(name = "codope")
	private String codope; 
	
	@Column(name = "datemissao")
	private Date datemissao; 
	
	@Column(name = "datdigita")
	private Date datdigita; 
	
	@Column(name = "dataadian")
	private Date dataadian;
	
	@Column(name = "datavencto")
	private Date datavencto; 
	
	@Column(name = "dataprev")
	private Date dataprev;
	
	@Column(name = "datrecebto")
	private Date datrecebto; 
	
	@Column(name = "dataglosas")
	private Date dataglosas;
	
	@Column(name = "mesiniprov")
	private String mesiniprov;
	
	@Column(name = "mesfimprov")
	private String mesfimprov;
	
	@Column(name = "anorecebimento")
	private Double anorecebimento;
	
	@Column(name = "mesrecebimento")
	private Double mesrecebimento;
	
	@Column(name = "diarecebimento")
	private Double diarecebimento;
	
	@Column(name = "valoradian")
	private Double valoradian;
	
	@Column(name = "valorglosa")
	private Double valorglosa;
	
	@Column(name = "valororig")
	private Double valororig;
	
	@Column(name = "valortot")
	private Double valortot;
	
	@Column(name = "valor")
	private Double valor; 
	
	@Column(name = "valorvenc")
	private Double valorvenc;
	
	@Column(name = "vlrecebido")
	private Double vlrecebido;
	
	@Column(name = "codgrurc")
	private String codgrurc;
	
	@Column(name = "descgrurc")
	private String descgrurc;
	
	@Column(name = "codrece")
	private String codrece; 
	
	@Column(name = "descrirece")
	private String descrirece;
	
	@Column(name = "unidade")
	private Integer unidade;

	@Column(name = "timestamp")
	private Timestamp timestamp;
	
	public Integer getNumrecebto() {
		return numrecebto;
	}
	public void setNumrecebto(Integer numrecebto) {
		this.numrecebto = numrecebto;
	}
	public Integer getNumrecibo() {
		return numrecibo;
	}
	public void setNumrecibo(Integer numrecibo) {
		this.numrecibo = numrecibo;
	}
	public String getTipodoc() {
		return tipodoc;
	}
	public void setTipodoc(String tipodoc) {
		this.tipodoc = tipodoc;
	}
	public String getNumdoc() {
		return numdoc;
	}
	public void setNumdoc(String numdoc) {
		this.numdoc = numdoc;
	}
	public String getCodfilial() {
		return codfilial;
	}
	public void setCodfilial(String codfilial) {
		this.codfilial = codfilial;
	}
	public String getCodconv() {
		return codconv;
	}
	public void setCodconv(String codconv) {
		this.codconv = codconv;
	}
	public String getNomecli() {
		return nomecli;
	}
	public void setNomecli(String nomecli) {
		this.nomecli = nomecli;
	}
	public String getNomeresp() {
		return nomeresp;
	}
	public void setNomeresp(String nomeresp) {
		this.nomeresp = nomeresp;
	}
	public String getObserva() {
		return observa;
	}
	public void setObserva(String observa) {
		this.observa = observa;
	}
	public String getCodope() {
		return codope;
	}
	public void setCodope(String codope) {
		this.codope = codope;
	}
	public Date getDatemissao() {
		return datemissao;
	}
	public void setDatemissao(Date datemissao) {
		this.datemissao = datemissao;
	}
	public Date getDatdigita() {
		return datdigita;
	}
	public void setDatdigita(Date datdigita) {
		this.datdigita = datdigita;
	}
	public Date getDataadian() {
		return dataadian;
	}
	public void setDataadian(Date dataadian) {
		this.dataadian = dataadian;
	}
	public Date getDatavencto() {
		return datavencto;
	}
	public void setDatavencto(Date datavencto) {
		this.datavencto = datavencto;
	}
	public Date getDataprev() {
		return dataprev;
	}
	public void setDataprev(Date dataprev) {
		this.dataprev = dataprev;
	}
	public Date getDatrecebto() {
		return datrecebto;
	}
	public void setDatrecebto(Date datrecebto) {
		this.datrecebto = datrecebto;
	}
	public Date getDataglosas() {
		return dataglosas;
	}
	public void setDataglosas(Date dataglosas) {
		this.dataglosas = dataglosas;
	}
	public String getMesiniprov() {
		return mesiniprov;
	}
	public void setMesiniprov(String mesiniprov) {
		this.mesiniprov = mesiniprov;
	}
	public String getMesfimprov() {
		return mesfimprov;
	}
	public void setMesfimprov(String mesfimprov) {
		this.mesfimprov = mesfimprov;
	}
	public Double getAnorecebimento() {
		return anorecebimento;
	}
	public void setAnorecebimento(Double anorecebimento) {
		this.anorecebimento = anorecebimento;
	}
	public Double getMesrecebimento() {
		return mesrecebimento;
	}
	public void setMesrecebimento(Double mesrecebimento) {
		this.mesrecebimento = mesrecebimento;
	}
	public Double getDiarecebimento() {
		return diarecebimento;
	}
	public void setDiarecebimento(Double diarecebimento) {
		this.diarecebimento = diarecebimento;
	}
	public Double getValoradian() {
		return valoradian;
	}
	public void setValoradian(Double valoradian) {
		this.valoradian = valoradian;
	}
	public Double getValorglosa() {
		return valorglosa;
	}
	public void setValorglosa(Double valorglosa) {
		this.valorglosa = valorglosa;
	}
	public Double getValororig() {
		return valororig;
	}
	public void setValororig(Double valororig) {
		this.valororig = valororig;
	}
	public Double getValortot() {
		return valortot;
	}
	public void setValortot(Double valortot) {
		this.valortot = valortot;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getValorvenc() {
		return valorvenc;
	}
	public void setValorvenc(Double valorvenc) {
		this.valorvenc = valorvenc;
	}
	public Double getVlrecebido() {
		return vlrecebido;
	}
	public void setVlrecebido(Double vlrecebido) {
		this.vlrecebido = vlrecebido;
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
	public String getCodrece() {
		return codrece;
	}
	public void setCodrece(String codrece) {
		this.codrece = codrece;
	}
	public String getDescrirece() {
		return descrirece;
	}
	public void setDescrirece(String descrirece) {
		this.descrirece = descrirece;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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