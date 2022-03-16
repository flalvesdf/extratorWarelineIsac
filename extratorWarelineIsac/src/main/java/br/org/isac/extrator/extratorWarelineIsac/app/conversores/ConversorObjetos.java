package br.org.isac.extrator.extratorWarelineIsac.app.conversores;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadDespMySql;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadFuncWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadGrudeMySql;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadGrupoReceitasMySql;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadItemReceitasMySql;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadJuridWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadPrestWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadUniWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.PagtosWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.PgDespMySql;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.PgParcelMySql;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.RecebimentosWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.WarelineServers;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadDespPG;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadFuncPG;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadGrudePG;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadGrupoReceitaPG;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadItemReceitaPG;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadJuridPG;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadPrestPG;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadUniPG;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.PagtosPG;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.PgDespPG;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.PgParcelPG;

public class ConversorObjetos {
	
	public static String getIpServer() {
		String server = null;
		try {
			server =  InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		return server;
	}
	
	public static CadGrupoReceitasMySql converteCadGrupoReceitasPGToMySQL(CadGrupoReceitaPG gr) {
		CadGrupoReceitasMySql g = new CadGrupoReceitasMySql();
		g.setClassirece(gr.getClassirece());
		g.setCodgrurc(gr.getCodgrurc());
		g.setDescgrurc(gr.getDescgrurc());
		g.setInativo(gr.getInativo());
		g.setTimestamp(currentTimestamp());
		return g;
	}
	
	public static CadItemReceitasMySql converteCadItemReceitasPGToMySQL(CadItemReceitaPG i) {
		CadItemReceitasMySql c = new CadItemReceitasMySql();
		c.setCodcc(i.getCodcc());
		c.setCodcontab(i.getCodcontab());
		c.setCodgrurc(i.getCodgrurc());
		c.setCodrece(i.getCodrece());
		c.setDescrirece(i.getDescrirece());
		c.setDistricc(i.getDistricc());
		c.setInativo(i.getInativo());
		c.setNumtabrat(i.getNumtabrat());
		c.setProvisiona(i.getProvisiona());
		c.setTimestamp(currentTimestamp());
		return c;
	}
	
	/**Recupera do posGres os dados em formato Object[] e converte para RecebimentosWareline para gravacao do DB do Portal de Transparencia, 
	 * conforme padrao abaixo:
	 * 
	 *  R1.numrecebto[0], R1.numrecibo[1],R1.tipodoc[2], R1.numdoc[3],R1.codfilial[4],R1.codconv[5],
		R1.nomecli[6], R1.nomeresp[7],R1.observa[8], R1.codope[9], R1.datemissao[10], R1.datdigita[11], 
		R1.dataadian[12],R3.datavencto[13], R3.dataprev[14],R3.datrecebto[15], R1.dataglosas[16],
		R1.mesiniprov[17], R1.mesfimprov[18], extract(year from R3.datrecebto) as anorecebimento[19],
		extract(month from R3.datrecebto) as mesrecebimento[20],extract(day from R3.datrecebto) as diarecebimento[21],
		R1.valoradian[22], R1.valorglosa[23], R1.valororig[24], R1.valortot[25],R2.valor[26], R3.valorvenc[27],
		R3.vlrecebido[28],R4.codgrurc[29],R5.descgrurc[30],R2.codrece[31], R4.descrirece[32] 
		
		TABELA recebtos R1 
		TABELA rcrece R2 on (R1.numrecebto = R2.numrecebto)
		TABELA rcparcel R3 on (R1.numrecebto = R3.numrecebto) 
		TABELA cadrece R4 on (R2.codrece = R4.codrece)
		TABELA cadgrurc R5 on (R4.codgrurc = R5.codgrurc)
		
		MAIS DETALHE: Veja a Inteface RecebimentosPGRepository, método getRecebimentosPorMesAno(Integer ano, Integer mes, String codFilial)
	 * @param obj
	 * @param server
	 * @return
	 */
	public static RecebimentosWareline converteArrayObjectToRecebimentosWarelineForMySql(Object[] obj, WarelineServers server) {
		RecebimentosWareline r = new RecebimentosWareline();
		
		r.setNumrecebto((obj[0]!= null && !"".equals(String.valueOf(obj[0]))?Integer.parseInt(String.valueOf(obj[0])):0));
		r.setNumrecibo((obj[1]!= null && !"".equals(String.valueOf(obj[1]))?Integer.parseInt(String.valueOf(obj[1])):0));
		
		r.setTipodoc((obj[2]!= null && !"".equals(String.valueOf(obj[2]))?String.valueOf(obj[2]):""));
		r.setNumdoc((obj[3]!= null && !"".equals(String.valueOf(obj[3]))?String.valueOf(obj[3]):""));
		r.setCodfilial((obj[4]!= null && !"".equals(String.valueOf(obj[4]))?String.valueOf(obj[4]):""));
		r.setCodconv((obj[5]!= null && !"".equals(String.valueOf(obj[5]))?String.valueOf(obj[5]):""));
		r.setNomecli((obj[6]!= null && !"".equals(String.valueOf(obj[6]))?String.valueOf(obj[6]):""));
		r.setNomeresp((obj[7]!= null && !"".equals(String.valueOf(obj[7]))?String.valueOf(obj[7]):""));
		r.setObserva((obj[8]!= null && !"".equals(String.valueOf(obj[8]))?String.valueOf(obj[8]):""));
		r.setCodope((obj[9]!= null && !"".equals(String.valueOf(obj[9]))?String.valueOf(obj[9]):""));
		
		r.setDatemissao((obj[10]!= null && !"".equals(String.valueOf(obj[10]))?Date.valueOf(String.valueOf(obj[10])):null));
		r.setDatdigita((obj[11]!= null && !"".equals(String.valueOf(obj[11]))?Date.valueOf(String.valueOf(obj[11])):null));
		r.setDataadian((obj[12]!= null && !"".equals(String.valueOf(obj[12]))?Date.valueOf(String.valueOf(obj[12])):null));
		r.setDatavencto((obj[13]!= null && !"".equals(String.valueOf(obj[13]))?Date.valueOf(String.valueOf(obj[13])):null));
		r.setDataprev((obj[14]!= null && !"".equals(String.valueOf(obj[14]))?Date.valueOf(String.valueOf(obj[14])):null));
		r.setDatrecebto((obj[15]!= null && !"".equals(String.valueOf(obj[15]))?Date.valueOf(String.valueOf(obj[15])):null));
		r.setDataglosas((obj[16]!= null && !"".equals(String.valueOf(obj[16]))?Date.valueOf(String.valueOf(obj[16])):null));
		
		r.setMesiniprov((obj[17]!= null && !"".equals(String.valueOf(obj[17]))?String.valueOf(obj[17]):""));
		r.setMesfimprov((obj[18]!= null && !"".equals(String.valueOf(obj[18]))?String.valueOf(obj[18]):""));
		
		r.setAnorecebimento((obj[19]!= null && !"".equals(String.valueOf(obj[19]))?Double.parseDouble(String.valueOf(obj[19])):0.0));
		r.setMesrecebimento((obj[20]!= null && !"".equals(String.valueOf(obj[20]))?Double.parseDouble(String.valueOf(obj[20])):0.0));
		r.setDiarecebimento((obj[21]!= null && !"".equals(String.valueOf(obj[21]))?Double.parseDouble(String.valueOf(obj[21])):0.0));
		
		r.setValoradian((obj[22]!= null && !"".equals(String.valueOf(obj[22]))?Double.parseDouble(String.valueOf(obj[22])):0.0));
		r.setValorglosa((obj[23]!= null && !"".equals(String.valueOf(obj[23]))?Double.parseDouble(String.valueOf(obj[23])):0.0));
		r.setValororig((obj[24]!= null && !"".equals(String.valueOf(obj[24]))?Double.parseDouble(String.valueOf(obj[24])):0.0));
		r.setValortot((obj[25]!= null && !"".equals(String.valueOf(obj[25]))?Double.parseDouble(String.valueOf(obj[25])):0.0));
		r.setValor((obj[26]!= null && !"".equals(String.valueOf(obj[26]))?Double.parseDouble(String.valueOf(obj[26])):0.0));
		r.setValorvenc((obj[27]!= null && !"".equals(String.valueOf(obj[27]))?Double.parseDouble(String.valueOf(obj[27])):0.0));
		r.setVlrecebido((obj[28]!= null && !"".equals(String.valueOf(obj[28]))?Double.parseDouble(String.valueOf(obj[28])):0.0));
		
		r.setCodgrurc((obj[29]!= null && !"".equals(String.valueOf(obj[29]))?String.valueOf(obj[29]):""));
		r.setDescgrurc((obj[30]!= null && !"".equals(String.valueOf(obj[30]))?String.valueOf(obj[30]):""));
		r.setCodrece((obj[31]!= null && !"".equals(String.valueOf(obj[31]))?String.valueOf(obj[31]):""));
		r.setDescrirece((obj[32]!= null && !"".equals(String.valueOf(obj[32]))?String.valueOf(obj[32]):""));
		
		r.setUnidade(server.getUnidade());
		r.setTimestamp(currentTimestamp());
		
		return r;
	}
	
	public static String converteDataFormatoAmericanoEmDataPTBR(String data) {
		//formato recebido: 2020-04-13
		Integer dia = Integer.parseInt(data.substring(8));
		Integer mes = Integer.parseInt(data.substring(5,7));
		Integer ano = Integer.parseInt(data.substring(0,4));
		return dia+"/"+mes+"/"+ano;
	}
	
	public static PgParcelMySql convertePgParcelPostGreToMySql(PgParcelPG p, String mescomp, WarelineServers server) {
		PgParcelMySql c = new PgParcelMySql();
		c.setCnabitem(p.getCnabitem());
		c.setCnabseq(p.getCnabseq());
		c.setCodbancx(p.getCodbancx());
		c.setCodbarra(p.getCodbarra());
		c.setCodmotdesc(p.getCodmotdesc());
		c.setCodmotjur(p.getCodmotjur());
		c.setCodmotmul(p.getCodmotmul());
		c.setCodopebx(p.getCodopebx());
		c.setCodprest(p.getCodprest());
		c.setControle(p.getControle());
		c.setDatapagto(p.getDatapagto());
		c.setDataprev(p.getDataprev());
		c.setDatavencto(p.getDatavencto());
		c.setExportado(p.getExportado());
		c.setFormalanca(p.getFormalanca());
		c.setFormapagto(p.getFormapagto());
		c.setNumbordero(p.getNumbordero());
		c.setNumpagto(p.getNumpagto());
		c.setNumprov(p.getNumprov());
		c.setNumseqpix(p.getNumseqpix());
		c.setNumverba(p.getNumverba());
		c.setObserva(p.getObserva());
		c.setParcela(p.getParcela());
		c.setTimestamp(currentTimestamp());
		c.setTipoverba(p.getTipoverba());
		c.setUnidade(server.getUnidade());
		c.setValcofins(p.getValcofins());
		c.setValcpc(p.getValcpc());
		c.setValcsll(p.getValcsll());
		c.setValit(p.getValit());
		c.setValiue(p.getValiue());
		c.setValiva(p.getValiva());
		c.setValordesc(p.getValordesc());
		c.setValorinss(p.getValorinss());
		c.setValoripi(p.getValoripi());
		c.setValorirf(p.getValorirf());
		c.setValoriss(p.getValoriss());
		c.setValorjuros(p.getValorjuros());
		c.setValormulta(p.getValormulta());
		c.setValorpago(p.getValorpago());
		c.setValorvenc(p.getValorvenc());
		c.setValpis(p.getValpis());
		c.setVlexcede(p.getVlexcede());
		c.setVlimpostos(p.getVlimpostos());
		c.setVlimpprev(p.getVlimpprev());
		c.setMescompetencia(Integer.parseInt(mescomp.substring(5)));
		c.setAnocompetencia(Integer.parseInt(mescomp.substring(0,4)));
		return c;
	}
	
	public static PgDespMySql convertePgDespPostGreToMySql(PgDespPG p, String mescomp, WarelineServers server) {
		PgDespMySql c = new PgDespMySql();
		c.setCodcc(p.getCodcc());
		c.setCoddesp(p.getCoddesp());
		c.setNumpagto(p.getNumpagto());
		c.setTimestamp(currentTimestamp());
		c.setTipoentra(p.getTipoentra());
		c.setUnidade(server.getUnidade());
		c.setValor(p.getValor());
		c.setValorperc(p.getValorperc());
		c.setMescompetencia(Integer.parseInt(mescomp.substring(5)));
		c.setAnocompetencia(Integer.parseInt(mescomp.substring(0,4)));
		
		return c;
	}
	
	public static CadGrudeMySql converteGrupoDespesasPostGreToMySql(CadGrudePG p) {
		CadGrudeMySql c = new CadGrudeMySql();
		c.setClassidesp(p.getClassidesp());
		c.setCodgrude(p.getCodgrude());
		c.setDescgrude(p.getDescgrude());
		c.setInativo(p.getInativo());
		c.setTimestamp(currentTimestamp());
		return c;
	}
	
	public static CadDespMySql converteDespesasPostGreToMySql(CadDespPG p) {
		CadDespMySql c = new CadDespMySql();
		c.setCodcc(p.getCodcc());
		c.setCodcontab(p.getCodcontab());
		c.setCoddepara(p.getCoddepara());
		c.setCoddesp(p.getCoddesp());
		c.setCodgrude(p.getCodgrude());
		c.setDescridesp(p.getDescridesp());
		c.setDistricc(p.getDistricc());
		c.setInativo(p.getInativo());
		c.setNumtabrat(p.getNumtabrat());
		c.setPercentfix(p.getPercentfix());
		c.setTimestamp(currentTimestamp());
		return c;
	}
	
	public static String converteDateEmString(Date data) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		return formato.format(data);
	}
	
//	public static RecebimentosMySql converteRecebimentosPostGreToMySql(RecebimentosPG rpg, WarelineServers server) {
//		RecebimentosMySql rms = new RecebimentosMySql();
//		rms.setUnidade(server.getUnidade());
//		
//		String mesano = converteDateEmString(rpg.getDatemissao());
//		Integer ano = Integer.parseInt(mesano.substring(6));
//		Integer mes = Integer.parseInt(mesano.substring(3,5));
//		
//		rms.setAnocompetencia(ano);
//		rms.setMescompetencia(mes);
//		
//		rms.setClassidoc(rpg.getClassidoc());
//		rms.setCodbansuge(rpg.getCodbansuge());
//		rms.setCodcondpg(rpg.getCodcondpg());
//		rms.setCodconv(rpg.getCodconv());
//		rms.setCodevenbai(rpg.getCodevenbai());
//		rms.setCodeveninc(rpg.getCodeveninc());
//		rms.setCodfilial(rpg.getCodfilial());
//		rms.setCodmoeda(rpg.getCodmoeda());
//		rms.setCodope(rpg.getCodope());
//		rms.setCodopeatu(rpg.getCodopeatu());
//		rms.setCodorcaf(rpg.getCodorcaf());
//		rms.setCodpac(rpg.getCodpac());
//		rms.setContabbai(rpg.getContabbai());
//		rms.setContabinc(rpg.getCodeveninc());
//		rms.setCpfresp(rpg.getCpfresp());
//		rms.setDataadian(rpg.getDataadian());
//		rms.setDataglosas(rpg.getDataglosas());
//		rms.setDataultatu(rpg.getDataultatu());
//		rms.setDatdigita(rpg.getDatdigita());
//		rms.setDatemissao(rpg.getDatemissao());
//		rms.setFluxo(rpg.getFluxo());
//		rms.setFormasuge(rpg.getFormasuge());
//		rms.setIdcontapac(rpg.getIdcontapac());
//		rms.setMatriz(rpg.getMatriz());
//		rms.setMesfimprov(rpg.getMesfimprov());
//		rms.setMesiniprov(rpg.getMesiniprov());
//		rms.setMesorcaf(rpg.getMesorcaf());
//		rms.setNomecli(rpg.getNomecli());
//		rms.setNomeresp(rpg.getNomeresp());
//		rms.setNumatend(rpg.getNumatend());
//		rms.setNumdoc(rpg.getNumdoc());
//		rms.setNumnffat(rpg.getNumnffat());
//		rms.setNumprojeto(rpg.getNumprojeto());
//		rms.setNumrecebto(rpg.getNumrecebto());
//		rms.setNumrecibo(rpg.getNumrecibo());
//		rms.setNumreciboa(rpg.getNumreciboa());
//		rms.setNumrecibov(rpg.getNumrecibov());
//		rms.setNumsolver(rpg.getNumsolver());
//		rms.setObserva(rpg.getObserva());
//		rms.setParcelas(rpg.getParcelas());
//		rms.setPortador(rpg.getPortador());
//		rms.setPosicao(rpg.getPosicao());
//		rms.setProvisiona(rpg.getPosicao());
//		rms.setQtd1(rpg.getQtd1());
//		rms.setTimestamp(currentTimestamp());
//		rms.setTipocobr(rpg.getTipocobr());
//		rms.setTipodoc(rpg.getTipodoc());
//		rms.setTraspaso(rpg.getTraspaso());
//		rms.setValcofins(rpg.getValcofins());
//		rms.setValcpc(rpg.getValcpc());
//		rms.setValcsll(rpg.getValcsll());
//		rms.setValicms(rpg.getValicms());
//		rms.setValinss(rpg.getValinss());
//		rms.setValirrf(rpg.getValirrf());
//		rms.setValiss(rpg.getValiss());
//		rms.setValoradian(rpg.getValoradian());
//		rms.setValorglosa(rpg.getValorglosa());
//		rms.setValororig(rpg.getValororig());
//		rms.setValortot(rpg.getValortot());
//		rms.setValpis(rpg.getValpis());
//		
//		return rms;
//	}
	
	
	public static PagtosWareline convertePagamentosPostPreToMySql(PagtosPG p, WarelineServers server) {
		PagtosWareline c = new PagtosWareline();
		
//		for(WarelineServers s: servers) {
//			Integer codFilial = Integer.parseInt(p.getCodfilial());
//			
//			if(codFilial == s.getCodfilial()) {
//				
//			}
//			
//			
//			//if(codFilial == 1) c.setUnidade(ID_FILIAL_1);
//			//if(codFilial == 2) c.setUnidade(ID_FILIAL_2);
//			//if(codFilial == 3) c.setUnidade(ID_FILIAL_3);
//		}

		//somente para HMA
		
		c.setUnidade(server.getUnidade());
		
		String mescomp = p.getMescomp();
		Integer ano = Integer.parseInt(mescomp.substring(0, 4));
		Integer mes = Integer.parseInt(mescomp.substring(5));
		
		c.setAnocompetencia(ano);
		c.setMescompetencia(mes);

		c.setChavenf(p.getChavenf());
		c.setClassidoc(p.getClassidoc());
		c.setCodbansuge(p.getCodbansuge());
		c.setCodbarra(p.getCodbarra());
		c.setCodcondpg(p.getCodcondpg());
		c.setCoddarf(p.getCoddarf());
		c.setCodevenbai(p.getCodevenbai());
		c.setCodeveninc(p.getCodeveninc());
		c.setCodfilial(p.getCodfilial());
		c.setCodimposto(p.getCodimposto());
		c.setCodmoeda(p.getCodmoeda());
		c.setCodope(p.getCodope());
		c.setCodopeatu(c.getCodopeatu());
		c.setCodorcaf(p.getCodorcaf());
		c.setCodprest(p.getCodprest());
		c.setCodserv3(p.getCodserv3());
		c.setContabbai(p.getContabbai());
		c.setContabinc(p.getContabinc());
		c.setDataadian(p.getDataadian());
		c.setDatadev(p.getDatadev());
		c.setDataultatu(p.getDataultatu());
		c.setDatdigita(p.getDatdigita());
		c.setDatemissao(p.getDatemissao());
		c.setDatentrada(p.getDatentrada());
		c.setDesregdirf(p.getDesregdirf());
		c.setDiasjuros(p.getDiasjuros());
		c.setDiasmulta(p.getDiasmulta());
		c.setExportada(p.getExportada());
		c.setFluxo(p.getFluxo());
		c.setFormasuge(p.getFormasuge());
		c.setMatriz(p.getMatriz());
		c.setMescomp(p.getMescomp());
		c.setMesfimprov(p.getMesfimprov());
		c.setMesiniprov(p.getMesiniprov());
		c.setMesorcaf(p.getMesorcaf());
		c.setNfservicos(p.getNfservicos());
		c.setNomefornec(p.getNomefornec());
		c.setNumatend(p.getNumatend());
		c.setNumbaiori(p.getNumbaiori());
		c.setNumconta(p.getNumconta());
		c.setNumcontbol(p.getNumcontbol());
		c.setNumdoc(p.getNumdoc());
		c.setNumentr(p.getNumentr());
		c.setNumnotas(p.getNumnotas());
		c.setNumpagto(p.getNumpagto());
		c.setNumparcori(p.getNumparcori());
		c.setNumpgtori(p.getNumpgtori());
		c.setNumprojeto(p.getNumprojeto());
		c.setObserva(p.getObserva());
		c.setParcelas(p.getParcelas());
		c.setPercdescd(p.getPercdescd());
		c.setPercjurosd(p.getPercjurosd());
		c.setPercjurosm(p.getPercjurosm());
		c.setPercmulta(p.getPercmulta());
		c.setPortador(p.getPortador());
		c.setPosicao(p.getPosicao());
		c.setProvisiona(p.getProvisiona());
		c.setQtd1(p.getQtd1());
		c.setRegdirf(p.getRegdirf());
		c.setSeriedoc(p.getSeriedoc());
		c.setTipocobr(p.getTipocobr());
		c.setTipodoc(p.getTipodoc());
		c.setTraspaso(p.getTraspaso());
		c.setTimestamp(currentTimestamp());
		c.setValcofins(p.getValcofins());
		c.setValcpc(p.getValcpc());
		c.setValcsll(p.getValcsll());
		c.setValit(p.getValit());
		c.setValiue(p.getValiue());
		c.setValiva(p.getValiva());
		c.setValoradian(p.getValoradian());
		c.setValordev(p.getValordev());
		c.setValorfrete(p.getValorfrete());
		c.setValorinss(p.getValorinss());
		c.setValoripi(p.getValoripi());
		c.setValorirf(p.getValorirf());
		c.setValoriss(p.getValoriss());
		c.setValorjurod(p.getValorjurod());
		c.setValormulta(p.getValormulta());
		c.setValororig(p.getValororig());
		c.setValortot(p.getValortot());
		c.setValpis(p.getValpis());
		return c;
	}
	
	public static CadJuridWareline converteCadJuridicoPostPreToMySql(CadJuridPG p, WarelineServers server) {
		
		CadJuridWareline c = new CadJuridWareline();
		c.setBairrojuri(p.getBairrojuri());
		c.setCeljuri(p.getCeljuri());
		c.setCepjuri(p.getCepjuri());
		c.setCidadejuri(p.getCidadejuri());
		c.setCnpjjuri(p.getCnpjjuri());
		c.setCodprest(p.getCodprest());
		c.setCompleju(p.getCompleju());
		c.setContatjuri(p.getContatjuri());
		c.setCooperativ(p.getCooperativ());
		c.setEmail2juri(p.getEmail2juri());
		c.setEmailjuri(p.getEmailjuri());
		c.setEnderjuri(p.getEnderjuri());
		c.setFaxjuri(p.getFaxjuri());
		c.setFonconjuri(p.getFonconjuri());
		c.setFonejuri(p.getFonejuri());
		c.setIbgeju(p.getIbgeju());
		c.setIejuri(p.getIejuri());
		c.setImjuri(p.getImjuri());
		c.setLograju(p.getLograju());
		c.setNumlogrju(p.getNumlogrju());
		c.setRazaojuri(p.getRazaojuri());
		c.setResponjuri(p.getResponjuri());
		c.setTipologrju(p.getTipologrju());
		c.setTsobtencaoinformacao(currentTimestamp());
		c.setUnidade(server.getUnidade());
		return c;
	}

	public static CadPrestWareline convertePrestadoresPostPreToMySql(CadPrestPG p, WarelineServers server) {
		CadPrestWareline c = new CadPrestWareline();

		c.setAgendaweb(p.getAgendaweb());
		c.setAgeprest(p.getAgeprest());
		c.setApelido(p.getApelido());
		c.setAssinaelet(p.getAssinaelet());
		c.setAssinamax(p.getAssinamax());
		c.setAutoraih(p.getAutoraih());
		c.setBancoprest(p.getBancoprest());
		c.setCargo(p.getCargo());
		c.setCategprest(p.getCategprest());
		c.setCbo(p.getCbo());
		c.setCbos(p.getCbos());
		c.setCfps(p.getCfps());
		c.setCnes(p.getCnes());
		c.setCnespf(p.getCnespf());
		c.setCodalter(p.getCodalter());
		c.setCodarquivo(p.getCodarquivo());
		c.setCodativ(p.getCodativ());
		c.setCodcc(p.getCodcc());
		c.setCodconexa(p.getCodconexa());
		c.setCodctbadi(p.getCodctbadi());
		c.setCodctbdesp(p.getCodctbdesp());
		c.setCodctbpre(p.getCodctbpre());
		c.setCoddepara(p.getCoddepara());
		c.setCoddesp(p.getCoddesp());
		c.setCodgrupre(p.getCodgrupre());
		c.setCodopeatu(p.getCodopeatu());
		c.setCodopecad(p.getCodopecad());
		c.setCodperiodo(p.getCodperiodo());
		c.setCodprest(p.getCodprest());
		c.setCondpagto(p.getCondpagto());
		c.setContaprest(p.getContaprest());
		c.setContcprb(p.getContcprb());
		c.setCrmdos(p.getCrmdos());
		c.setCrprest(p.getCrprest());
		c.setCtbexcede(p.getCtbexcede());
		c.setDatacorpo(p.getDatacorpo());
		c.setDatacrm(p.getDatacrm());
		c.setDataprest(p.getDataprest());
		c.setDivideval(p.getDivideval());
		c.setDomfisca(p.getDomfisca());
		c.setDtadmissao(p.getDtadmissao());
		c.setDtdemissao(p.getDtdemissao());
		c.setEquipesug(p.getEquipesug());
		c.setFatuminimo(p.getFatuminimo());
		c.setFormalanca(p.getFormalanca());
		c.setFormapagto(p.getFormapagto());
		c.setFormapg(p.getFormapg());
		c.setGruporepa(p.getGruporepa());
		c.setHpcompraav(p.getHpcompraav());
		c.setHpcomprapr(p.getHpcomprapr());
		c.setHppagtoav(p.getHppagtoav());
		c.setHppagtopar(p.getHppagtopar());
		c.setHppagtoprz(p.getHppagtoprz());
		c.setunidade(server.getUnidade());
		c.setInativo(p.getInativo());
		c.setIndcprb(p.getIndcprb());
		c.setMaxpedido(p.getMaxpedido());
		c.setMaxpedmes(p.getMaxpedmes());
		c.setMsgagravo(p.getMsgagravo());
		c.setNomeprest(p.getNomeprest());
		c.setObrigaequi(p.getObrigaequi());
		c.setObrigcompl(p.getObrigcompl());
		c.setObsprest(p.getObsprest());
		c.setObsrestri(p.getObsrestri());
		c.setOutrafonte(p.getOutrafonte());
		c.setPercecofin(p.getPercecofin());
		c.setPercecompl(p.getPercecompl());
		c.setPercecpc(p.getPercecpc());
		c.setPercecsll(p.getPercecsll());
		c.setPerceinss(p.getPerceinss());
		c.setPerceirrf(p.getPerceirrf());
		c.setPerceiss(p.getPerceiss());
		c.setPercepis(p.getPercepis());
		c.setPermitea(p.getPermitea());
		c.setPermitee(p.getPermitee());
		c.setPermiteate(p.getPermiteate());
		c.setPermitei(p.getPermitei());
		c.setPrazoentr(p.getPrazoentr());
		c.setPrefeitura(p.getPrefeitura());
		c.setPrestprec(p.getPrestprec());
		c.setPrestresp(p.getPrestresp());
		c.setPrestserv(p.getPrestserv());
		c.setPrevfds(p.getPrevfds());
		c.setPrioridade(p.getPrioridade());
		c.setQtd1(p.getQtd1());
		c.setRecados(p.getRecados());
		c.setRecebevadv(p.getRecebevadv());
		c.setRecebfilme(p.getRecebfilme());
		c.setSaidacorpo(p.getSaidacorpo());
		c.setSiglacr(p.getSiglacr());
		c.setSoexames(p.getSoexames());
		c.setSubcateg(p.getSubcateg());
		c.setTipoativ(p.getTipoativ());
		c.setTipodatultatuservico(p.getTipodatultatuservico());
		c.setTipoprest(p.getTipoprest());
		c.setTiposervi(p.getTiposervi());
		c.setTiposervico(p.getTiposervico());
		c.setTiprecolhe(p.getTiprecolhe());
		c.setTiprepasse(p.getTiprepasse());
		c.setTsobtencaoinformacao(currentTimestamp());
		c.setTxtevoana(p.getTxtevoana());
		c.setTxtevoenf(p.getTxtevoenf());
		c.setTxtevomed(p.getTxtevomed());
		c.setTxtevorec(p.getTxtevorec());
		c.setUfcr(p.getUfcr());
		c.setValiprop(p.getValiprop());
		c.setVincsus(p.getVincsus());
		c.setTsobtencaoinformacao(currentTimestamp());

		return c;
	}

	public static CadFuncWareline converteFuncionariosPostGreToMySql(CadFuncPG p, WarelineServers server) {
		CadFuncWareline c = new CadFuncWareline();

		c.setBairrofunc(p.getBairrofunc());
		c.setBipfunc(p.getBairrofunc());
		c.setCartofunc(p.getCartofunc());
		c.setCartrafunc(p.getCartrafunc());
		c.setCelfunc(p.getCelfunc());
		c.setCepfunc(p.getCepfunc());
		c.setCidadefunc(p.getCidadefunc());
		c.setCidnasfunc(p.getCidnasfunc());
		c.setCodprest(p.getCodprest());
		c.setComplefu(p.getComplefu());
		c.setConjfunc(p.getConjfunc());
		c.setCorfunc(p.getCorfunc());
		c.setCorpocli(p.getCorpocli());
		c.setCpffunc(p.getCpffunc());
		c.setDatargfunc(p.getDatargfunc());
		c.setDatcerfunc(p.getDatcerfunc());
		c.setDatentfunc(p.getDatentfunc());
		c.setDatnasfunc(p.getDatnasfunc());
		c.setEmail2func(p.getEmail2func());
		c.setEmailfunc(p.getEmailfunc());
		c.setEmirgfunc(p.getEmirgfunc());
		c.setEnderfunc(p.getEnderfunc());
		c.setEstcivfunc(p.getEstcivfunc());
		c.setFaxfunc(p.getFaxfunc());
		c.setFlsfunc(p.getFlsfunc());
		c.setFonefunc(p.getFonefunc());
		c.setGuerrafunc(p.getGuerrafunc());
		c.setIbgefu(p.getIbgefu());
		c.setUnidade(server.getUnidade());
		c.setLivrofunc(p.getLivrofunc());
		c.setLografu(p.getLografu());
		c.setMaefunc(p.getMaefunc());
		c.setNacnasfunc(p.getNacnasfunc());
		c.setNumdepend(p.getNumdepend());
		c.setOrgrgfunc(p.getOrgrgfunc());
		c.setPaifunc(p.getPaifunc());
		c.setPisfunc(p.getPisfunc());
		c.setRgfunc(p.getRgfunc());
		c.setSerietrfunc(p.getSerietrfunc());
		c.setSexofunc(p.getSexofunc());
		c.setTermofunc(p.getTermofunc());
		c.setTipcerfunc(p.getTipcerfunc());
		c.setTipologrfu(p.getTipologrfu());
		c.setTsobtencaoinformacao(currentTimestamp());
		c.setUffunc(p.getUffunc());
		c.setUfnasfunc(p.getUfnasfunc());
		c.setUfrgfunc(p.getUfrgfunc());

		return c;
	}

	public static CadUniWareline converteUnidadesPostGreeToMySql(CadUniPG p, List<WarelineServers> servers) {
		CadUniWareline c = new CadUniWareline();

		
		for(WarelineServers s: servers) {
			Integer codFilial = Integer.parseInt(p.getCoduni());
			if(codFilial == s.getCodfilial()) {
				c.setIdUnidade(s.getUnidade());
			}
		}
		
		c.setCnes(p.getCnes());
		c.setCodconexa(p.getCodconexa());
		c.setCodprest(p.getCodprest());
		c.setCodsus(p.getCodsus());
		c.setCoduni(p.getCoduni());
		c.setDigitpasta(p.getDigitpasta());
		c.setDistritsan(p.getDistritsan());
		c.setInativo(p.getInativo());
		c.setMedicoaudi(p.getMedicoaudi());
		c.setMedicoresp(p.getMedicoresp());
		c.setMedigestor(p.getMedigestor());
		c.setMedrespcir(p.getMedrespcir());
		c.setMedrespobs(p.getMedrespobs());
		c.setNomeuni(p.getNomeuni());
		c.setNumleitsus(p.getNumleitsus());
		c.setOrgaoemi(p.getOrgaoemi());
		c.setOrgaorec(p.getOrgaorec());
		c.setPercfideps(p.getPercfideps());
		c.setPercivhe(p.getPercivhe());
		c.setRegiaosaud(p.getRegiaosaud());
		c.setSecretdest(p.getSecretdest());
		c.setTiposecret(p.getTiposecret());
		c.setTsObtencaoInformacao(currentTimestamp());

		return c;
	}

	public static Timestamp currentTimestamp() {
		Timestamp now1 = null;
		try {
			ZonedDateTime now = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));

			int ano = Integer.parseInt(now.toString().substring(0, 4));
			int mes = Integer.parseInt(now.toString().substring(5, 7));
			int dias = Integer.parseInt(now.toString().substring(8, 10));
			int horas = Integer.parseInt(now.toString().substring(11, 13));
			int minutos = Integer.parseInt(now.toString().substring(14, 16));
			int segundos = Integer.parseInt(now.toString().substring(17, 19));
			int nanoSegundos = Integer.parseInt(now.toString().substring(20, 23));

			LocalDateTime localDateTime = LocalDateTime.of(ano, mes, dias, horas, minutos, segundos, nanoSegundos);
			Timestamp currentTimestamp = Timestamp.valueOf(localDateTime);
			now1 = currentTimestamp;
		}catch (Exception e) {
			now1 = new Timestamp(System.currentTimeMillis());
		}

		return now1;
	}
	
	public static Integer getCurrentYear() {
		ZonedDateTime now = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
		int ano = Integer.parseInt(now.toString().substring(0, 4));
		return ano;
	}
	
	public static Integer getCurrentMonth() {
		ZonedDateTime now = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
		int mes = Integer.parseInt(now.toString().substring(5, 7));
		return mes;
	}
	
	public static String getIp() {
		try {
			return InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			return "0.0.0.0";
		}
	}
}