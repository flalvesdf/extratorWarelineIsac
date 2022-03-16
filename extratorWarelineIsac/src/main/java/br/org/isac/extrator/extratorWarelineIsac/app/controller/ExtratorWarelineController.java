package br.org.isac.extrator.extratorWarelineIsac.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.org.isac.extrator.extratorWarelineIsac.app.config.Tabelas;
import br.org.isac.extrator.extratorWarelineIsac.app.conversores.ConversorObjetos;
import br.org.isac.extrator.extratorWarelineIsac.app.conversores.Parametros;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadDespMySql;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadFuncWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadGrudeMySql;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadJuridWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadPrestWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.Log;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.PagtosWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.PgDespMySql;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.PgParcelMySql;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.RecebimentosWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.SolicitacaoAtualizacaoWareline;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.WarelineServers;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.CadDespMySqlRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.CadFuncMySqlRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.CadGrudeMySqlRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.CadJuridMySqlRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.CadPrestMySqlRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.LogRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.PagtosMySqlRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.PgDespMySqlRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.PgParcelMySqlRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.RecebimentosWarelineRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.SolicitacaoAtualizacaoWarelineRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.WarelineServersRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadDespPG;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadFuncPG;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadGrudePG;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadJuridPG;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadPrestPG;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.PagtosPG;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.PgDespPG;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.PgParcelPG;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.CadDespPGRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.CadFuncPGRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.CadGrudePGRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.CadJuridPostGreRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.CadPrestPostGreRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.PagtosPostGreRepository;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.PgDespPostGreDao;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.PgParcelPostGreDao;
import br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository.RecebimentosPGRepository;

@RestController
public class ExtratorWarelineController {

	@Autowired
	private CadFuncPGRepository cadFuncPostGreRepo;

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
	private CadGrudePGRepository cadGrudePostGreRepo;

	@Autowired
	private CadGrudeMySqlRepository cadGrudeMySqlRepo;

	@Autowired 
	private CadDespPGRepository cadDespPostGreRepo;

	@Autowired
	private CadDespMySqlRepository cadDespMySqlRepo;

	@Autowired
	private PgDespMySqlRepository pgDespMyRepo;

	@Autowired
	private PgParcelMySqlRepository pgParcelMySqlRepo;

	@Autowired
	private PgDespPostGreDao pgDespPostGresDao;

	@Autowired
	private PgParcelPostGreDao pgParcelPostGreDao;

	@Autowired
	private LogRepository logRepo;

	@Autowired
	private SolicitacaoAtualizacaoWarelineRepository solicitacaoRepo;

	@Autowired
	private WarelineServersRepository wlServerRepo;

	@Autowired
	private CadJuridPostGreRepository cadJuridPostGreRepo;

	@Autowired
	private CadJuridMySqlRepository cadJuridMySqlRepo;
	
	@Autowired
	private RecebimentosPGRepository recebimentosPosdtGreRepo;
	
	//@Autowired
	//private RecebimentosMySqlRepository recebimentosMySqlRepo;
	
	@Autowired
	private RecebimentosWarelineRepository recebimentosWarelineMySqlRepo;
	
	/***Exemplo Schedules:
	 * 
	 * @param de
	 *
	 * @Scheduled(cron = "0 03 22 * * *", zone = "America/Sao_Paulo")
	 * 
	 * @Scheduled(cron = “1 2 3 4 5 6")”
		1: segundo (preenchido de 0 a 59)
		2: minuto (preenchido de 0 a 59)
		3 hora (preenchido de 0 a 23)
		4 dia (preenchido de 0 a 31)
		5 mês (preenchido de 1 a 12)
		6 dia da semana (preenchido de 0 a 6)
		Nessa configuração @Scheduled(cron = “0 12 21 * * *”) esse método será executado todos os dias às 21h12 em ponto

		Outro exemplo:

		@Scheduled(fixedDelay = 1000): indica que o método anotado será executado a cada segundo. 
		O parâmetro esperado está em milissegundos (1000 = 1 segundo).
	 */

	/**Atenção:
	 * 
	 * Agendamento para ser executado às XX:XX horas de todo dia, de acordo com o que recuperar do banco de dados.
	 * Esta informacao (IP e horario) precisa estar cadastrado na base do Portal de Transparencia , tabela pt_wl_servidores
	 * #{@getCronValue} esta na classe de configuracao ExtratorWarelineIsacApplication
	 * 
	 * **/
	@Scheduled(cron="#{@getCronValue}", zone = "America/Sao_Paulo")
	public void executaAtualizacaoPagamentosWareline() {
		System.out.println("------------INICIANDO ATUALIZACAO-----------------");
		System.out.println(ConversorObjetos.currentTimestamp()+ " > Comecando a tarefa automatizada de recuperacao de dados. ");
		atualizaPgtosMesAnoAtual();
		atualizaPgParcelMesAnoAtual();
		atualizaPgDespMesAnoAtual();
		atualizaRecebimentosAnoAtual();
		System.out.println("------------ATUALIZACAO CONCLUIDA-------------------");
		System.out.println(ConversorObjetos.currentTimestamp()+ " > fim da tarefa automatizada de recuperacao de dados. ");
	}

	/***
	 * Verifica existencia de solicitacao a cada 30 minutos e irá gravra log de acesso para 
	 * saber se o servidor está ativo.
	 */
	@Scheduled(fixedDelay = (1800000))
	public void verificaExistenciaSolicitacaoPendenteParaUnidade() {
		System.out.println("------------INICIANDO VERIFICACAO-----------------");
		System.out.println("Verificação e execução de Solicitações pendentes Iniciada - " + ConversorObjetos.currentTimestamp());

		String server = ConversorObjetos.getIpServer();
		if(null == server) {
			System.out.println("Verificação e execução de Solicitações pendentes fallhou: Não foi possível obter o IP deste servidor. Horário: " + ConversorObjetos.currentTimestamp());
		}else {
			List<WarelineServers> servers = wlServerRepo.getServersByUnidade(Parametros.UNIDADES);

			for(WarelineServers wl: servers) {
				List<SolicitacaoAtualizacaoWareline> sols = solicitacaoRepo.obterSolicitacoesPorStatus(wl.getUnidade());

				if(sols != null && sols.size()>0) {
					System.out.println("Verificação e execução de Solicitações Pendentes - "+sols.size()+" solicitação(ões) para processar. " + ConversorObjetos.currentTimestamp());
					for(SolicitacaoAtualizacaoWareline s: sols) {
						s.setStatus("E");
						solicitacaoRepo.save(s);

						if(s.getTabela().equals(Tabelas.CADFUNC)) {
							executaSolicitacaoAtualizacaoTabelaCADFUNC(s);
							continue;
						}

						if(s.getTabela().equals(Tabelas.CADGRUDE)) {
							executaSolicitacaoAtualizacaoTabelaCADGRUDE(s);
							continue;
						}

						if(s.getTabela().equals(Tabelas.CADDESP)) {
							executaSolicitacaoAtualizacaoTabelaCADDESP(s);
							continue;
						}

						if(s.getTabela().equals(Tabelas.CADPREST)) {
							executaSolicitacaoAtualizacaoTabelaCADPREST(s);
							continue;
						}

						if(s.getTabela().equals(Tabelas.CADJURID)) {
							executaSolicitacaoAtualizacaoTabelaCADJURID(s);
							continue;
						}

						if(s.getTabela().equals(Tabelas.PAGTOS)) {
							executaSolicitacaoAtualizacaoTabelaPAGTOS(s);
							continue;
						}

						if(s.getTabela().equals(Tabelas.PGDESP)) {
							executaSolicitacaoAtualizacaoTabelaPGDESP(s);
							continue;
						}

						if(s.getTabela().equals(Tabelas.PGPARCEL)) {
							executaSolicitacaoAtualizacaoTabelaPGPARCEL(s);
							continue;
						}
						
						if(s.getTabela().equals(Tabelas.RECEBTOS)) {
							executaSolicitacaoAtualizacaoTabelaRECEBIMENTOS(s);
							continue;
						}
					}
				}else {
					System.out.println("Verificação e execução de Solicitações Pendentes. Nenhuma solicitação pendente." + ConversorObjetos.currentTimestamp());
				}
				
				wl.setUltimaverificacao(ConversorObjetos.currentTimestamp());
				wlServerRepo.save(wl);
			}

			System.out.println("Verificação e execução de Solicitações Pendentes Concluída - " + ConversorObjetos.currentTimestamp());
		}

		System.out.println("-------------VERIFICACAO CONCLUIDA-----------------");
	}
	
	@GetMapping(value = "/recebimentos")
	public ModelAndView recebimentos(@ModelAttribute("competencia") String mesComp, ModelMap model, HttpSession session) {
		System.out.println("Comecando a recuperacao de registros de RECEBIMENTOS: "+ ConversorObjetos.currentTimestamp());
		atualizaRecebimentosAnoAtual();
		System.out.println("Dados gravados do Banco de Dados do PT (MySQL): "+ ConversorObjetos.currentTimestamp());
		return new ModelAndView("index", model);
	}

	private void executaSolicitacaoAtualizacaoTabelaCADJURID(SolicitacaoAtualizacaoWareline s) {

		List<CadJuridPG> cadastros = cadJuridPostGreRepo.findAll();
		WarelineServers server = wlServerRepo.getServerByUnidade(s.getUnidade());
		if(cadastros != null && cadastros.size()>0) {

			cadJuridMySqlRepo.deleteCadastroJuridicoUnidade(s.getUnidade());

			List<CadJuridWareline> cadsPt = new ArrayList<CadJuridWareline>();
			for(CadJuridPG c : cadastros) {
				cadsPt.add(ConversorObjetos.converteCadJuridicoPostPreToMySql(c, server));
			}

			cadJuridMySqlRepo.saveAll(cadsPt);

			s.setStatus("C");
			s.setDatahoraatualizacao(ConversorObjetos.currentTimestamp());
			s.setResultado(cadastros.size() + " registros localizados e adicionados");
			solicitacaoRepo.save(s);
		}else {
			s.setStatus("C");
			s.setDatahoraatualizacao(ConversorObjetos.currentTimestamp());
			s.setResultado("Nenhum registro localizado para atualização");
			solicitacaoRepo.save(s);
		}
	}

	private void executaSolicitacaoAtualizacaoTabelaCADPREST(SolicitacaoAtualizacaoWareline s) {

		List<CadPrestPG> cadastros = cadPrestPostGreRepo.findAll();
		WarelineServers server = wlServerRepo.getServerByUnidade(s.getUnidade());
		if(cadastros != null && cadastros.size()>0) {

			cadPrestMySqlRepo.deleteCadastroPrestadoresUnidade(s.getUnidade());

			List<CadPrestWareline> cadsPt = new ArrayList<CadPrestWareline>();
			for(CadPrestPG c : cadastros) {
				cadsPt.add(ConversorObjetos.convertePrestadoresPostPreToMySql(c, server));
			}

			cadPrestMySqlRepo.saveAll(cadsPt);

			s.setStatus("C");
			s.setDatahoraatualizacao(ConversorObjetos.currentTimestamp());
			s.setResultado(cadastros.size() + " registros localizados e adicionados");
			solicitacaoRepo.save(s);
		}else {
			s.setStatus("C");
			s.setDatahoraatualizacao(ConversorObjetos.currentTimestamp());
			s.setResultado("Nenhum registro localizado para atualização");
			solicitacaoRepo.save(s);
		}
	}

	private void executaSolicitacaoAtualizacaoTabelaPGPARCEL(SolicitacaoAtualizacaoWareline s) {
		//exemplo 2021/09
		String mescomp = s.getAno() + "/"+(s.getMes()>9?s.getMes():"0"+s.getMes());
		WarelineServers server = wlServerRepo.getServerByUnidade(s.getUnidade());
		List<PgParcelPG> pagamentos = pgParcelPostGreDao.getPagamentosMesCompetencia(mescomp, "0"+server.getCodfilial());

		if(pagamentos != null && pagamentos.size()>0) {
			pgParcelMySqlRepo.deletePagamentosUnidadeMesCompetencia(s.getAno(), s.getMes(), s.getUnidade());

			List<PgParcelMySql> pgtos = new ArrayList<PgParcelMySql>();
			for(PgParcelPG p: pagamentos) {
				pgtos.add(ConversorObjetos.convertePgParcelPostGreToMySql(p, mescomp, server));
			}

			pgParcelMySqlRepo.saveAll(pgtos);

			s.setStatus("C");
			s.setDatahoraatualizacao(ConversorObjetos.currentTimestamp());
			s.setResultado(pagamentos.size() + " registros localizados e adicionados");
			solicitacaoRepo.save(s);

		}else {
			s.setStatus("C");
			s.setDatahoraatualizacao(ConversorObjetos.currentTimestamp());
			s.setResultado("Nenhum registro localizado para atualização");
			solicitacaoRepo.save(s);
		}
	}

	private void executaSolicitacaoAtualizacaoTabelaPGDESP(SolicitacaoAtualizacaoWareline s) {
		//exemplo 2021/09
		String mescomp = s.getAno() + "/"+(s.getMes()>9?s.getMes():"0"+s.getMes());
		WarelineServers server = wlServerRepo.getServerByUnidade(s.getUnidade());
		List<PgDespPG> pagamentos = pgDespPostGresDao.getPagamentosMesCompetencia(mescomp, "0"+server.getCodfilial());

		if(pagamentos != null && pagamentos.size()>0) {
			pgDespMyRepo.deletePagamentosUnidadeMesCompetencia(s.getAno(), s.getMes(), s.getUnidade());

			List<PgDespMySql> pgtos = new ArrayList<PgDespMySql>();
			for(PgDespPG p: pagamentos) {
				pgtos.add(ConversorObjetos.convertePgDespPostGreToMySql(p, mescomp, server));
			}

			pgDespMyRepo.saveAll(pgtos);

			s.setStatus("C");
			s.setDatahoraatualizacao(ConversorObjetos.currentTimestamp());
			s.setResultado(pagamentos.size() + " registros localizados e adicionados");
			solicitacaoRepo.save(s);

		}else {
			s.setStatus("C");
			s.setDatahoraatualizacao(ConversorObjetos.currentTimestamp());
			s.setResultado("Nenhum registro localizado para atualização");
			solicitacaoRepo.save(s);
		}
	}

	private void executaSolicitacaoAtualizacaoTabelaPAGTOS(SolicitacaoAtualizacaoWareline s) {
		//exemplo 2021/09
		String mescomp = s.getAno() + "/"+(s.getMes()>9?s.getMes():"0"+s.getMes());
		WarelineServers server = wlServerRepo.getServerByUnidade(s.getUnidade());
		List<PagtosPG> pagamentos = pagtosPostGreRepo.obterPagamentosWarelinePorMesCompetencia(mescomp, "0"+server.getCodfilial());

		if(pagamentos != null && pagamentos.size()>0) {
			pagtosMySqlRepo.deletePagamentosMesCompetencia(mescomp, s.getUnidade());

			List<PagtosWareline> pgtos = new ArrayList<PagtosWareline>();
			for(PagtosPG p: pagamentos) {
				pgtos.add(ConversorObjetos.convertePagamentosPostPreToMySql(p, server));
			}

			pagtosMySqlRepo.saveAll(pgtos);

			s.setStatus("C");
			s.setDatahoraatualizacao(ConversorObjetos.currentTimestamp());
			s.setResultado(pagamentos.size() + " registros localizados e adicionados");
			solicitacaoRepo.save(s);

		}else {
			s.setStatus("C");
			s.setDatahoraatualizacao(ConversorObjetos.currentTimestamp());
			s.setResultado("Nenhum registro localizado para atualização");
			solicitacaoRepo.save(s);
		}
	}
	
	private void executaSolicitacaoAtualizacaoTabelaRECEBIMENTOS(SolicitacaoAtualizacaoWareline s) {
		//exemplo 2021/09
		//String mescomp = s.getAno() + "/"+(s.getMes()>9?s.getMes():"0"+s.getMes());
		WarelineServers server = wlServerRepo.getServerByUnidade(s.getUnidade());
		List<Object[]> recebimentos = recebimentosPosdtGreRepo.getRecebimentosPorMesAno(s.getMes(), s.getAno(), "0"+server.getCodfilial());

		if(recebimentos != null && recebimentos.size()>0) {
			recebimentosWarelineMySqlRepo.deleteRecebimentosMesCompetencia(s.getAno(), s.getMes(), s.getUnidade());

			List<RecebimentosWareline> rcbs = new ArrayList<RecebimentosWareline>();
			for(Object[] rec: recebimentos) {
				rcbs.add(ConversorObjetos.converteArrayObjectToRecebimentosWarelineForMySql(rec, server));
			}

			recebimentosWarelineMySqlRepo.saveAll(rcbs);

			s.setStatus("C");
			s.setDatahoraatualizacao(ConversorObjetos.currentTimestamp());
			s.setResultado(rcbs.size() + " registros localizados e adicionados");
			solicitacaoRepo.save(s);

		}else {
			s.setStatus("C");
			s.setDatahoraatualizacao(ConversorObjetos.currentTimestamp());
			s.setResultado("Nenhum registro localizado para atualização");
			solicitacaoRepo.save(s);
		}
	}

	private void executaSolicitacaoAtualizacaoTabelaCADDESP(SolicitacaoAtualizacaoWareline s) {

		List<CadDespPG> cadastros = cadDespPostGreRepo.findAll();

		if(cadastros != null && cadastros.size()>0) {

			cadDespMySqlRepo.deleteAll();

			List<CadDespMySql> cadsPt = new ArrayList<CadDespMySql>();
			for(CadDespPG c : cadastros) {
				cadsPt.add(ConversorObjetos.converteDespesasPostGreToMySql(c));
			}

			cadDespMySqlRepo.saveAll(cadsPt);

			s.setStatus("C");
			s.setDatahoraatualizacao(ConversorObjetos.currentTimestamp());
			s.setResultado(cadastros.size() + " registros localizados e adicionados");
			solicitacaoRepo.save(s);
		}else {
			s.setStatus("C");
			s.setDatahoraatualizacao(ConversorObjetos.currentTimestamp());
			s.setResultado("Nenhum registro localizado para atualização");
			solicitacaoRepo.save(s);
		}
	}

	private void executaSolicitacaoAtualizacaoTabelaCADGRUDE(SolicitacaoAtualizacaoWareline s) {

		List<CadGrudePG> cadastros = cadGrudePostGreRepo.findAll();

		if(cadastros != null && cadastros.size()>0) {

			cadGrudeMySqlRepo.deleteAll();

			List<CadGrudeMySql> cadsPt = new ArrayList<CadGrudeMySql>();
			for(CadGrudePG c : cadastros) {
				cadsPt.add(ConversorObjetos.converteGrupoDespesasPostGreToMySql(c));
			}

			cadGrudeMySqlRepo.saveAll(cadsPt);

			s.setStatus("C");
			s.setDatahoraatualizacao(ConversorObjetos.currentTimestamp());
			s.setResultado(cadastros.size() + " registros localizados e adicionados");
			solicitacaoRepo.save(s);
		}else {
			s.setStatus("C");
			s.setDatahoraatualizacao(ConversorObjetos.currentTimestamp());
			s.setResultado("Nenhum registro localizado para atualização");
			solicitacaoRepo.save(s);
		}
	}

	private void executaSolicitacaoAtualizacaoTabelaCADFUNC(SolicitacaoAtualizacaoWareline s) {
		WarelineServers server = wlServerRepo.getServerByUnidade(s.getUnidade());
		List<CadFuncPG> cadastros = cadFuncPostGreRepo.findAll();

		if(cadastros != null && cadastros.size()>0) {

			cadFuncMySqlRepo.deleteCadastroFuncionariosUnidade(s.getUnidade());

			List<CadFuncWareline> cadsPt = new ArrayList<CadFuncWareline>();
			for(CadFuncPG c : cadastros) {
				cadsPt.add(ConversorObjetos.converteFuncionariosPostGreToMySql(c, server));
			}

			cadFuncMySqlRepo.saveAll(cadsPt);

			s.setStatus("C");
			s.setDatahoraatualizacao(ConversorObjetos.currentTimestamp());
			s.setResultado(cadastros.size() + " registros localizados e adicionados");
			solicitacaoRepo.save(s);
		}else {
			s.setStatus("C");
			s.setDatahoraatualizacao(ConversorObjetos.currentTimestamp());
			s.setResultado("Nenhum registro localizado para atualização");
			solicitacaoRepo.save(s);
		}
	}
	
//	private void atualizaRecebimentosMesAnoAtual() {
//
//		StringBuffer log = null;
//
//		//1 - recebe o mes e ano atuais:
//		Integer mes = ConversorObjetos.getCurrentMonth();
//		Integer ano = ConversorObjetos.getCurrentYear();
//		//String mescomp = ano + "/"+ (mes < 10? "0"+mes: mes);
//
//		List<WarelineServers> servers = wlServerRepo.getServersByUnidade(Parametros.UNIDADES);
//
//		for(WarelineServers s: servers) {
//			log = new StringBuffer();
//			log.append("Iniciando a atualização Base Wareline. Tabelas RECEBTOS/RCPARCEL/CADGRURC. "+ ConversorObjetos.currentTimestamp()+". ");
//			log.append("Parâmetros: Ano: "+ano+". Mês: "+ mes + ". Unidade: "+ s.getUnidade());
//
//			//2 - deleta os dados do mes e ano atuais:
//			recebimentosWarelineMySqlRepo.deleteRecebimentosMesCompetencia(mes, ano, s.getUnidade());
//
//			//3 - localiza os dados do mes e ano atuais:
//			List<Object[]> recebimentos = recebimentosPosdtGreRepo.getRecebimentosPorMesAno(ano, mes, "0"+s.getCodfilial());
//			log.append("Registros localizados: "+ recebimentos.size()+". ");
//
//			//4 - converte o objeto postgres em mysql:
//			List<RecebimentosWareline> rcbs = new ArrayList<RecebimentosWareline>();
//			for(Object[] rec : recebimentos) {
//				rcbs.add(ConversorObjetos.converteArrayObjectToRecebimentosWarelineForMySql(rec, s));
//			}
//
//			//5 - grava os dados no BD do Portal (MySql):
//			recebimentosWarelineMySqlRepo.saveAll(rcbs);
//			log.append(rcbs.size()+" registros inseridos. Conclusão em "+ ConversorObjetos.currentTimestamp());
//
//			//6 - salvando o log:
//			Log l = new Log();
//			l.setDataHora(ConversorObjetos.currentTimestamp());
//			l.setIdRegistro(0);
//			l.setIdUsuario(0);
//			l.setIp(ConversorObjetos.getIp());
//			l.setObservacao(log.toString());
//			l.setSecao("TBL_WARELINE_RECEBIMENTOS");
//			l.setTipoLog("DADOS_WARELINE");
//			l.setTipoRegistro(18);
//			logRepo.save(l);
//		}
//	}
	
	private void atualizaRecebimentosAnoAtual() {

		StringBuffer log = null;

		//1 - recebe o mes e ano atuais:
		//Integer mes = ConversorObjetos.getCurrentMonth();
		Integer ano = ConversorObjetos.getCurrentYear();
		//String mescomp = ano + "/"+ (mes < 10? "0"+mes: mes);

		List<WarelineServers> servers = wlServerRepo.getServersByUnidade(Parametros.UNIDADES);

		for(WarelineServers s: servers) {
			log = new StringBuffer();
			log.append("Iniciando a atualização Base Wareline. Tabelas RECEBTOS/RCPARCEL/CADGRURC. "+ ConversorObjetos.currentTimestamp()+". ");
			log.append("Parâmetros: Ano: "+ano+". Unidade: "+ s.getUnidade());

			//2 - deleta os dados do mes e ano atuais:
			recebimentosWarelineMySqlRepo.deleteRecebimentosAnoUnidade(s.getUnidade(), ano);

			//3 - localiza os dados do mes e ano atuais:
			List<Object[]> recebimentos = recebimentosPosdtGreRepo.getRecebimentosPorAno(ano, "0"+s.getCodfilial());
			log.append("Registros localizados: "+ recebimentos.size()+". ");

			//4 - converte o objeto postgres em mysql:
			List<RecebimentosWareline> rcbs = new ArrayList<RecebimentosWareline>();
			for(Object[] rec : recebimentos) {
				rcbs.add(ConversorObjetos.converteArrayObjectToRecebimentosWarelineForMySql(rec, s));
			}

			//5 - grava os dados no BD do Portal (MySql):
			recebimentosWarelineMySqlRepo.saveAll(rcbs);
			log.append(rcbs.size()+" registros inseridos. Conclusão em "+ ConversorObjetos.currentTimestamp());

			//6 - salvando o log:
			Log l = new Log();
			l.setDataHora(ConversorObjetos.currentTimestamp());
			l.setIdRegistro(0);
			l.setIdUsuario(0);
			l.setIp(ConversorObjetos.getIp());
			l.setObservacao(log.toString());
			l.setSecao("TBL_WARELINE_RECEBIMENTOS");
			l.setTipoLog("DADOS_WARELINE");
			l.setTipoRegistro(18);
			logRepo.save(l);
		}
	}

	private void atualizaPgtosMesAnoAtual() {

		StringBuffer log = null;

		//1 - recebe o mes e ano atuais:
		Integer mes = ConversorObjetos.getCurrentMonth();
		Integer ano = ConversorObjetos.getCurrentYear();
		String mescomp = ano + "/"+ (mes < 10? "0"+mes: mes);

		List<WarelineServers> servers = wlServerRepo.getServersByUnidade(Parametros.UNIDADES);

		for(WarelineServers s: servers) {
			log = new StringBuffer();
			log.append("Iniciando a atualização Base Wareline. Tabela pagtos. "+ ConversorObjetos.currentTimestamp()+". ");
			log.append("Parâmetros: Ano: "+ano+". Mês: "+ mes + ". MesComp: "+ mescomp+". Unidade: "+ s.getUnidade());

			//2 - deleta os dados do mes e ano atuais:
			pagtosMySqlRepo.deletePagamentosMesCompetencia(mescomp, s.getUnidade());

			//3 - localiza os dados do mes e ano atuais:
			List<PagtosPG> pgtos = pagtosPostGreRepo.obterPagamentosWarelinePorMesCompetencia(mescomp, "0"+s.getCodfilial());
			log.append("Registros localizados: "+ pgtos.size()+". ");

			//4 - converte o objeto postgres em mysql:
			List<PagtosWareline> cadsPt = new ArrayList<PagtosWareline>();
			for(PagtosPG c : pgtos) {
				cadsPt.add(ConversorObjetos.convertePagamentosPostPreToMySql(c, s));
			}

			//5 - grava os dados no BD do Portal (MySql):
			pagtosMySqlRepo.saveAll(cadsPt);
			log.append(pgtos.size()+" registros inseridos. Conclusão em "+ ConversorObjetos.currentTimestamp());

			//6 - salvando o log:
			Log l = new Log();
			l.setDataHora(ConversorObjetos.currentTimestamp());
			l.setIdRegistro(0);
			l.setIdUsuario(0);
			l.setIp(ConversorObjetos.getIp());
			l.setObservacao(log.toString());
			l.setSecao("TBL_WARELINE_PAGTOS");
			l.setTipoLog("DADOS_WARELINE");
			l.setTipoRegistro(18);
			logRepo.save(l);
		}
	}

	private void atualizaPgParcelMesAnoAtual() {

		StringBuffer log = null;

		//1 - recebe o mes e ano atuais:
		Integer mes = ConversorObjetos.getCurrentMonth();
		Integer ano = ConversorObjetos.getCurrentYear();
		String mescomp = ano + "/"+ (mes < 10? "0"+mes: mes);

		List<WarelineServers> servers = wlServerRepo.getServersByUnidade(Parametros.UNIDADES);

		for(WarelineServers s: servers) {
			log = new StringBuffer();
			log.append("Iniciando a atualização Base Wareline. Tabela pgparcel. "+ ConversorObjetos.currentTimestamp()+". ");
			log.append("Parâmetros: Ano: "+ano+". Mês: "+ mes + ". MesComp: "+ mescomp+". Unidade: "+s.getUnidade());

			//2 - deleta os dados do mes e ano atuais:
			pgParcelMySqlRepo.deletePagamentosUnidadeMesCompetencia(ano, mes, s.getUnidade());

			//3 - localiza os dados do mes e ano atuais:
			List<PgParcelPG> pgtos = pgParcelPostGreDao.getPagamentosMesCompetencia(mescomp, "0"+s.getCodfilial());
			log.append("Registros localizados: "+ pgtos.size()+". ");

			//4 - converte o objeto postgres em mysql:
			List<PgParcelMySql> cadsPt = new ArrayList<PgParcelMySql>();
			for(PgParcelPG c : pgtos) {
				cadsPt.add(ConversorObjetos.convertePgParcelPostGreToMySql(c, mescomp, s));
			}

			//5 - grava os dados no BD do Portal (MySql):
			pgParcelMySqlRepo.saveAll(cadsPt);
			log.append(pgtos.size()+" registros inseridos. Conclusão: "+ ConversorObjetos.currentTimestamp());

			//6 - salvando o log:
			Log l = new Log();
			l.setDataHora(ConversorObjetos.currentTimestamp());
			l.setIdRegistro(0);
			l.setIdUsuario(0);
			l.setIp(ConversorObjetos.getIp());
			l.setObservacao(log.toString());
			l.setSecao("TBL_WARELINE_PGPARCEL");
			l.setTipoLog("DADOS_WARELINE");
			l.setTipoRegistro(18);
			logRepo.save(l);
		}
	}

	private void atualizaPgDespMesAnoAtual() {

		StringBuffer log = null;

		//1 - recebe o mes e ano atuais:
		Integer mes = ConversorObjetos.getCurrentMonth();
		Integer ano = ConversorObjetos.getCurrentYear();
		String mescomp = ano + "/"+ (mes < 10? "0"+mes: mes);

		List<WarelineServers> servers = wlServerRepo.getServersByUnidade(Parametros.UNIDADES);

		for(WarelineServers s: servers) {
			log = new StringBuffer();
			log.append("Iniciando a atualização Base Wareline. Tabela pgdesp. "+ ConversorObjetos.currentTimestamp()+". ");
			log.append("Parâmetros: Ano: "+ano+". Mês: "+ mes + ". MesComp: "+ mescomp+". Unidade: "+ s.getUnidade());

			//2 - deleta os dados do mes e ano atuais:
			pgDespMyRepo.deletePagamentosUnidadeMesCompetencia(ano, mes, s.getUnidade());

			//3 - localiza os dados do mes e ano atuais:
			List<PgDespPG> pgtos = pgDespPostGresDao.getPagamentosMesCompetencia(mescomp, "0"+s.getCodfilial());
			log.append("Registros localizados: "+ pgtos.size()+". ");

			//4 - converte o objeto postgres em mysql:
			List<PgDespMySql> cadsPt = new ArrayList<PgDespMySql>();
			for(PgDespPG c : pgtos) {
				cadsPt.add(ConversorObjetos.convertePgDespPostGreToMySql(c, mescomp, s));
			}

			//5 - grava os dados no BD do Portal (MySql):
			pgDespMyRepo.saveAll(cadsPt);
			log.append(pgtos.size()+" registros inseridos. Conclusão: "+ ConversorObjetos.currentTimestamp());

			//6 - salvando o log:
			Log l = new Log();
			l.setDataHora(ConversorObjetos.currentTimestamp());
			l.setIdRegistro(0);
			l.setIdUsuario(0);
			l.setIp(ConversorObjetos.getIp());
			l.setObservacao(log.toString());
			l.setSecao("TBL_WARELINE_PGDESP");
			l.setTipoLog("DADOS_WARELINE");
			l.setTipoRegistro(18);
			logRepo.save(l);
		}
	}
}