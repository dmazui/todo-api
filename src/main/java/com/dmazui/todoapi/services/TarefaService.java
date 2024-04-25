package com.dmazui.todoapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	public Tarefa save(Tarefa source) {
//		return toDto.convert(repository.save(toTarefa.convert(dto)));
		return repository.save(source);
	}
	
	public Tarefa findById(Long id) {
		return repository.findById(id).orElse(null);
	}

	public List<Tarefa> findAll() {
//	    Sort sort = Sort.by(Direction.DESC, "dataDeCriacao");
//	    return repository.findAll(sort);
	    return repository.findAll();
	    
	}
	public Tarefa update(Long id, Tarefa source) {
    	source.setId(id);
    	return repository.save(source);
    
	  }
	public void delete(Long id) {
		repository.deleteById(id);
	}

	
}
