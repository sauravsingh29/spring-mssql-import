/**
 * 
 */
package com.demo.mssql.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 212473604
 *
 */
@Configuration
@ComponentScan(basePackages = { "com.demo.mssql" })
public class MSSQLConfig {
	
	@Bean(name = "dataSource")
	public BasicDataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("net.sourceforge.jtds.jdbc.Driver");
		dataSource.setUrl("jdbc:jtds:sqlserver://localhost;databaseName=Test;integrated security=false");
		dataSource.setUsername("sa");
		dataSource.setPassword("P@ssw0rd");
		return dataSource;
	}
	
}
