package com.dmazui.todoapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmazui.todoapi.dtos.TarefaDTO;
import com.dmazui.todoapi.mappers.DtoToTarefa;
import com.dmazui.todoapi.mappers.TarefaToDto;
import com.dmazui.todoapi.repositories.TarefaRepository;

@Service
public class TarefaService {

//	@Autowired
//	TarefaRepository repository;
	
	@Autowired
	TarefaToDto toDto;
	
	@Autowired
	DtoToTarefa toTarefa;
	
	
	public TarefaDTO save(TarefaDTO dto) {
//		return toDto.convert(repository.save(toTarefa.convert(dto)));
		return null;
	}
	
	public TarefaDTO findById(Long id) {
//		return toDto.convert(repository.findById(id).orElse(null));
		return null;
	}

	public List<TarefaDTO> findAll() {
		
		return null;
	}

	public TarefaDTO delete(Long id) {
		
		return null;
	}

	public TarefaDTO patch(Long id) {
		
		return null;
	}
}
