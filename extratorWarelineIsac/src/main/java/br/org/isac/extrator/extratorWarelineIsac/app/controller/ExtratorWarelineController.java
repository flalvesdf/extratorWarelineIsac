package br.org.isac.extrator.extratorWarelineIsac.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.org.isac.extrator.extratorWarelineIsac.app.conversores.ConversorObjetos;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadDespMySql;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadFuncWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadGrudeMySql;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadPrestWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadUniWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.PagtosWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.PgDespMySql;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.PgParcelMySql;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.CadDespMySqlRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.CadFuncMySqlRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.CadGrudeMySqlRèpository;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.CadPrestMySqlRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.CadUniMySqlRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.PagtosMySqlRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.PgDespMySqlRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.PgParcelMySqlRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadDespPostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadFuncPostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadGrudePostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadPrestPostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadUniPostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.PagtosPostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.PgDespPostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.PgParcelPostGre;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.CadDespPostGreRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.CadFuncPostGreRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.CadGrudePostGreRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.CadPrestPostGreRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.CadUniPostGreRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.PagtosPostGreRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.PgDespPostGreDao;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.PgDespPostGreRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.PgParcelPostGreDao;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.PgParcelPostGreRepository;



@RestController
public class ExtratorWarelineController {
	

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
	
	@Autowired
	private CadGrudePostGreRepository cadGrudePostGreRepo;
	
	@Autowired
	private CadGrudeMySqlRèpository cadGrudeMySqlRepo;
	
	@Autowired 
	private CadDespPostGreRepository cadDespPostGreRepo;
	
	@Autowired
	private CadDespMySqlRepository cadDespMySqlRepo;
	
	//@Autowired
	//private PgDespPostGreRepository pgDespPostGreRepo;
	
	@Autowired
	private PgDespMySqlRepository pgDespMyRepo;
	
	//@Autowired
	//private PgParcelPostGreRepository pgParcelPostGreRepo;
	
	@Autowired
	private PgParcelMySqlRepository pgParcelMySqlRepo;
	
	@Autowired
	private PgDespPostGreDao pgDespPostGresDao;
	
	@Autowired
	private PgParcelPostGreDao pgParcelPostGreDao;
	
	@GetMapping(value = "/cadgrude")
	public ModelAndView cadgrude(ModelMap model, HttpSession session) {

		System.out.println("Comecando a recuperacao de registros de cadgrude: "+ ConversorObjetos.currentTimestamp());

		List<CadGrudePostGre> cadastros = cadGrudePostGreRepo.findAll();

		System.out.println(cadastros.size() + " registros recuperados. Comecando a iteracao de cadgrude (convert to Caduni - MySQL): "+ ConversorObjetos.currentTimestamp());

		List<CadGrudeMySql> cadsPt = new ArrayList<CadGrudeMySql>();
		for(CadGrudePostGre c : cadastros) {
			cadsPt.add(ConversorObjetos.converteGrupoDespesasPostGreToMySql(c));
		}

		System.out.println("Dados convertidos. Iniciando a gravacao do Banco de Dados do PT (MySQL): "+ ConversorObjetos.currentTimestamp());

		cadGrudeMySqlRepo.saveAll(cadsPt);

		System.out.println("Dados gravados do Banco de Dados do PT (MySQL): "+ ConversorObjetos.currentTimestamp());

		return new ModelAndView("index", model);
	}
	
	@GetMapping(value = "/caddesp")
	public ModelAndView caddesp(ModelMap model, HttpSession session) {

		System.out.println("Comecando a recuperacao de registros de caddesp: "+ ConversorObjetos.currentTimestamp());

		List<CadDespPostGre> cadastros = cadDespPostGreRepo.findAll();

		System.out.println(cadastros.size() + " registros recuperados. Comecando a iteracao de caddesp (convert to Caduni - MySQL): "+ ConversorObjetos.currentTimestamp());

		List<CadDespMySql> cadsPt = new ArrayList<CadDespMySql>();
		for(CadDespPostGre c : cadastros) {
			cadsPt.add(ConversorObjetos.converteDespesasPostGreToMySql(c));
		}

		System.out.println("Dados convertidos. Iniciando a gravacao do Banco de Dados do PT (MySQL): "+ ConversorObjetos.currentTimestamp());

		cadDespMySqlRepo.saveAll(cadsPt);

		System.out.println("Dados gravados do Banco de Dados do PT (MySQL): "+ ConversorObjetos.currentTimestamp());

		return new ModelAndView("index", model);
	}

	@GetMapping(value = "/cadUni")
	public ModelAndView cadUni(ModelMap model, HttpSession session) {

		System.out.println("Comecando a recuperacao de registros de CadUni: "+ ConversorObjetos.currentTimestamp());

		List<CadUniPostGre> cadastros = cadUniPostGreRepo.findAll();

		System.out.println(cadastros.size() + " registros recuperados. Comecando a iteracao de CadUni (convert to Caduni - MySQL): "+ ConversorObjetos.currentTimestamp());

		List<CadUniWareline> cadsPt = new ArrayList<CadUniWareline>();
		for(CadUniPostGre c : cadastros) {
			cadsPt.add(ConversorObjetos.converteUnidadesPostGreeToMySql(c));
		}

		System.out.println("Dados convertidos. Iniciando a gravacao do Banco de Dados do PT (MySQL): "+ ConversorObjetos.currentTimestamp());

		cadUniMySqlRepo.saveAll(cadsPt);

		System.out.println("Dados gravados do Banco de Dados do PT (MySQL): "+ ConversorObjetos.currentTimestamp());

		return new ModelAndView("index", model);
	}

	@GetMapping(value = "/cadFunc")
	public ModelAndView cadFunc(ModelMap model, HttpSession session) {

		System.out.println("Comecando a recuperacao de registros de cadFunc: "+ ConversorObjetos.currentTimestamp());

		List<CadFuncPostGre> cadastros = cadFuncPostGreRepo.findAll();

		System.out.println(cadastros.size() + " registros recuperados. Comecando a iteracao de cadFunc (convert to cadFunc - MySQL): "+ ConversorObjetos.currentTimestamp());

		List<CadFuncWareline> cadsPt = new ArrayList<CadFuncWareline>();
		for(CadFuncPostGre c : cadastros) {
			cadsPt.add(ConversorObjetos.converteFuncionariosPostGreToMySql(c));
		}

		System.out.println("Dados convertidos. Iniciando a gravacao do Banco de Dados do PT (MySQL): "+ ConversorObjetos.currentTimestamp());

		cadFuncMySqlRepo.saveAll(cadsPt);

		System.out.println("Dados gravados do Banco de Dados do PT (MySQL): "+ ConversorObjetos.currentTimestamp());

		return new ModelAndView("index", model);
	}

	@GetMapping(value = "/cadPrest")
	public ModelAndView cadPrest(ModelMap model, HttpSession session) {

		System.out.println("Comecando a recuperacao de registros de cadPrest: "+ ConversorObjetos.currentTimestamp());

		List<CadPrestPostGre> cadastros = cadPrestPostGreRepo.findAll();

		System.out.println(cadastros.size() + " registros recuperados. Comecando a iteracao de cadPrest (convert to cadPrest - MySQL): "+ ConversorObjetos.currentTimestamp());

		List<CadPrestWareline> cadsPt = new ArrayList<CadPrestWareline>();
		for(CadPrestPostGre c : cadastros) {
			cadsPt.add(ConversorObjetos.convertePrestadoresPostPreToMySql(c));
		}

		System.out.println("Dados convertidos. Iniciando a gravacao do Banco de Dados do PT (MySQL): "+ ConversorObjetos.currentTimestamp());

		cadPrestMySqlRepo.saveAll(cadsPt);

		System.out.println("Dados gravados do Banco de Dados do PT (MySQL): "+ ConversorObjetos.currentTimestamp());

		return new ModelAndView("index", model);
	}

	@GetMapping(value = "/pagtos")
	public ModelAndView pagtos(@ModelAttribute("mesComp") String mesComp, ModelMap model, HttpSession session) {

		System.out.println("Comecando a recuperacao de registros de pagtos: "+ ConversorObjetos.currentTimestamp());

		List<PagtosPostGre> pgtos = pagtosPostGreRepo.obterPagamentosWarelinePorMesCompetencia(mesComp);

		System.out.println(pgtos.size() + " registros recuperados. Comecando a iteracao de pagtos (convert to pagtos - MySQL): "+ ConversorObjetos.currentTimestamp());

		List<PagtosWareline> cadsPt = new ArrayList<PagtosWareline>();
		for(PagtosPostGre c : pgtos) {
			cadsPt.add(ConversorObjetos.convertePagamentosPostPreToMySql(c));
		}

		System.out.println("Dados convertidos. Iniciando a gravacao do Banco de Dados do PT (MySQL): "+ ConversorObjetos.currentTimestamp());

		pagtosMySqlRepo.saveAll(cadsPt);

		System.out.println("Dados gravados do Banco de Dados do PT (MySQL): "+ ConversorObjetos.currentTimestamp());

		return new ModelAndView("index", model);
	}
	
	@GetMapping(value = "/pgdesp")
	public ModelAndView pgdesp(@ModelAttribute("competencia") String mesComp, ModelMap model, HttpSession session) {

		System.out.println("Comecando a recuperacao de registros de pgdesp: "+ ConversorObjetos.currentTimestamp());

		//List<PgDespPostGre> pgtos = pgDespPostGreRepo.obterPagamentosMesCompetencia(mesComp);
		List<PgDespPostGre> pgtos = pgDespPostGresDao.getPagamentosMesCompetencia(mesComp);

		System.out.println(pgtos.size() + " registros recuperados. Comecando a iteracao de pgdesp (convert to pagtos - MySQL): "+ ConversorObjetos.currentTimestamp());

		List<PgDespMySql> cadsPt = new ArrayList<PgDespMySql>();
		for(PgDespPostGre c : pgtos) {
			cadsPt.add(ConversorObjetos.convertePgDespPostGreToMySql(c));
		}

		System.out.println("Dados convertidos. Iniciando a gravacao do Banco de Dados do PT (MySQL): "+ ConversorObjetos.currentTimestamp());

		pgDespMyRepo.saveAll(cadsPt);

		System.out.println("Dados gravados do Banco de Dados do PT (MySQL): "+ ConversorObjetos.currentTimestamp());

		return new ModelAndView("index", model);
	}
	
	@GetMapping(value = "/pgparcel")
	public ModelAndView pgparcel(@ModelAttribute("competencia") String mesComp, ModelMap model, HttpSession session) {

		System.out.println("Comecando a recuperacao de registros de pgparcel: "+ ConversorObjetos.currentTimestamp());

		List<PgParcelPostGre> pgtos = pgParcelPostGreDao.getPagamentosMesCompetencia(mesComp);

		System.out.println(pgtos.size() + " registros recuperados. Comecando a iteracao de pgparcel (convert to pagtos - MySQL): "+ ConversorObjetos.currentTimestamp());

		List<PgParcelMySql> cadsPt = new ArrayList<PgParcelMySql>();
		for(PgParcelPostGre c : pgtos) {
			cadsPt.add(ConversorObjetos.convertePgParcelPostGreToMySql(c));
		}

		System.out.println("Dados convertidos. Iniciando a gravacao do Banco de Dados do PT (MySQL): "+ ConversorObjetos.currentTimestamp());

		pgParcelMySqlRepo.saveAll(cadsPt);

		System.out.println("Dados gravados do Banco de Dados do PT (MySQL): "+ ConversorObjetos.currentTimestamp());

		return new ModelAndView("index", model);
	}
}