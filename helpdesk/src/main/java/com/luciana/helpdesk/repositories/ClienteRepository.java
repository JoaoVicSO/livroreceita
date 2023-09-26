package com.luciana.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luciana.helpdesk.domain.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Integer>{


}

