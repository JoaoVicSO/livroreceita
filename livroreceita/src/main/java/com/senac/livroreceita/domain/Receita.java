package com.senac.livroreceita.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.senac.livroreceita.domain.enums.StatusReceita;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Receita implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdReceita;
	
	private Integer IdCozinheiro;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate data_cricao = LocalDate.now();
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate data_degustacao;
	
	private StatusReceita status;
	private String nome, modo_preparo;
	private double nota_degustacao;
	private int ind_indita;
	private int degustador, qtd_porcao;
	
	private Editor fun_editor;
	private ADM fun_adm;
	private Degustador fun_degustador;
	
	@ManyToOne
	@JoinColumn(name = "cozinheiro_id")
	private Cozinheiro fun_cozinheiro;
	
	public Receita() {
		super();
		
	}

	public Receita(Integer idReceita, Integer idCozinheiro, LocalDate data_degustacao, StatusReceita status,
			String nome, String modo_preparo, double nota_degustacao, int degustador, int qtd_porcao, Editor fun_editor,
			ADM fun_adm, Degustador fun_degustador, Cozinheiro fun_cozinheiro) {
		super();
		IdReceita = idReceita;
		IdCozinheiro = idCozinheiro;
		this.data_degustacao = data_degustacao;
		this.status = status;
		this.nome = nome;
		this.modo_preparo = modo_preparo;
		this.nota_degustacao = nota_degustacao;
		this.degustador = degustador;
		this.qtd_porcao = qtd_porcao;
		this.fun_editor = fun_editor;
		this.fun_adm = fun_adm;
		this.fun_degustador = fun_degustador;
		this.fun_cozinheiro = fun_cozinheiro;
		
	}

	public Integer getIdReceita() {
		return IdReceita;
	}

	public void setIdReceita(Integer idReceita) {
		IdReceita = idReceita;
	}

	public Integer getIdCozinheiro() {
		return IdCozinheiro;
	}

	public void setIdCozinheiro(Integer idCozinheiro) {
		IdCozinheiro = idCozinheiro;
	}

	public LocalDate getData_cricao() {
		return data_cricao;
	}

	public void setData_cricao(LocalDate data_cricao) {
		this.data_cricao = data_cricao;
	}

	public LocalDate getData_degustacao() {
		return data_degustacao;
	}

	public void setData_degustacao(LocalDate data_degustacao) {
		this.data_degustacao = data_degustacao;
	}

	public StatusReceita getStatus() {
		return status;
	}

	public void setStatus(StatusReceita status) {
		this.status = status;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModo_preparo() {
		return modo_preparo;
	}

	public void setModo_preparo(String modo_preparo) {
		this.modo_preparo = modo_preparo;
	}

	public double getNota_degustacao() {
		return nota_degustacao;
	}

	public void setNota_degustacao(double nota_degustacao) {
		this.nota_degustacao = nota_degustacao;
	}

	public int getInd_indita() {
		return ind_indita;
	}

	public void setInd_indita(int ind_indita) {
		this.ind_indita = ind_indita;
	}

	public int getDegustador() {
		return degustador;
	}

	public void setDegustador(int degustador) {
		this.degustador = degustador;
	}

	public int getQtd_porcao() {
		return qtd_porcao;
	}

	public void setQtd_porcao(int qtd_porcao) {
		this.qtd_porcao = qtd_porcao;
	}

	public Editor getFun_editor() {
		return fun_editor;
	}

	public void setFun_editor(Editor fun_editor) {
		this.fun_editor = fun_editor;
	}

	public ADM getFun_adm() {
		return fun_adm;
	}

	public void setFun_adm(ADM fun_adm) {
		this.fun_adm = fun_adm;
	}

	public Degustador getFun_degustador() {
		return fun_degustador;
	}

	public void setFun_degustador(Degustador fun_degustador) {
		this.fun_degustador = fun_degustador;
	}

	public Cozinheiro getFun_cozinheiro() {
		return fun_cozinheiro;
	}

	public void setFun_cozinheiro(Cozinheiro fun_cozinheiro) {
		this.fun_cozinheiro = fun_cozinheiro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(IdCozinheiro, IdReceita, data_degustacao, degustador, fun_adm, fun_cozinheiro,
				fun_degustador, fun_editor, modo_preparo, nome, nota_degustacao, qtd_porcao, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Receita other = (Receita) obj;
		return Objects.equals(IdCozinheiro, other.IdCozinheiro) && Objects.equals(IdReceita, other.IdReceita)
				&& Objects.equals(data_degustacao, other.data_degustacao) && degustador == other.degustador
				&& Objects.equals(fun_adm, other.fun_adm) && Objects.equals(fun_cozinheiro, other.fun_cozinheiro)
				&& Objects.equals(fun_degustador, other.fun_degustador) && Objects.equals(fun_editor, other.fun_editor)
				&& Objects.equals(modo_preparo, other.modo_preparo) && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(nota_degustacao) == Double.doubleToLongBits(other.nota_degustacao)
				&& qtd_porcao == other.qtd_porcao && status == other.status;
		
	}
	
	
	
	}
