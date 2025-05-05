package com.pluralsight;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        // Create NoteManager object
        NoteManager noteManager = new NoteManager();

        // Create new note
        Note newNote = new Note(1, "title", "content", "subject", LocalDateTime.now());

        // Add note to manager
        noteManager.addNote(newNote);

        // Display all notes
        noteManager.displayAllNotes();
    }
}