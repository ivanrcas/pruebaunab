package com.pruebaunab.service;

import org.springframework.stereotype.Service;

import com.pruebaunab.entity.Usuario;
import com.pruebaunab.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	private UsuarioRepository usuarioRepository;
	
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	public void registrar(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
}
