package com.senac.livroreceita.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.senac.livroreceita.services.DBService;

@Configuration
@Profile("dev")

public class DevConfig {

	@Autowired DBService dbService;
	
	@Value("${spring.jpa.hibernate.dd1-auto}")
	private String value;

    @Bean
    boolean instanciaDB() {
		this.dbService.instanciaDB();
		
		if(value.equals("create")) {
			this.dbService.instanciaDB();
		}
		return false;
	}
	
}
