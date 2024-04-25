package com.dmazui.todoapi.mappers;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.dmazui.todoapi.dtos.TarefaDTO;
import com.dmazui.todoapi.model.Tarefa;

@Component
public class TarefaToDto implements Converter<Tarefa, TarefaDTO>{

	@Override
	public TarefaDTO convert(Tarefa source) {

		TarefaDTO dto = new TarefaDTO();
		
		dto.setId(source.getId());
		dto.setTitulo(source.getTitulo());
		dto.setDescricao(source.getDescricao());
		dto.setDataDeCriacao(source.getDataDeCriacao());
		dto.setDataDeConclusao(source.getDataDeConclusao());
		dto.setConcluido(source.isConcluido());
		
		return dto;
	}

}
