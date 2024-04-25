package com.dmazui.todoapi.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;



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

//	@Column
//	private LocalDateTime dataDeCriacao;
//	
//	@Column
//	private LocalDateTime dataDeConclusao;
//	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

//	public LocalDateTime getDataDeCriacao() {
//		return dataDeCriacao;
//	}
//
//	public void setDataDeCriacao(LocalDateTime dataDeCriacao) {
//		this.dataDeCriacao = dataDeCriacao;
//	}
//
//	public LocalDateTime getDataDeConclusao() {
//		return dataDeConclusao;
//	}
//
//	public void setDataDeConclusao(LocalDateTime dataDeConclusao) {
//		this.dataDeConclusao = dataDeConclusao;
//	}
//
	public boolean isConcluido() {
		return concluido;
	}

	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
