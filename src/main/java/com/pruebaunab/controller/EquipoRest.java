package com.pruebaunab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaunab.dto.EquipoDto;
import com.pruebaunab.service.EquipoService;

@RestController
@RequestMapping("/equipo")
public class EquipoRest {

	@Autowired
	private EquipoService equipoService;
	
	@PostMapping("/registrar")
	public ResponseEntity<String> registrar(@RequestBody EquipoDto nuevoEquipo){
		if(equipoService.registrar(nuevoEquipo)==true) {
			return new ResponseEntity<>("El equipo se ha creado exitosamente", HttpStatus.CREATED);
		}else {
			return new ResponseEntity<>("No se pudo crear el usuarioNo se pudo crear el equipo", HttpStatus.NO_CONTENT);
		}
	}
}
