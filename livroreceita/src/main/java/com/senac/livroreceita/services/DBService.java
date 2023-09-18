package com.senac.livroreceita.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.livroreceita.domain.Cozinheiro;
import com.senac.livroreceita.domain.enums.Perfil;
import com.senac.livroreceita.repositories.CozinheiroRepository;
import com.senac.livroreceita.repositories.FuncionarioRepository;

@Service
public class DBService {
	
	@Autowired
	private FuncionarioRepository funizonarioRepository;
	
	@Autowired
	private CozinheiroRepository cozinheiroRepository;

	
	public void instanciaDB() {
		
//		 RG        NOME     SALARIO           
Cozinheiro coz = new Cozinheiro( null,  "123",  "16092023",    2,     null,    null); 
coz.addPerfis(Perfil.ADM);

cozinheiroRepository.saveAll(Arrays.asList(coz));
	}
}
