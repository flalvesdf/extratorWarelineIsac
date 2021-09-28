package br.org.isac.extrator.extratorWarelineIsac.app.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.org.isac.extrator.extratorWarelineIsac.app.domain.CadFunc;
import br.org.isac.extrator.extratorWarelineIsac.app.repository.CadFuncRepository;

@RestController
@RequestMapping("")
public class ExtratorWarelineController {
	
	@Autowired
	CadFuncRepository funRepo;
	
	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public ModelAndView start(ModelMap model, HttpSession session) {

		List<CadFunc> cads = funRepo.findAll();
		model.addAttribute("cads", cads);
		return new ModelAndView("index", model);
	}
	
	

}
