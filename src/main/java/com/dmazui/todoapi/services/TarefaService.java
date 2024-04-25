package com.dmazui.todoapi.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

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
		source.setDataDeCriacao(LocalDateTime.now());
		validaConclusao(source);
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
		validaConclusao(source);
    	source.setId(id);
    	return repository.save(source);
    
	  }

	public void delete(Long id) {
		repository.deleteById(id);
	}

	
	private void validaConclusao(Tarefa source) {
		if (source.isConcluido()) {
			source.setDataDeConclusao(LocalDateTime.now());
		}
	}
}
