package br.org.isac.extrator.extratorWarelineIsac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import br.org.isac.extrator.extratorWarelineIsac.app.conversores.Parametros;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.WarelineServersRepository;

/***
 * @author fabioalves
 * esta classe precisa extender a classe SpringBootServletInitializer para
 * permitir que o Spring Boot rode em um tomcat externo
 * 
 * o metodo getCronValue() é o responsável por buscar no banco de dados do Portal
 * de Transparencia, a partir do endereco IP do servidor, qual a hora de execucao
 * das rotinas automatizadas
 * 
 */

@SpringBootApplication
@EnableScheduling
public class ExtratorWarelineIsacApplication extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(ExtratorWarelineIsacApplication.class, args);
	}
	
	@Autowired
	private WarelineServersRepository cronRepo;

	@Bean
	public String getCronValue()
	{
	    return cronRepo.getServerScheduledByUnidade(Parametros.UNDIDADE_SCHEDULE);
	}
}