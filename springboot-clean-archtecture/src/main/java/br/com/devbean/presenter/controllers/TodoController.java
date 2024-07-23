package br.com.devbean.presenter.controllers;

import br.com.devbean.domain.models.Todo;
import br.com.devbean.domain.usecases.ListTodoUseCase;
import br.com.devbean.domain.usecases.TodoFactoryDIs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todos")
public class TodoController {

//    private final ListTodoUseCase listTodoUseCase;

    @Autowired
    private TodoFactoryDIs todoFactoryDIs;


//    public TodoController(ListTodoUseCase listTodoUseCase) {
//        this.listTodoUseCase = listTodoUseCase;
//    }

    @GetMapping
    public ResponseEntity<List<Todo>> list() {
        ListTodoUseCase listTodoUseCase = todoFactoryDIs.getListTodoUseCase();

        return Optional.ofNullable(listTodoUseCase.execute(null))
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
