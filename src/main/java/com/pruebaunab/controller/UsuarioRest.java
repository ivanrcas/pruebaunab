package com.pruebaunab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaunab.dto.UsuarioDto;
import com.pruebaunab.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioRest {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/registrar")
	public ResponseEntity<String> registrarUsuario(@RequestBody UsuarioDto nuevoUsuario){
		if(usuarioService.registrar(nuevoUsuario)) {
			return new ResponseEntity<>("Usuario creado exitosamente", HttpStatus.CREATED);
		}else {
			return new ResponseEntity<>("No se pudo crear el usuario", HttpStatus.NO_CONTENT);
		}
	}

}
