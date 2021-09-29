package br.org.isac.extrator.extratorWarelineIsac.app.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.org.isac.extrator.extratorWarelineIsac.app.config.ParametrosUnidade;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadFuncMySql;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.PagamentosWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.CadFuncMySqlRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.PagamentosWarelineRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadFuncPostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.PagtosPostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.CadFuncPostGreRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.PagtosPostGreRepository;



@RestController
public class ExtratorWarelineController {
	
	@Autowired
	private CadFuncMySqlRepository cfMsRepo;
	
	
	@Autowired
	private CadFuncPostGreRepository cfPRepo;
	
	@Autowired
	private PagtosPostGreRepository pagtosWareline;
	
	@Autowired
	private PagamentosWarelineRepository ptPagtos;

	@GetMapping(value = "/start")
	public ModelAndView start(ModelMap model, HttpSession session) {

		List<CadFuncPostGre> cads = cfPRepo.findAll();
		model.addAttribute("cads", cads);
		return new ModelAndView("index", model);
	}
	
	@GetMapping(value = "/start2")
	public ModelAndView start2(ModelMap model, HttpSession session) {

		List<CadFuncMySql> cads = cfMsRepo.findAll();
		model.addAttribute("cads2", cads);
		return new ModelAndView("index", model);
	}
	
	@GetMapping(value = "/saveMysql")
	public ModelAndView saveMysql(ModelMap model, HttpSession session) {
		
		CadFuncMySql c = new CadFuncMySql();
		c.setCodprest("1795");
		c.setDatnasfunc("23/06/1984");
		c.setEnderfunc("GFDGHGH");
		c.setEstcivfunc("F");
		c.setSexofunc("F");
				
		cfMsRepo.save(c);

		List<CadFuncMySql> cads = cfMsRepo.findAll();
		model.addAttribute("cads2", cads);
		return new ModelAndView("index", model);
	}
	
	
	//@Scheduled(cron = "0 15 10 15 * ?") //todo dia 15 do mes as 10:15 da manha
	@Scheduled(fixedDelay = 1000*60)
	public void scheduleTaskUsingCronExpression() {
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
	 
	    //long now = System.currentTimeMillis() / 1000;
	    System.out.println(
	      "schedule tasks using cron jobs - " + now1);
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
	
	@GetMapping(value = "/saveMysql")
	public void teste1(ModelMap model, HttpSession session) {
		System.out.println("comecando: "+ currentTimestamp());
		
		List<PagtosPostGre> pgtos = obterPagamentosMesCompentencia();
		salvarPagamentosPortalTransparencia(pgtos);
		
		System.out.println("fim: "+ currentTimestamp());
	}
	
	private List<PagtosPostGre> obterPagamentosMesCompentencia(){
		List<PagtosPostGre> pgtos = pagtosWareline.obterPagamentosWarelinePorMesCompetencia();
		return pgtos;
	}
	
	
	/***
	 * SELECT a.numpagto, a.tipodoc, a.numentr, a.numdoc, a.codfilial, a.codprest, a.portador, 
       a.observa, a.datemissao, a.datentrada, a.datdigita, a.codope, a.dataultatu, 
       a.codopeatu, a.parcelas, a.valortot, a.nomefornec, a.mescomp, 
       b.tipoprest, b.categprest, b.nomeprest FROM "PACIENTE".pagtos a INNER JOIN "PACIENTE".cadprest b on (a.codprest = b.codprest) 

  where a.mescomp = '2021/09';
	 * @param idUnidade
	 * @return
	 */
	private void salvarPagamentosPortalTransparencia(List<PagtosPostGre> pgtos) {
		
		List<PagamentosWareline> pagamentos = new ArrayList<>();
		for(PagtosPostGre p: pgtos) {
			PagamentosWareline pg = new PagamentosWareline();
			pg.setNumpagto(p.getNumpagto());
			pg.setNumdoc(Integer.parseInt(p.getNumdoc()));
			pg.setCodfilial(Integer.parseInt(p.getCodfilial()));
			pg.setCodprest(Integer.parseInt(p.getCodprest()));
			pg.setObserva(p.getObserva());
			pg.setDatemissao(p.getDatemissao());
			pg.setDatentrada(p.getDatentrada());
			pg.setDatdigita(p.getDatdigita());
			pg.setDataultatu(p.getDataultatu());
			pg.setValortot(p.getValortot());
			pg.setNomefornec(p.getNomefornec());
			pg.setMescomp(p.getMescomp());
			pg.setTipoprest(p.getTipoprest());
			pg.setCategprest(p.getCategprest());
			pg.setNomeprest(p.getNomeprest());
			
			if(pg.getCodfilial().intValue() == ParametrosUnidade.AMB_MUNIC_ARAGUAINA) {
				pg.setIdUnidade(ParametrosUnidade.AMB_MUNIC_ARAGUAINA);
			}
			
			if(pg.getCodfilial().intValue() == ParametrosUnidade.HMA) {
				pg.setIdUnidade(ParametrosUnidade.HMA);
			}
			
			if(pg.getCodfilial().intValue() == ParametrosUnidade.UTI_HRA) {
				pg.setIdUnidade(ParametrosUnidade.UTI_HRA);
			}
			
			pagamentos.add(pg);
			
			ptPagtos.saveAll(pagamentos);

		}
	}
	
	

}
