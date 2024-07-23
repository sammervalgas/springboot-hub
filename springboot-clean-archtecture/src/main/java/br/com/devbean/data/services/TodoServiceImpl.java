package br.com.devbean.data.services;

import br.com.devbean.domain.models.Todo;
import br.com.devbean.domain.services.TodoService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TodoServiceImpl implements TodoService {

    @Override
    public List<Todo> listTodos() {
        return List.of(
                new Todo(1L, "TODO 1", "TASK 1", 1),
                new Todo(2L, "TODO AGAIN", "TASK FOR LIFE", 2)
        );
    }
}
