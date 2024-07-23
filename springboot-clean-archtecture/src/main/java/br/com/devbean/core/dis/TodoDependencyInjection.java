package br.com.devbean.core.dis;

import br.com.devbean.domain.services.TodoService;
import br.com.devbean.domain.usecases.ListTodoUseCase;
import br.com.devbean.domain.usecases.TodoFactoryDIs;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TodoDependencyInjection {

    // Essa abordagem é o mesmo que o @Autowired, no entanto, dessa forma, podemos evitar dependencia circular.
    private final TodoService service;

    public TodoDependencyInjection(TodoService service) {
        this.service = service;
    }

//    @Bean
//    public ListTodoUseCase listTodoUseCase() {
//        return new ListTodoUseCase(service);
//    }

    @Bean
    public TodoFactoryDIs todoDIs() {
        return new TodoFactoryDIs(
                new ListTodoUseCase(service)
        );
    }

}
