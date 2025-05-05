package com.pluralsight;

import java.util.ArrayList;
import java.util.Comparator;

public class TodoList {

    // Fields
    private ArrayList<ToDoItem> tasks = new ArrayList<>();
    private String name;
    private float progress;

    // Constructor
    public TodoList(String name) {
        this.name = name;
        this.progress = 0.0f;
    }

    // Methods
    public void addItem(ToDoItem item) {
        tasks.add(item);
        updateProgress();
    }

    public void removeItem(ToDoItem item) {
        tasks.remove(item);
        updateProgress();
    }

    public void search(String keyword) {
        tasks.stream()
                .filter(task -> task.getContent().contains(keyword) || task.getTitle().contains(keyword))
                .forEach(ToDoItem::display);
    }

    public void sort(Comparator<ToDoItem> comparator) {
        tasks.sort(comparator);
    }

    public void display() {
        tasks.forEach(ToDoItem::display);
    }

    private void updateProgress() {
        long completedTasks = tasks.stream().filter(ToDoItem::isCompleted).count();
        this.progress = (float) completedTasks / tasks.size() * 100;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getProgress() {
        return progress;
    }
}
