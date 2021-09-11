package com.pruebaunab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pruebaunab.dto.MarcadorRequest;
import com.pruebaunab.entity.Partido;
import com.pruebaunab.repository.PartidoRepository;

@Service
public class PartidoService {

	private PartidoRepository partidoRepository;

	public PartidoService(PartidoRepository partidoRepository) {
		this.partidoRepository = partidoRepository;
	}

	public void registrar(Partido partido) {
		partidoRepository.save(partido);
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
