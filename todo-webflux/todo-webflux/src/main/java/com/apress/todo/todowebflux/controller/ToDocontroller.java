package com.apress.todo.todowebflux.controller;

import com.apress.todo.todowebflux.domain.ToDo;
import com.apress.todo.todowebflux.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ToDocontroller {

@Autowired
    private ToDoRepository repo;

    @GetMapping("/todo/{id}")
    public Mono<ToDo> getToDo(@PathVariable("id") String id){
        return repo.findById(id);
    }

    @GetMapping("todo")
    public Flux<ToDo> getToDo(){
        return repo.findAll();
    }
}
