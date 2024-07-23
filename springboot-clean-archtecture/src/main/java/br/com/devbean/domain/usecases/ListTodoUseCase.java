package br.com.devbean.domain.usecases;

import br.com.devbean.core.shared.UseCase;
import br.com.devbean.domain.models.Todo;
import br.com.devbean.domain.services.TodoService;

import java.util.List;

/**
 * Para UseCase a nossa abordagem é criar uma Inversao de Dependencias no core.dis TodoDependencyInjection
 * para poder ser injetado como bean normal sem ferir o dominio. Pois o Dominio deve servir somente a ele
 * como regra de negocio sem interferencia externa.
 */
public class ListTodoUseCase implements UseCase<Void, List<Todo>> {

    private final TodoService service;

    public ListTodoUseCase(TodoService service) {
        this.service = service;
    }

    @Override
    public List<Todo> execute(Void param) {
        return service.listTodos();


    }
}

