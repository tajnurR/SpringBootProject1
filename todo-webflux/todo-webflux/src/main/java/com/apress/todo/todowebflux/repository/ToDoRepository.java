package com.apress.todo.todowebflux.repository;

import com.apress.todo.todowebflux.domain.ToDo;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;

@Repository
public class ToDoRepository {
    private Flux<ToDo> toDoFlux = Flux.fromIterable(Arrays.asList(
            new ToDo(),
            new ToDo("Do Homework"),
            new ToDo("Workout in the moring", true),
            new ToDo ("Make dinner tonight"),
            new ToDo("Clean The Studio", true)));

//    public Mono<ToDo> findById(String id)){
//        return Mono.from(
//                toDoFlux.filter(todo->todo.getId().equals())
//        );
//    }

    public Mono<ToDo> findById(String id){
        return Mono.from(
                toDoFlux.filter(toDo -> toDo.getId().equals(id))
        );
    }

    public Flux<ToDo> findAll(){
        return toDoFlux;
    }


}
