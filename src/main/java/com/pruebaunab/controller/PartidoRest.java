package com.pruebaunab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaunab.dto.MarcadorRequest;
import com.pruebaunab.dto.PartidoDto;
import com.pruebaunab.entity.Partido;
import com.pruebaunab.service.PartidoService;

@RestController
@RequestMapping("/partido")
public class PartidoRest {

	@Autowired
	private PartidoService partidoService;

	@PostMapping("/registrar")
	public ResponseEntity<String> registrarPartido(@RequestBody PartidoDto nuevoPartido){
		if (partidoService.registrar(nuevoPartido)) {
			return new ResponseEntity<String>("Partido registrado exitosamente.", HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<String>("El partido no se pudo registrar.", HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/listar")
	public ResponseEntity<List<Partido>> listarPartidos(){
		return new ResponseEntity<>(partidoService.listar(), HttpStatus.OK);
	}
	
	@PutMapping("/actualizar/{id}")
	public ResponseEntity<String> actualizarMarcador(@RequestBody MarcadorRequest nuevoMarcador, @PathVariable Integer id){
		//Actualizar si existe partido con id recibido. De lo contrario, se responde un estado NOT_FOUND.
		if(partidoService.actualizarMarcador(nuevoMarcador, id)) {
			return new ResponseEntity<>("El partido se ha actualizado exitosamente", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("El partido no se ha actualizado", HttpStatus.NOT_FOUND);
		}
		
	}
}
