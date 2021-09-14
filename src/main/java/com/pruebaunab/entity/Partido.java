package com.pruebaunab.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "partidos")
public class Partido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(columnDefinition = "serial")
	private Integer id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario", referencedColumnName = "id")
    private Usuario usuario;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "local", referencedColumnName = "id")
    private Equipo local;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "visitante", referencedColumnName = "id")
    private Equipo visitante;
	
	private LocalDate fecha;
	
	@Column(name = "goles_local")
	private Integer golesLocal;
	
	@Column(name = "goles_visitante")
	private Integer golesVisitante;




	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Equipo getLocal() {
		return local;
	}

	public void setLocal(Equipo local) {
		this.local = local;
	}

	public Equipo getVisitante() {
		return visitante;
	}

	public void setVisitante(Equipo visitante) {
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
