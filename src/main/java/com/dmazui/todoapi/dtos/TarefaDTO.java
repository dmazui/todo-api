package com.dmazui.todoapi.dtos;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TarefaDTO {

	private Long id;
	private String titulo;
	private String descricao;
	private boolean concluido;
	private LocalDateTime dataDeCriacao;
	
	@JsonIgnore
	private LocalDateTime dataDeConclusao;
	
	
	
}
