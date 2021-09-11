package com.pruebaunab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Integer id;
	
	@Column(length = 100, nullable = false)
	private String nombre;
	
	@Column(length = 50, nullable = false)
	private String correo;
	
	@Column(length = 10, nullable = false)
	private String username;
	
	@Column(length = 10, nullable = false)
	private String password;
	
	@OneToOne(mappedBy = "usuario")
	private Partido partido;
}
