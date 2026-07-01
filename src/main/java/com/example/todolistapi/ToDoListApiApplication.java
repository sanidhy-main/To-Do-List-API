package com.example.todolistapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Sanidhy's To-Do API",
        version = "1.0.0",
        description = "A REST API for managing tasks.",
        contact = @Contact(
                name = "Sanidhy Chaturvedi",
        url = "https://github.com/sanidhy-main"
)
    )
            )

public class ToDoListApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToDoListApiApplication.class, args);
    }

}
