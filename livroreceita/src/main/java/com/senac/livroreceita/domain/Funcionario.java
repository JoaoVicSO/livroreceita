package com.senac.livroreceita.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.senac.livroreceita.domain.enums.Perfil;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public abstract class Funcionario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer IdFuncionario;
	
	@Column(unique = true)
	protected String rg ;
	
	@Column(unique = true)
	protected String nome_usuario;
	
	protected String nome, senha;
	protected double Salario;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable (name = "PERFIS")
	protected Set<Integer> perfis = new HashSet<>();
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	protected LocalDate dt_ingresso;
	
	public Funcionario() {
		super();
		addPerfis(Perfil.COZINHEIRO);

	}


	public Funcionario(Integer idFuncionario, String rg, String nome, double salario, Set<Perfil> perfis,
		   LocalDate dt_ingresso) {
		super();
		IdFuncionario = idFuncionario;
		this.rg = rg;
		this.nome = nome;
		this.Salario = salario;
		this.dt_ingresso = dt_ingresso;
		addPerfis(Perfil.COZINHEIRO);

	}


	public Integer getIdFuncionario() {
		return IdFuncionario;
	}


	public void setIdFuncionario(Integer idFuncionario) {
		IdFuncionario = idFuncionario;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getNome_usuario() {
		return nome_usuario;
	}


	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}


	public double getSalario() {
		return Salario;
	}


	public void setSalario(double salario) {
		Salario = salario;
	}


	public Set<Perfil> getPerfis() {
		return perfis.stream().map(x -> Perfil.toEnum(x)).collect(Collectors.toSet());
	}


	public void addPerfis(Perfil perfil) {
		this.perfis.add(perfil.getIdCargo());
	}


	public LocalDate getDt_ingresso() {
		return dt_ingresso;
	}


	public void setDt_ingresso(LocalDate dt_ingresso) {
		this.dt_ingresso = dt_ingresso;
	}


	@Override
	public int hashCode() {
		return Objects.hash(IdFuncionario, rg);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(IdFuncionario, other.IdFuncionario) && Objects.equals(rg, other.rg);
	}
	
	
	
}
