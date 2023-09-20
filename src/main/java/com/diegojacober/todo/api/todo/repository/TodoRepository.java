package com.diegojacober.todo.api.todo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegojacober.todo.api.todo.todo.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer>{
    List<Todo> findByUsername(String username);
}
