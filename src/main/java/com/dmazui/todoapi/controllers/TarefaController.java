package com.dmazui.todoapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmazui.todoapi.services.TarefaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/v1/tarefas")
public class TarefaController {

	@Autowired
	TarefaService sevice;
	
	@GetMapping("path")
	public String getMethodName() {
		return "estamos aqui";
	}
	
}
