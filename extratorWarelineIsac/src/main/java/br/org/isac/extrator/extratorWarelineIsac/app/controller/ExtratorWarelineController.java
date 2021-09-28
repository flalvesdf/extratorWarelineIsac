package br.org.isac.extrator.extratorWarelineIsac.app.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.org.isac.extrator.extratorWarelineIsac.app.domain.CadFunc;
import br.org.isac.extrator.extratorWarelineIsac.app.repository.CadFuncRepository;

@Transactional
@RestController
@RequestMapping("")
public class ExtratorWarelineController {
	
	@Autowired
	CadFuncRepository funRepo;
	
	@GetMapping("start") 
	public ModelAndView start(BindingResult result, ModelMap model, HttpSession session) {

		List<CadFunc> cads = funRepo.findAll();
		model.addAttribute("cads", cads);
		return new ModelAndView("index", model);
	}
	
	

}
