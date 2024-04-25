package com.dmazui.todoapi.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.dmazui.todoapi.dtos.TarefaDTO;
import com.dmazui.todoapi.mappers.DtoToTarefa;
import com.dmazui.todoapi.mappers.TarefaToDto;
import com.dmazui.todoapi.model.Tarefa;
import com.dmazui.todoapi.repositories.TarefaRepository;

@Service
public class TarefaService {

	TarefaRepository repository;
	TarefaToDto toDto;
	DtoToTarefa toTarefa;
	
	
	public TarefaService(TarefaRepository repository, TarefaToDto toDto, DtoToTarefa toTarefa) {
		this.repository = repository;
		this.toDto = toDto;
		this.toTarefa = toTarefa;
	}

	public TarefaDTO save(TarefaDTO source) {
		source.setDataDeCriacao(LocalDateTime.now());
		validaConclusao(source);
		return toDto.convert(repository.save(toTarefa.convert(source)));
	}
	
	public Tarefa findById(Long id) {
		return repository.findById(id).orElse(null);
	}

	public List<Tarefa> findAll() {
	    Sort sort = Sort.by(Direction.DESC, "dataDeCriacao");
	    return repository.findAll(sort);
	}

	public TarefaDTO update(Long id, TarefaDTO source) {
		validaConclusao(source);
    	source.setId(id);
		return toDto.convert(repository.save(toTarefa.convert(source)));    
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

	
	private void validaConclusao(TarefaDTO source) {
		if (source.isConcluido()) {
			source.setDataDeConclusao(LocalDateTime.now());
		}
	}
}
