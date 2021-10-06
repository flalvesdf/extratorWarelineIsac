package br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pgparcel")
public class PgParcelPostGre {

	@Id
	@Column(name="numpagto")
	private Integer numpagto;
	
	@Column(name="parcela")
	private Integer parcela;
	
	@Column(name="datavencto")
	private Date datavencto;
	
	@Column(name="dataprev")
	private Date dataprev;
	
	@Column(name="valorvenc")
	private Double valorvenc;
	
	@Column(name="datapagto")
	private Date datapagto;
	
	@Column(name="valorpago")
	private Double valorpago;
	
	@Column(name="valorjuros")
	private Double valorjuros;
	
	@Column(name="valormulta")
	private Double valormulta;
	
	@Column(name="valordesc")
	private Double valordesc;
	
	@Column(name="codopebx")
	private String codopebx;
	
	@Column(name="vlimpostos")
	private Double vlimpostos;
	
	@Column(name="codmotdesc")
	private String codmotdesc;
	
	@Column(name="codmotmul")
	private String codmotmul;
	
	@Column(name="codmotjur")
	private String codmotjur;
	
	@Column(name="numprov")
	private Integer numprov;
	
	@Column(name="controle")
	private Integer controle;
	
	@Column(name="numbordero")
	private Integer numbordero;
	
	@Column(name="formapagto")
	private String formapagto;
	
	@Column(name="valorirf")
	private Double valorirf;
	
	@Column(name="valoripi")
	private Double valoripi;
	
	@Column(name="valoriss")
	private Double valoriss;
	
	@Column(name="valorinss")
	private Double valorinss;
	
	@Column(name="valcofins")
	private Double valcofins;
	
	@Column(name="valpis")
	private Double valpis;
	
	@Column(name="valcsll")
	private Double valcsll;
	
	@Column(name="valcpc")
	private Double valcpc;
	
	@Column(name="vlexcede")
	private Double vlexcede;
	
	@Column(name="cnabseq")
	private Integer cnabseq;
	
	@Column(name="formalanca")
	private String formalanca;
	
	@Column(name="codbarra")
	private String codbarra;
	
	@Column(name="cnabitem")
	private Integer cnabitem;
	
	@Column(name="exportado")
	private String exportado;
	
	@Column(name="codbancx")
	private String codbancx;
	
	@Column(name="valiva")
	private Double valiva;
	
	@Column(name="valit")
	private Double valit;
	
	@Column(name="valiue")
	private Double valiue;
	
	@Column(name="vlimpprev")
	private Double vlimpprev;
	
	@Column(name="codprest")
	private String codprest;
	
	@Column(name="observa")
	private String observa;
	
	@Column(name="tipoverba")
	private String tipoverba;
	
	@Column(name="numverba")
	private Integer numverba;
	
	@Column(name="numseqpix")
	private Integer numseqpix;

	public Integer getNumpagto() {
		return numpagto;
	}

	public void setNumpagto(Integer numpagto) {
		this.numpagto = numpagto;
	}

	public Integer getParcela() {
		return parcela;
	}

	public void setParcela(Integer parcela) {
		this.parcela = parcela;
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

	public Double getValorvenc() {
		return valorvenc;
	}

	public void setValorvenc(Double valorvenc) {
		this.valorvenc = valorvenc;
	}

	public Date getDatapagto() {
		return datapagto;
	}

	public void setDatapagto(Date datapagto) {
		this.datapagto = datapagto;
	}

	public Double getValorpago() {
		return valorpago;
	}

	public void setValorpago(Double valorpago) {
		this.valorpago = valorpago;
	}

	public Double getValorjuros() {
		return valorjuros;
	}

	public void setValorjuros(Double valorjuros) {
		this.valorjuros = valorjuros;
	}

	public Double getValormulta() {
		return valormulta;
	}

	public void setValormulta(Double valormulta) {
		this.valormulta = valormulta;
	}

	public Double getValordesc() {
		return valordesc;
	}

	public void setValordesc(Double valordesc) {
		this.valordesc = valordesc;
	}

	public String getCodopebx() {
		return codopebx;
	}

	public void setCodopebx(String codopebx) {
		this.codopebx = codopebx;
	}

	public Double getVlimpostos() {
		return vlimpostos;
	}

	public void setVlimpostos(Double vlimpostos) {
		this.vlimpostos = vlimpostos;
	}

	public String getCodmotdesc() {
		return codmotdesc;
	}

	public void setCodmotdesc(String codmotdesc) {
		this.codmotdesc = codmotdesc;
	}

	public String getCodmotmul() {
		return codmotmul;
	}

	public void setCodmotmul(String codmotmul) {
		this.codmotmul = codmotmul;
	}

	public String getCodmotjur() {
		return codmotjur;
	}

	public void setCodmotjur(String codmotjur) {
		this.codmotjur = codmotjur;
	}

	public Integer getNumprov() {
		return numprov;
	}

	public void setNumprov(Integer numprov) {
		this.numprov = numprov;
	}

	public Integer getControle() {
		return controle;
	}

	public void setControle(Integer controle) {
		this.controle = controle;
	}

	public Integer getNumbordero() {
		return numbordero;
	}

	public void setNumbordero(Integer numbordero) {
		this.numbordero = numbordero;
	}

	public String getFormapagto() {
		return formapagto;
	}

	public void setFormapagto(String formapagto) {
		this.formapagto = formapagto;
	}

	public Double getValorirf() {
		return valorirf;
	}

	public void setValorirf(Double valorirf) {
		this.valorirf = valorirf;
	}

	public Double getValoripi() {
		return valoripi;
	}

	public void setValoripi(Double valoripi) {
		this.valoripi = valoripi;
	}

	public Double getValoriss() {
		return valoriss;
	}

	public void setValoriss(Double valoriss) {
		this.valoriss = valoriss;
	}

	public Double getValorinss() {
		return valorinss;
	}

	public void setValorinss(Double valorinss) {
		this.valorinss = valorinss;
	}

	public Double getValcofins() {
		return valcofins;
	}

	public void setValcofins(Double valcofins) {
		this.valcofins = valcofins;
	}

	public Double getValpis() {
		return valpis;
	}

	public void setValpis(Double valpis) {
		this.valpis = valpis;
	}

	public Double getValcsll() {
		return valcsll;
	}

	public void setValcsll(Double valcsll) {
		this.valcsll = valcsll;
	}

	public Double getValcpc() {
		return valcpc;
	}

	public void setValcpc(Double valcpc) {
		this.valcpc = valcpc;
	}

	public Double getVlexcede() {
		return vlexcede;
	}

	public void setVlexcede(Double vlexcede) {
		this.vlexcede = vlexcede;
	}

	public Integer getCnabseq() {
		return cnabseq;
	}

	public void setCnabseq(Integer cnabseq) {
		this.cnabseq = cnabseq;
	}

	public String getFormalanca() {
		return formalanca;
	}

	public void setFormalanca(String formalanca) {
		this.formalanca = formalanca;
	}

	public String getCodbarra() {
		return codbarra;
	}

	public void setCodbarra(String codbarra) {
		this.codbarra = codbarra;
	}

	public Integer getCnabitem() {
		return cnabitem;
	}

	public void setCnabitem(Integer cnabitem) {
		this.cnabitem = cnabitem;
	}

	public String getExportado() {
		return exportado;
	}

	public void setExportado(String exportado) {
		this.exportado = exportado;
	}

	public String getCodbancx() {
		return codbancx;
	}

	public void setCodbancx(String codbancx) {
		this.codbancx = codbancx;
	}

	public Double getValiva() {
		return valiva;
	}

	public void setValiva(Double valiva) {
		this.valiva = valiva;
	}

	public Double getValit() {
		return valit;
	}

	public void setValit(Double valit) {
		this.valit = valit;
	}

	public Double getValiue() {
		return valiue;
	}

	public void setValiue(Double valiue) {
		this.valiue = valiue;
	}

	public Double getVlimpprev() {
		return vlimpprev;
	}

	public void setVlimpprev(Double vlimpprev) {
		this.vlimpprev = vlimpprev;
	}

	public String getCodprest() {
		return codprest;
	}

	public void setCodprest(String codprest) {
		this.codprest = codprest;
	}

	public String getObserva() {
		return observa;
	}

	public void setObserva(String observa) {
		this.observa = observa;
	}

	public String getTipoverba() {
		return tipoverba;
	}

	public void setTipoverba(String tipoverba) {
		this.tipoverba = tipoverba;
	}

	public Integer getNumverba() {
		return numverba;
	}

	public void setNumverba(Integer numverba) {
		this.numverba = numverba;
	}

	public Integer getNumseqpix() {
		return numseqpix;
	}

	public void setNumseqpix(Integer numseqpix) {
		this.numseqpix = numseqpix;
	}
}