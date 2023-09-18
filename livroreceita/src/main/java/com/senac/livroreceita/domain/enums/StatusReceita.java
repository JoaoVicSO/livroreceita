package com.senac.livroreceita.domain.enums;

public enum StatusReceita {

	AVALIADO(0, "AVALIADO"), NAO_AVALIADO(1, "NÃO AVALIADO");
	
	private Integer IdCargo;
	private String descricao;
	
	private StatusReceita (Integer idCargo, String descricao) {
		IdCargo = idCargo;
		this.descricao = descricao;
	}

	public Integer getIdCargo() {
		return IdCargo;
		
	}

	public String getDescricao() {
		return descricao;
		
	}
	
	public static StatusReceita toEnum(Integer ID) {
		if (ID == null) {
			return null;
		}
		
		for (StatusReceita x : StatusReceita.values()) {
			if (ID.equals(x.getIdCargo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException(" Avaliação Invalida");
	}
	
}
