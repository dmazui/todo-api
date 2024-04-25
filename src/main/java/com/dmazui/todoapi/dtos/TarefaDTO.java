package com.dmazui.todoapi.dtos;

import java.time.LocalDateTime;

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
	private LocalDateTime dataDeCriacao;
	private LocalDateTime dataDeConclusao;
	private boolean concluido;
	
	
}
