package br.org.isac.extrator.extratorWarelineIsac.app.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.org.isac.extrator.extratorWarelineIsac.app.config.ParametrosUnidade;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadFuncWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadPrestWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadUniWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.PagtosWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.CadFuncMySqlRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.CadPrestMySqlRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.CadUniMySqlRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.PagtosMySqlRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadFuncPostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadPrestPostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadUniPostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.PagtosPostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.CadFuncPostGreRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.CadPrestPostGreRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.CadUniPostGreRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.PagtosPostGreRepository;



@RestController
public class ExtratorWarelineController {
	/***
	 * Atencao!!!
	 * Somente o HMA tem mais de uma filial. Para outras unidades, ignorar as linhas que 
	 * contenham informacoes de outras filiais (acima de 1)
	 */
	private Integer ID_FILIAL_1 = ParametrosUnidade.HMA.intValue();
	private Integer ID_FILIAL_2 = ParametrosUnidade.AMB_MUNIC_ARAGUAINA.intValue();
	private Integer ID_FILIAL_3 = ParametrosUnidade.UTI_HRA.intValue();

	@Autowired
	private CadUniPostGreRepository cadUniPostGreRepo;

	@Autowired
	private CadUniMySqlRepository cadUniMySqlRepo;

	@Autowired
	private CadFuncPostGreRepository cadFuncPostGreRepo;

	@Autowired
	private CadFuncMySqlRepository cadFuncMySqlRepo;

	@Autowired
	private CadPrestPostGreRepository cadPrestPostGreRepo;

	@Autowired
	private CadPrestMySqlRepository cadPrestMySqlRepo;

	@Autowired
	private PagtosPostGreRepository pagtosPostGreRepo;

	@Autowired
	private PagtosMySqlRepository pagtosMySqlRepo;

	@GetMapping(value = "/cadUni")
	public ModelAndView cadUni(ModelMap model, HttpSession session) {

		System.out.println("Comecando a recuperacao de registros de CadUni: "+ currentTimestamp());

		List<CadUniPostGre> cadastros = cadUniPostGreRepo.findAll();

		System.out.println(cadastros.size() + " registros recuperados. Comecando a iteracao de CadUni (convert to Caduni - MySQL): "+ currentTimestamp());

		List<CadUniWareline> cadsPt = new ArrayList<CadUniWareline>();
		for(CadUniPostGre c : cadastros) {
			cadsPt.add(converteUnidadesPostGreeToMySql(c));
		}

		System.out.println("Dados convertidos. Iniciando a gravacao do Banco de Dados do PT (MySQL): "+ currentTimestamp());

		cadUniMySqlRepo.saveAll(cadsPt);

		System.out.println("Dados gravados do Banco de Dados do PT (MySQL): "+ currentTimestamp());

		return new ModelAndView("index", model);
	}

	@GetMapping(value = "/cadFunc")
	public ModelAndView cadFunc(ModelMap model, HttpSession session) {

		System.out.println("Comecando a recuperacao de registros de cadFunc: "+ currentTimestamp());

		List<CadFuncPostGre> cadastros = cadFuncPostGreRepo.findAll();

		System.out.println(cadastros.size() + " registros recuperados. Comecando a iteracao de cadFunc (convert to cadFunc - MySQL): "+ currentTimestamp());

		List<CadFuncWareline> cadsPt = new ArrayList<CadFuncWareline>();
		for(CadFuncPostGre c : cadastros) {
			cadsPt.add(converteFuncionariosPostGreToMySql(c));
		}

		System.out.println("Dados convertidos. Iniciando a gravacao do Banco de Dados do PT (MySQL): "+ currentTimestamp());

		cadFuncMySqlRepo.saveAll(cadsPt);

		System.out.println("Dados gravados do Banco de Dados do PT (MySQL): "+ currentTimestamp());

		return new ModelAndView("index", model);
	}

	@GetMapping(value = "/cadPrest")
	public ModelAndView cadPrest(ModelMap model, HttpSession session) {

		System.out.println("Comecando a recuperacao de registros de cadPrest: "+ currentTimestamp());

		List<CadPrestPostGre> cadastros = cadPrestPostGreRepo.findAll();

		System.out.println(cadastros.size() + " registros recuperados. Comecando a iteracao de cadPrest (convert to cadPrest - MySQL): "+ currentTimestamp());

		List<CadPrestWareline> cadsPt = new ArrayList<CadPrestWareline>();
		for(CadPrestPostGre c : cadastros) {
			cadsPt.add(convertePrestadoresPostPreToMySql(c));
		}

		System.out.println("Dados convertidos. Iniciando a gravacao do Banco de Dados do PT (MySQL): "+ currentTimestamp());

		cadPrestMySqlRepo.saveAll(cadsPt);

		System.out.println("Dados gravados do Banco de Dados do PT (MySQL): "+ currentTimestamp());

		return new ModelAndView("index", model);
	}

	@GetMapping(value = "/pagtos")
	public ModelAndView pagtos(@ModelAttribute("mesComp") String mesComp, ModelMap model, HttpSession session) {

		System.out.println("Comecando a recuperacao de registros de pagtos: "+ currentTimestamp());

		List<PagtosPostGre> pgtos = pagtosPostGreRepo.obterPagamentosWarelinePorMesCompetencia(mesComp);

		System.out.println(pgtos.size() + " registros recuperados. Comecando a iteracao de pagtos (convert to pagtos - MySQL): "+ currentTimestamp());

		List<PagtosWareline> cadsPt = new ArrayList<PagtosWareline>();
		for(PagtosPostGre c : pgtos) {
			cadsPt.add(convertePagamentosPostPreToMySql(c));
		}

		System.out.println("Dados convertidos. Iniciando a gravacao do Banco de Dados do PT (MySQL): "+ currentTimestamp());

		pagtosMySqlRepo.saveAll(cadsPt);

		System.out.println("Dados gravados do Banco de Dados do PT (MySQL): "+ currentTimestamp());

		return new ModelAndView("index", model);
	}

	private PagtosWareline convertePagamentosPostPreToMySql(PagtosPostGre p) {
		PagtosWareline c = new PagtosWareline();

		//somente para HMA
		Integer codFilial = Integer.parseInt(p.getCodfilial());
		if(codFilial == 1) c.setUnidade(ID_FILIAL_1);
		if(codFilial == 2) c.setUnidade(ID_FILIAL_2);
		if(codFilial == 3) c.setUnidade(ID_FILIAL_3);
		
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

	private CadPrestWareline convertePrestadoresPostPreToMySql(CadPrestPostGre p) {
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
		c.setIdUnidade(ID_FILIAL_1);
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
		c.setTsObtencaoInformacao(currentTimestamp());
		c.setTxtevoana(p.getTxtevoana());
		c.setTxtevoenf(p.getTxtevoenf());
		c.setTxtevomed(p.getTxtevomed());
		c.setTxtevorec(p.getTxtevorec());
		c.setUfcr(p.getUfcr());
		c.setValiprop(p.getValiprop());
		c.setVincsus(p.getVincsus());

		return c;
	}

	private CadFuncWareline converteFuncionariosPostGreToMySql(CadFuncPostGre p) {
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
		c.setIdUnidade(ID_FILIAL_1+"");
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
		c.setTsObtencaoInformacao(currentTimestamp());
		c.setUffunc(p.getUffunc());
		c.setUfnasfunc(p.getUfnasfunc());
		c.setUfrgfunc(p.getUfrgfunc());

		return c;
	}

	private CadUniWareline converteUnidadesPostGreeToMySql(CadUniPostGre p) {
		CadUniWareline c = new CadUniWareline();

		//somente para HMA
		Integer codFilial = Integer.parseInt(p.getCoduni());
		if(codFilial == 1) c.setIdUnidade(ID_FILIAL_1);
		if(codFilial == 2) c.setIdUnidade(ID_FILIAL_2);
		if(codFilial == 3) c.setIdUnidade(ID_FILIAL_3);

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

	private Timestamp currentTimestamp() {
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
}