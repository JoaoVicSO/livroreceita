package com.senac.livroreceita.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.livroreceita.domain.Cozinheiro;
import com.senac.livroreceita.domain.Funcionario;
import com.senac.livroreceita.services.FuncionarioService;

@RestController
@RequestMapping(value = "/tecnicos")

public class FuncionarioResource {

	//localhost:8080/funcionario
	
	@Autowired
	private FuncionarioService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Funcionario> findById(@PathVariable Integer id){
		Funcionario obj = service.findById(id);
				return ResponseEntity.ok().body(obj);
		
	}
	
}
