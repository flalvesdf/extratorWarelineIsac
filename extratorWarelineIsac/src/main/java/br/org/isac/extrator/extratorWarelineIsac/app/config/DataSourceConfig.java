package br.org.isac.extrator.extratorWarelineIsac.app.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
	
	@Bean
    public DataSource getDataSource() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilder.url("jdbc:postgresql://"+WarelineServers.HMA.getUrl()+":"+WarelineServers.HMA.getPort()+"/"+WarelineServers.HMA.getDb()+"");
        dataSourceBuilder.username(WarelineServers.HMA.getUser());
        dataSourceBuilder.password(WarelineServers.HMA.getPsw());
        return dataSourceBuilder.build();
    }

}
