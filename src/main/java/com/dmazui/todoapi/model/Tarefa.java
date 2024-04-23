package com.dmazui.todoapi.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tarefas", indexes = {@Index(name = "tarefa_index", columnList = "id", unique = true)})
public class Tarefa {

	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(length = 60)
	private String titulo;

	@Lob
	private String descricao;
	
	@Column
	private LocalDateTime dataDeCriacao;
	
	@Column
	private LocalDateTime dataDeComclusao;
	
	@Column
	private boolean concluido;

}
