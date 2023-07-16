package com.abi.examples.todomvcthymeleaf.todoitem;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TodoItemFormData {

    @NotBlank
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
