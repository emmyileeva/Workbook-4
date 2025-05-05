package com.pluralsight;

import java.time.LocalDateTime;
import java.io.File;

public class Note {

    // Fields
    private int id;
    private String title;
    private String content;
    private String subject;
    private LocalDateTime current;

    // Constructor
    public Note(int id, String title, String content, String subject, LocalDateTime current) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.subject = subject;
        this.current = current;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDateTime getCurrent() {
        return current;
    }

    public void setCurrent(LocalDateTime current) {
        this.current = current;
    }

    // Methods
    public void inputUserNote() {
    }

    public void edit(String newContent) {
    }

    public void delete() {
    }

    public void display() {
    }

    public void saveTo(File file) {
    }
}