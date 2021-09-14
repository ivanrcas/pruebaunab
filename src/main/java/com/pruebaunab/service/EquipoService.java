package com.pruebaunab.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.pruebaunab.dto.EquipoDto;
import com.pruebaunab.entity.Equipo;
import com.pruebaunab.repository.EquipoRepository;

@Service
public class EquipoService {

	private final Log LOG = LogFactory.getLog(EquipoService.class);
	private EquipoRepository equipoRepository;
	
	
	public EquipoService(EquipoRepository equipoRepository) {
		this.equipoRepository = equipoRepository;
	}
	
	public boolean registrar(EquipoDto equipoDto) {
		Equipo equipoEntity = new Equipo();
		equipoEntity.setNombre(equipoDto.getNombre());
		try {
			equipoRepository.save(equipoEntity);
			return true;
		}catch(Exception e) {
			LOG.error(e.getMessage());
			return false;
		}
	}
}
