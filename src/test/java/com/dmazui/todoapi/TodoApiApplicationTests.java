package com.dmazui.todoapi;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.dmazui.todoapi.model.Tarefa;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class TodoApiApplicationTests {

	@Autowired
	private WebTestClient webTestClient;
	
	@Test
	void testeCriacaoTarefaSucesso() {
		var tarefa = new Tarefa(7L,"titulo 7","descricao7",false,LocalDateTime.now(),null);
		
		webTestClient.post()
					.uri("/v1/tarefas")
					.bodyValue(tarefa)
					.exchange()
					.expectStatus().isOk();
				
	}

	@Test
	void testeCriacaoTarefaFalha() {
		var tarefa = new Tarefa(11L,"","descricao7",false,LocalDateTime.now(),null);
		
		webTestClient.post()
					.uri("/v1/tarefas")
					.bodyValue(tarefa)
					.exchange()
					.expectStatus().isBadRequest();
	}
	

	@Test
	public void testeAtualizacaoFalha() {
		var idInexistente = 33L;
		var tarefa = new Tarefa(idInexistente,"","descricao7",false,LocalDateTime.now(),null);
		webTestClient
				.put()
				.uri("/tarefas/" + idInexistente)
				.bodyValue(tarefa)
				.exchange()
				.expectStatus().isNotFound();
	}

	@Test
	public void testeBuscaFalha() {
		var idInexistente = 33L;
		webTestClient
				.put()
				.uri("/tarefas/" + idInexistente)
				.exchange()
				.expectStatus().isNotFound();
	}
}
