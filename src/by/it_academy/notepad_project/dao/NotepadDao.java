package by.it_academy.notepad_project.dao;

import java.util.List;
import by.it_academy.notepad_project.entity.*;

public interface NotepadDao {

	void addNote(Note note);

	List<Note> showAllNotes();

	List<Note> findNotesByContent(String regex);

	List<Note> findNotesByDate(String date);

	// void saveNotes();

	// void loadNotes();
}
