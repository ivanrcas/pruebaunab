package com.pruebaunab.dto;

import java.io.Serializable;

public class EquipoDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
