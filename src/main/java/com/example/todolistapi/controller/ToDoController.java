package com.example.todolistapi.controller;

import com.example.todolistapi.model.Task;
import com.example.todolistapi.service.ToDoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@RestController
public class ToDoController {
    private final ToDoService service;

    public ToDoController(ToDoService service) {
        this.service = service;
    }

    @GetMapping("/tasks/{id}")
    public Task getTask(@PathVariable int id) {
        return service.viewTask(id);
    }

    @GetMapping("/tasks")
    public ArrayList<Task> getTasks() {
        return service.viewAll();
    }

    @PostMapping("/tasks")
    public void addTask(@RequestBody Task task) {
        service.addTask(task.getTitle());
    }

    @PutMapping("/tasks/{id}")
    public void editTask(@PathVariable int id, @RequestBody Task task) {
        service.editTask(id, task.getTitle());
    }

    @PutMapping("/tasks/{id}/status")
    public void completeTask(@PathVariable int id, Boolean status) {
        service.markCompleted(id, status);
    }

    @DeleteMapping("/tasks/{id}")
    public void removeTask(@PathVariable int id) {
        service.removeTask(id);
    }
}