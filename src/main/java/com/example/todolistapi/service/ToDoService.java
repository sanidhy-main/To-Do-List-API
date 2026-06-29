package com.example.todolistapi.service;

import com.example.todolistapi.model.Task;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {
    private ArrayList<Task> tasks = new ArrayList<>();
    private int counter = 0;

    public void addTask(String title) {
        counter++;
        Task task = new Task(counter, title);
        tasks.add(task);
    }

    public void editTask(int id, String title) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setTitle(title);
            }
        }
    }

    public void removeTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                tasks.remove(task);
                return;
            }
        }
    }

    public Task viewTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }

        return null;
    }

    public ArrayList<Task> viewAll() {
        return tasks;
    }
}