package com.pruebaunab.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pruebaunab.dto.MarcadorRequest;
import com.pruebaunab.dto.PartidoDto;
import com.pruebaunab.entity.Partido;
import com.pruebaunab.repository.EquipoRepository;
import com.pruebaunab.repository.PartidoRepository;
import com.pruebaunab.repository.UsuarioRepository;

@Service
public class PartidoService {

	private PartidoRepository partidoRepository;
	private EquipoRepository equipoRepository;
	private UsuarioRepository usuarioRepository;

	// Inyección de dependencias
	public PartidoService(PartidoRepository partidoRepository, EquipoRepository equipoRepository,
			UsuarioRepository usuarioRepository) {
		this.partidoRepository = partidoRepository;
		this.equipoRepository = equipoRepository;
		this.usuarioRepository = usuarioRepository;
	}

	public boolean registrar(PartidoDto partidoDto) {

		if (partidoDto.getVisitante() != null & partidoDto.getLocal() != null & partidoDto.getUsuario() != null) {
			Partido partidoEntity = new Partido();
			partidoEntity.setVisitante(equipoRepository.getById(partidoDto.getVisitante()));
			partidoEntity.setLocal(equipoRepository.getById(partidoDto.getLocal()));
			partidoEntity.setUsuario(usuarioRepository.getById(partidoDto.getUsuario()));
			partidoEntity.setFecha(partidoDto.getFecha());
			partidoEntity.setGolesVisitante(partidoDto.getGolesVisitante());
			partidoEntity.setGolesLocal(partidoDto.getLocal());
			partidoRepository.save(partidoEntity);
			return true;
		}
		else {
			return false;
		}
	}

	public List<Partido> listar() {
		return partidoRepository.findAll();
	}

	public boolean actualizarMarcador(MarcadorRequest nuevoMarcador, Integer id) {
		return partidoRepository.findById(id).map(partido -> {
			partido.setGolesLocal(nuevoMarcador.getGolesLocal());
			partido.setGolesVisitante(nuevoMarcador.getGolesVisitante());
			partidoRepository.save(partido);
			return true;
		}).orElse(false);
	}
}
