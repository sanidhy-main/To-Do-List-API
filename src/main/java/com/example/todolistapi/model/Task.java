package com.example.todolistapi.model;

public class Task {
    private int id;
    private String title;
    private boolean isCompleted;

    public Task() {}

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.isCompleted = false;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public boolean getCompleted() {
        return this.isCompleted;
    }
}