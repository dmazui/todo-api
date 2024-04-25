package com.dmazui.todoapi.dtos;

import java.time.LocalDateTime;

public class TarefaDTO {

	private Long id;
	private String titulo;
	private String descricao;
//	private LocalDateTime dataDeCriacao;
//	private LocalDateTime dataDeConclusao;
//	private boolean concluido;
	
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
//	public void setDataDeCriacao(LocalDateTime dataDeCriacao) {
//		this.dataDeCriacao = dataDeCriacao;
//	}
//	public LocalDateTime getDataDeConclusao() {
//		return dataDeConclusao;
//	}
//	public void setDataDeConclusao(LocalDateTime dataDeConclusao) {
//		this.dataDeConclusao = dataDeConclusao;
//	}
//	public boolean isConcluido() {
//		return concluido;
//	}
//	public void setConcluido(boolean concluido) {
//		this.concluido = concluido;
//	}

	
}
