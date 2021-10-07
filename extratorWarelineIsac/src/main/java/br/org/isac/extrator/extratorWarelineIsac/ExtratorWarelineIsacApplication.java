package br.org.isac.extrator.extratorWarelineIsac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ExtratorWarelineIsacApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExtratorWarelineIsacApplication.class, args);
	}
}