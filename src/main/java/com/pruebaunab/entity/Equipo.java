package com.pruebaunab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "equipos")
public class Equipo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private int id;
	
	@Column(length = 20)
	private String nombre;
	
	@OneToOne(mappedBy = "local")
	private Partido partidoLocal;
	
	@OneToOne(mappedBy = "visitante")
	private Partido partidoVisitante;
	
}
