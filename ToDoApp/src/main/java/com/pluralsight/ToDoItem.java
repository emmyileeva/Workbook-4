package com.pluralsight;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ToDoItem extends Note {

    // Additional Fields
    private boolean isCompleted;
    private LocalDate dueDate;
    private String priority;

    // Constructor
    public ToDoItem(int id, String title, String content, String subject, LocalDateTime current,
                    boolean isCompleted, LocalDate dueDate, String priority) {
        super(id, title, content, subject, current);
        this.isCompleted = isCompleted;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    // Additional Methods
    public void markAsCompleted() {
        this.isCompleted = true;
    }

    public void updateDescription(String newDescription) {
        setContent(newDescription);
    }

    public void updateTitle(String newTitle) {
        setTitle(newTitle);
    }

    public void setTimer(Duration duration) {
        // Logic for setting a timer
    }

    public void clearItem() {
        setContent("");
        setTitle("");
        this.isCompleted = false;
        this.dueDate = null;
        this.priority = null;
    }

    // Getters and Setters
    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}