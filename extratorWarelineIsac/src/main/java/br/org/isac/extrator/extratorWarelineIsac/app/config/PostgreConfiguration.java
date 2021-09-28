package br.org.isac.extrator.extratorWarelineIsac.app.config;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		entityManagerFactoryRef = "postgreEntityManagerFactory", 
		transactionManagerRef = "postgreTransactionManager", 
		basePackages = { "br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository" }
)
public class PostgreConfiguration {
	
	@Primary
	@Bean(name = "postgreDataSource")
    @ConfigurationProperties(prefix = "postgre.datasource")
    public HikariDataSource dataSource() {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

	@Primary
    @Bean(name = "postgreEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder, @Qualifier("postgreDataSource") DataSource dataSource) {
        //Map<String, String> properties = new HashMap<>();
        //properties.put("hibernate.hbm2ddl.auto", "update");
        return builder.dataSource(dataSource).packages("br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity").persistenceUnit("postGrePU").build();
    }

	@Primary
    @Bean(name = "postgreTransactionManager")
    public PlatformTransactionManager transactionManager(@Qualifier("postgreEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}