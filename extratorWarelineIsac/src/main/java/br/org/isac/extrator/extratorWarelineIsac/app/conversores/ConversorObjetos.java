package br.org.isac.extrator.extratorWarelineIsac.app.conversores;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadDespMySql;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadFuncWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadGrudeMySql;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadJuridWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadPrestWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadUniWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.PagtosWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.PgDespMySql;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.PgParcelMySql;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.RecebimentosMySql;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.WarelineServers;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadDespPostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadFuncPostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadGrudePostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadJuridPostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadPrestPostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadUniPostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.PagtosPostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.PgDespPostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.PgParcelPostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.RecebimentosPostGre;

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
	
	public static PgParcelMySql convertePgParcelPostGreToMySql(PgParcelPostGre p, String mescomp, WarelineServers server) {
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
	
	public static PgDespMySql convertePgDespPostGreToMySql(PgDespPostGre p, String mescomp, WarelineServers server) {
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
	
	public static CadGrudeMySql converteGrupoDespesasPostGreToMySql(CadGrudePostGre p) {
		CadGrudeMySql c = new CadGrudeMySql();
		c.setClassidesp(p.getClassidesp());
		c.setCodgrude(p.getCodgrude());
		c.setDescgrude(p.getDescgrude());
		c.setInativo(p.getInativo());
		c.setTimestamp(currentTimestamp());
		return c;
	}
	
	public static CadDespMySql converteDespesasPostGreToMySql(CadDespPostGre p) {
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
	
	public static RecebimentosMySql converteRecebimentosPostGreToMySql(RecebimentosPostGre rpg, WarelineServers server) {
		RecebimentosMySql rms = new RecebimentosMySql();
		rms.setUnidade(server.getUnidade());
		
		String mesano = converteDateEmString(rpg.getDatemissao());
		Integer ano = Integer.parseInt(mesano.substring(6));
		Integer mes = Integer.parseInt(mesano.substring(3,5));
		
		rms.setAnocompetencia(ano);
		rms.setMescompetencia(mes);
		
		rms.setClassidoc(rpg.getClassidoc());
		rms.setCodbansuge(rpg.getCodbansuge());
		rms.setCodcondpg(rpg.getCodcondpg());
		rms.setCodconv(rpg.getCodconv());
		rms.setCodevenbai(rpg.getCodevenbai());
		rms.setCodeveninc(rpg.getCodeveninc());
		rms.setCodfilial(rpg.getCodfilial());
		rms.setCodmoeda(rpg.getCodmoeda());
		rms.setCodope(rpg.getCodope());
		rms.setCodopeatu(rpg.getCodopeatu());
		rms.setCodorcaf(rpg.getCodorcaf());
		rms.setCodpac(rpg.getCodpac());
		rms.setContabbai(rpg.getContabbai());
		rms.setContabinc(rpg.getCodeveninc());
		rms.setCpfresp(rpg.getCpfresp());
		rms.setDataadian(rpg.getDataadian());
		rms.setDataglosas(rpg.getDataglosas());
		rms.setDataultatu(rpg.getDataultatu());
		rms.setDatdigita(rpg.getDatdigita());
		rms.setDatemissao(rpg.getDatemissao());
		rms.setFluxo(rpg.getFluxo());
		rms.setFormasuge(rpg.getFormasuge());
		rms.setIdcontapac(rpg.getIdcontapac());
		rms.setMatriz(rpg.getMatriz());
		rms.setMesfimprov(rpg.getMesfimprov());
		rms.setMesiniprov(rpg.getMesiniprov());
		rms.setMesorcaf(rpg.getMesorcaf());
		rms.setNomecli(rpg.getNomecli());
		rms.setNomeresp(rpg.getNomeresp());
		rms.setNumatend(rpg.getNumatend());
		rms.setNumdoc(rpg.getNumdoc());
		rms.setNumnffat(rpg.getNumnffat());
		rms.setNumprojeto(rpg.getNumprojeto());
		rms.setNumrecebto(rpg.getNumrecebto());
		rms.setNumrecibo(rpg.getNumrecibo());
		rms.setNumreciboa(rpg.getNumreciboa());
		rms.setNumrecibov(rpg.getNumrecibov());
		rms.setNumsolver(rpg.getNumsolver());
		rms.setObserva(rpg.getObserva());
		rms.setParcelas(rpg.getParcelas());
		rms.setPortador(rpg.getPortador());
		rms.setPosicao(rpg.getPosicao());
		rms.setProvisiona(rpg.getPosicao());
		rms.setQtd1(rpg.getQtd1());
		rms.setTimestamp(currentTimestamp());
		rms.setTipocobr(rpg.getTipocobr());
		rms.setTipodoc(rpg.getTipodoc());
		rms.setTraspaso(rpg.getTraspaso());
		rms.setValcofins(rpg.getValcofins());
		rms.setValcpc(rpg.getValcpc());
		rms.setValcsll(rpg.getValcsll());
		rms.setValicms(rpg.getValicms());
		rms.setValinss(rpg.getValinss());
		rms.setValirrf(rpg.getValirrf());
		rms.setValiss(rpg.getValiss());
		rms.setValoradian(rpg.getValoradian());
		rms.setValorglosa(rpg.getValorglosa());
		rms.setValororig(rpg.getValororig());
		rms.setValortot(rpg.getValortot());
		rms.setValpis(rpg.getValpis());
		
		return rms;
	}
	
	
	public static PagtosWareline convertePagamentosPostPreToMySql(PagtosPostGre p, WarelineServers server) {
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
	
	public static CadJuridWareline converteCadJuridicoPostPreToMySql(CadJuridPostGre p, WarelineServers server) {
		
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

	public static CadPrestWareline convertePrestadoresPostPreToMySql(CadPrestPostGre p, WarelineServers server) {
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

	public static CadFuncWareline converteFuncionariosPostGreToMySql(CadFuncPostGre p, WarelineServers server) {
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

	public static CadUniWareline converteUnidadesPostGreeToMySql(CadUniPostGre p, List<WarelineServers> servers) {
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