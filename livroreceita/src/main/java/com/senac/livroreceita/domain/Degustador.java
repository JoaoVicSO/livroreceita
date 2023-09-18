package com.senac.livroreceita.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.senac.livroreceita.domain.enums.Perfil;




public class Degustador extends Funcionario {
	private static final long serialVersionUID = 1L;
	
	private List<Receita> receitas = new ArrayList<>();

	public Degustador() {
		super();
		
	}

	public Degustador(Integer idFuncionario, String rg, String nome, double salario, Set<Perfil> perfis,
			LocalDate dt_ingresso) {
		super(idFuncionario, rg, nome, salario, perfis, dt_ingresso);
		
	}

	public List<Receita> getReceitas() {
		return receitas;
	}

	public void setReceitas(List<Receita> receitas) {
		this.receitas = receitas;
	}
	
	
}
