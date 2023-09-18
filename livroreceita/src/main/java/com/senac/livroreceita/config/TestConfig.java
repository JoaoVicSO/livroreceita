package com.senac.livroreceita.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.senac.livroreceita.services.DBService;

@Configuration
@Profile("test")

public class TestConfig {

	@Autowired DBService dbService;
	
	public void instanciaDB() {
		this.dbService.instanciaDB();
	}
	
}
