package com.iot.spring.iotwebapp.configuration;

import javax.sql.DataSource;

import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("cloud")
public class CloudDataSourceConfig extends AbstractCloudConfig {

	@Bean
	public DataSource getDataSource(){
		return connectionFactory().dataSource("iot-air-quaility-db");
	}
}
