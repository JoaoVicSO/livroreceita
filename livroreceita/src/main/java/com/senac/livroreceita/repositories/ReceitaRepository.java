package com.senac.livroreceita.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senac.livroreceita.domain.Receita;


public interface ReceitaRepository extends JpaRepository<Receita, Integer> {

}
