package com.apress.todo.todowebflux.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



import java.time.LocalDateTime;
import java.util.UUID;


@Data
public class ToDo {


    private String id;
    private String description;
    private LocalDateTime create;
    private LocalDateTime modified;
    private boolean completed;


    public ToDo() {
        this.id = UUID.randomUUID().toString();
        this.create = LocalDateTime.now();
        this.modified = LocalDateTime.now();
    }

    public ToDo(String description) {
        this();
        this.description = description;
    }

    public ToDo(String description, boolean completed) {
        this();
        this.description = description;
        this.completed = completed;
    }
}


