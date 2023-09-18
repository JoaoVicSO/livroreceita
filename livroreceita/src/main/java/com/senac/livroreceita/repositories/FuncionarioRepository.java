package com.senac.livroreceita.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senac.livroreceita.domain.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

}
