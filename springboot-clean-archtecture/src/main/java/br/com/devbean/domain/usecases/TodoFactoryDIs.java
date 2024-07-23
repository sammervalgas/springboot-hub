package br.com.devbean.domain.usecases;

import br.com.devbean.domain.services.TodoService;

public class TodoFactoryDIs {

    private final ListTodoUseCase listTodoUseCase;

    public TodoFactoryDIs(TodoService todoService) {
        this.listTodoUseCase = new ListTodoUseCase(todoService);
    }



}
