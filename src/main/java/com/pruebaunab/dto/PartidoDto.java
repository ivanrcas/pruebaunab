package com.pruebaunab.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class PartidoDto implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer usuario;
	private Integer local;
	private Integer visitante;
	private LocalDate fecha;
	private Integer golesLocal;
	private Integer golesVisitante;

	
	public Integer getUsuario() {
		return usuario;
	}
	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}
	public Integer getLocal() {
		return local;
	}
	public void setLocal(Integer local) {
		this.local = local;
	}
	public Integer getVisitante() {
		return visitante;
	}
	public void setVisitante(Integer visitante) {
		this.visitante = visitante;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
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
