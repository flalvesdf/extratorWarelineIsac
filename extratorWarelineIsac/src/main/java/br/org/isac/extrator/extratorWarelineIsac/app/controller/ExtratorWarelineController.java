package br.org.isac.extrator.extratorWarelineIsac.app.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
	
	

}
