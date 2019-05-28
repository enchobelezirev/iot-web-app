package iot.air.quality.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.orm.jpa.AbstractEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.AbstractJpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;

@Configuration
@Profile("cloud")
public class EclipseLinkJpaConfiguration {

	@Bean
	public AbstractJpaVendorAdapter getJpaVendorAdapter() {
		EclipseLinkJpaVendorAdapter eclipseLinkJpaVendor = new EclipseLinkJpaVendorAdapter();
		eclipseLinkJpaVendor.setDatabase(Database.POSTGRESQL);
		eclipseLinkJpaVendor.setShowSql(false);
		return eclipseLinkJpaVendor;
	}
	
	@Autowired
	@Bean
	public AbstractEntityManagerFactoryBean baseEntityManagerFactory(DataSource dataSource, AbstractJpaVendorAdapter jpaVendor){
		LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactory.setDataSource(dataSource);
		entityManagerFactory.setJpaVendorAdapter(jpaVendor);
		entityManagerFactory.setPersistenceUnitName("Default");
		return entityManagerFactory;
	}
	
	
}
