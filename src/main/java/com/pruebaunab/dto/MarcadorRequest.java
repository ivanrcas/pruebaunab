package com.pruebaunab.dto;

import java.io.Serializable;

public class MarcadorRequest implements Serializable{

	private int golesLocal;
	private int golesVisitante;
	
	public MarcadorRequest(int golesLocal, int golesVisitante) {
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}
	
	
}
