package com.senac.livroreceita.domain.enums;

public enum Perfil {

	ADM(0, "ROLE_ADM"), COZINHEIRO(1, "ROLE_COZINHEIRO"), DEGUSTADOR(2 , "ROLE_DEGUSTADOR"), EDITOR(3, "ROLE_EDITOR");
	
	private Integer IdCargo;
	private String descricao;
	
	private Perfil (Integer idCargo, String descricao) {
		IdCargo = idCargo;
		this.descricao = descricao;
	}

	public Integer getIdCargo() {
		return IdCargo;
		
	}

	public String getDescricao() {
		return descricao;
		
	}
	
	public static Perfil toEnum(Integer ID) {
		if (ID == null) {
			return null;
		}
		
		for (Perfil x : Perfil.values()) {
			if (ID.equals(x.getIdCargo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException(" Perfil Invalido");
	}
	
}
