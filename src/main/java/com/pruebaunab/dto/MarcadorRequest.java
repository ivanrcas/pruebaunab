package com.pruebaunab.dto;

import java.io.Serializable;

public class MarcadorRequest implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer golesLocal;
	private Integer golesVisitante;
	
	public Integer getGolesLocal() {
		return golesLocal;
	}
	public void setGolesLocal(Integer golesLocal) {
		this.golesLocal = golesLocal;
	}
	public Integer getGolesVisitante() {
		return golesVisitante;
	}
	public void setGolesVisitante(Integer golesVisitante) {
		this.golesVisitante = golesVisitante;
	}
	
	
	
}
