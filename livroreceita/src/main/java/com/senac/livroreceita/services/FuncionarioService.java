package com.senac.livroreceita.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.livroreceita.domain.Cozinheiro;
import com.senac.livroreceita.domain.Funcionario;
import com.senac.livroreceita.repositories.CozinheiroRepository;
import com.senac.livroreceita.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository repository;
	
	public Funcionario findById(Integer id) {
		Optional<Funcionario> obj = repository.findById(id);
		return obj.orElse(null);
	}
}
