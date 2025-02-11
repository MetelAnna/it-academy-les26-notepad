package by.it_academy.notepad_project.service;

import java.util.List;
import by.it_academy.notepad_project.entity.Note;

public interface NotepadLogic {

	void addNote(Note note);

	void showAllNotes();

	List<Note> findNotesByContent(String regex);

	List<Note> findNotesByDate(String date);

	// void saveNotes();

	// void loadNotes();
}
