package com.pruebaunab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaunab.entity.Usuario;
import com.pruebaunab.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioRest {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/registrar")
	public ResponseEntity<String> registrarUsuario(@RequestBody Usuario nuevoUsuario){
		usuarioService.registrar(nuevoUsuario);
		return new ResponseEntity<>("El usuario se ha creado exitosamente.", HttpStatus.CREATED);
	}

}
