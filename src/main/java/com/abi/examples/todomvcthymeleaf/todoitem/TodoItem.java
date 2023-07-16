package com.abi.examples.todomvcthymeleaf.todoitem;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class TodoItem {

    public TodoItem(String title,
                    boolean completed) {
        this.title = title;
        this.completed = completed;
    }

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String title;

    private Boolean completed;

    public boolean isCompleted() {
        return completed;
    }
}
