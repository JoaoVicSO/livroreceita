package com.senac.livroreceita.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.senac.livroreceita.domain.enums.Perfil;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Cozinheiro extends Funcionario {
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	@OneToMany(mappedBy = "fun_cozinheiro")
	private List<Receita> receitas = new ArrayList<>();

	public Cozinheiro() {
		super();
		
		addPerfis(Perfil.COZINHEIRO);
	}

	public Cozinheiro(Integer idFuncionario, String rg, String nome, double salario, Set<Perfil> perfis,
			LocalDate dt_ingresso) {
		super(idFuncionario, rg, nome, salario, perfis, dt_ingresso);
		
		addPerfis(Perfil.COZINHEIRO);
	}

	public List<Receita> getReceitas() {
		return receitas;
	}

	public void setReceitas(List<Receita> receitas) {
		this.receitas = receitas;
	}
	
	
	
}
