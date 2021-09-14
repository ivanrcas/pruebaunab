package com.pruebaunab.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.pruebaunab.dto.UsuarioDto;
import com.pruebaunab.entity.Usuario;
import com.pruebaunab.repository.UsuarioRepository;

@Service
public class UsuarioService {
	private final Log LOG = LogFactory.getLog(UsuarioService.class);
	private UsuarioRepository usuarioRepository;

	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	public boolean registrar(UsuarioDto usuarioDto) {
		Usuario usuarioEntity = new Usuario();
		// Mapeo de DTO -> Entity
		usuarioEntity.setNombre(usuarioDto.getNombre());
		usuarioEntity.setCorreo(usuarioDto.getCorreo());
		usuarioEntity.setUsername(usuarioDto.getUsername());
		usuarioEntity.setPassword(usuarioDto.getPassword());
		// Ejecutar CRUD desde repository.
		// Retornar true si la entidad se registra correctamente.
		try {
			usuarioRepository.save(usuarioEntity);
			return true;
		} catch (Exception e) {
			LOG.error(e.getMessage());
			return false;
		}

	}

}
