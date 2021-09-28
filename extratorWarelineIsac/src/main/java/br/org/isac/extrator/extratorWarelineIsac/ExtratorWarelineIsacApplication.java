package br.org.isac.extrator.extratorWarelineIsac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication

//@ComponentScan(basePackages = {"br.org.isac.extrator.extratorWarelineIsac"})
//@SpringBootApplication(scanBasePackages= {"br.org.isac.extrator.extratorWarelineIsac.mysql.repository","br.org.isac.extrator.extratorWarelineIsac.postgre.repository"})
public class ExtratorWarelineIsacApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ExtratorWarelineIsacApplication.class, args);
	}

}
