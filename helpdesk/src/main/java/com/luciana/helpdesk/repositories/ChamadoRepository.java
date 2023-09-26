package com.luciana.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luciana.helpdesk.domain.Chamado;

public interface ChamadoRepository  extends JpaRepository<Chamado, Integer>{
	

}
