package br.org.isac.extrator.extratorWarelineIsac.app.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		entityManagerFactoryRef = "mySqlEntityManagerFactory", 
		transactionManagerRef = "mySqlTransactionManager", 
		basePackages = { "br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository" }
)
public class MySqlConfiguration {
	
	@Bean(name = "mySqlDataSource")
    @ConfigurationProperties(prefix = "mysql.datasource")
    public HikariDataSource dataSource() {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

    @Bean(name = "mySqlEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder, @Qualifier("mySqlDataSource") DataSource dataSource) {
       // Map<String, String> properties = new HashMap<>();
        //properties.put("hibernate.hbm2ddl.auto", "update");
        return builder.dataSource(dataSource).packages("br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity").persistenceUnit("mySqlPU").build();
    }

    @Bean(name = "mySqlTransactionManager")
    public PlatformTransactionManager transactionManager(@Qualifier("mySqlEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}