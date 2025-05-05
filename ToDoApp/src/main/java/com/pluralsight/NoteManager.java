package com.pluralsight;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NoteManager {

    // Fields
    private ArrayList<Note> notes = new ArrayList<>();
    private ArrayList<ToDoItem> todos = new ArrayList<>();
    private ArrayList<Note> history = new ArrayList<>();

    // Methods
    public void addNote(Note note) {
        notes.add(note);
    }

    public void deleteNote(int id) {
        notes.removeIf(note -> note.getId() == id);
    }

    public void editNote(int id, String newContent) {
        for (Note note : notes) {
            if (note.getId() == id) {
                note.setContent(newContent);
                break;
            }
        }
    }

    public void displayAllNotes() {
        notes.forEach(Note::display);
        todos.forEach(ToDoItem::display);
    }

    public void sortNotes(Comparator<Note> comparator) {
        notes.sort(comparator);
    }

    public List<Note> search(String keyword) {
        List<Note> result = new ArrayList<>();
        for (Note note : notes) {
            if (note.getContent().contains(keyword) || note.getTitle().contains(keyword)) {
                result.add(note);
            }
        }
        return result;
    }

    public List<Note> filterBySubject(String subject) {
        List<Note> result = new ArrayList<>();
        for (Note note : notes) {
            if (note.getSubject().equalsIgnoreCase(subject)) {
                result.add(note);
            }
        }
        return result;
    }

    public List<Note> filterByDate(LocalDate date) {
        List<Note> result = new ArrayList<>();
        for (Note note : notes) {
            if (note.getCurrent().toLocalDate().equals(date)) {
                result.add(note);
            }
        }
        return result;
    }
}