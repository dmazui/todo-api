package com.dmazui.todoapi.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "tarefas")
public class Tarefa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "id", nullable = false)
	@SequenceGenerator(name = "tarefas_sequence", sequenceName = "tarefas_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tarefas_sequence")
	private Long id;
	
	@Column
	private String titulo;

	@Column
	private String descricao;
	
	@Column
	private boolean concluido;

	@Column
	private LocalDateTime dataDeCriacao;
	
	@Column
	private LocalDateTime dataDeConclusao;
		
}
