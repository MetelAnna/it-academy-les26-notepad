package by.it_academy.notepad_project.service;

import java.util.List;
import java.util.regex.Pattern;

import by.it_academy.notepad_project.entity.Note;
import by.it_academy.notepad_project.dao.*;

public class NotepadProvider {

	private final static DaoProvider provider = DaoProvider.getIsntance();
	private final NotepadDao notepadDao = provider.getNotepadDao();

	public void addNote(Note note) {
		notepadDao.addNote(note);
		System.out.println("Note was added: " + note);
	}

	public List<Note> findNotesByContent(String regex) {
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		return notepadDao.findNotesByContent(regex);
	}

	public List<Note> findNotesByDate(String date) {
		return notepadDao.findNotesByDate(date);
	}

	public void showAllNotes() {
		List<Note> notes = notepadDao.showAllNotes();
		if (notes.isEmpty()) {
			System.out.println("Notepad is empty.");
		} else {
			notes.forEach(System.out::println);
		}
	}
}
