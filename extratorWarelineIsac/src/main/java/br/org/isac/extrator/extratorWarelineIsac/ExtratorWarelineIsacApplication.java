package br.org.isac.extrator.extratorWarelineIsac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import br.org.isac.extrator.extratorWarelineIsac.app.conversores.ConversorObjetos;
import br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository.WarelineServersRepository;

@SpringBootApplication
@EnableScheduling
public class ExtratorWarelineIsacApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExtratorWarelineIsacApplication.class, args);
	}
	
	@Autowired
	private WarelineServersRepository cronRepo;

	@Bean
	public String getCronValue()
	{
	    return cronRepo.getServerScheduled(ConversorObjetos.getIp());
	}
}