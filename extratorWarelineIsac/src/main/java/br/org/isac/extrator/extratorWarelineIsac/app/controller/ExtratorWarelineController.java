package br.org.isac.extrator.extratorWarelineIsac.app.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadFuncMySql;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.CadFuncMySqlRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadFuncPostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.CadFuncPostGreRepository;



@RestController
public class ExtratorWarelineController {
	
	@Autowired
	private CadFuncMySqlRepository cfMsRepo;
	
	
	@Autowired
	private CadFuncPostGreRepository cfPRepo;

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
	
	

}
