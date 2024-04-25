package com.dmazui.todoapi.mappers;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.dmazui.todoapi.dtos.TarefaDTO;
import com.dmazui.todoapi.model.Tarefa;

@Component
public class DtoToTarefa implements Converter<TarefaDTO, Tarefa> {

	@Override
	public Tarefa convert(TarefaDTO source) {
		Tarefa tarefa = new Tarefa();

		tarefa.setId(source.getId());
		tarefa.setTitulo(source.getTitulo());
		tarefa.setDescricao(source.getDescricao());
//		tarefa.setDataDeCriacao(source.getDataDeCriacao());
//		tarefa.setDataDeConclusao(source.getDataDeConclusao());
//		tarefa.setConcluido(source.isConcluido());
		
		return tarefa;
	}

}
