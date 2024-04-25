package com.dmazui.todoapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmazui.todoapi.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long>  {

}
