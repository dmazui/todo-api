package com.dmazui.todoapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmazui.todoapi.dtos.TarefaDTO;
import com.dmazui.todoapi.services.TarefaService;


@RestController
@RequestMapping("/v1/tarefas")
public class TarefaController {

	@Autowired
	TarefaService service;
	
	@GetMapping("path")
	public String getMethodName() {
		return "estamos aqui";
	}

	@PostMapping
	public ResponseEntity<TarefaDTO> save(@RequestBody TarefaDTO dto) throws Exception {
		try {
			return ResponseEntity.ok(service.save(dto));
		} catch (Exception e) { }
		return ResponseEntity.badRequest().build();
	}

	@PatchMapping("{id}")
	public ResponseEntity<TarefaDTO> update(@PathVariable("id") Long id) throws Exception {
		return (service.findById(id) != null) ? ResponseEntity.ok(service.patch(id)) : ResponseEntity.notFound().build();
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> delete(@PathVariable("id") Long id) throws Exception {
		return (service.findById(id) != null) ? ResponseEntity.ok(service.delete(id).toString()) : ResponseEntity.notFound().build();
	}

	@GetMapping("{id}")
	public ResponseEntity<TarefaDTO> find(@PathVariable("id") Long id) throws Exception {
		return (service.findById(id) != null) ? ResponseEntity.ok(service.findById(id))
				: ResponseEntity.notFound().build();
	}

	@GetMapping
	public ResponseEntity<List<TarefaDTO>> findAll() throws Exception {
		return ResponseEntity.ok(service.findAll());
	}
	
}
