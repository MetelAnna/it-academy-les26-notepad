package by.it_academy.notepad_project.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import by.it_academy.notepad_project.entity.Note;
import by.it_academy.notepad_project.dao.NotepadDao;

public final class FileNotepadDao implements NotepadDao {

	private static FileNotepadDao instance = null;

	public static FileNotepadDao getInstance() {
		if (instance == null) {
			instance = new FileNotepadDao();
		}
		return instance;
	}

	public FileNotepadDao() {
	}

	private List<Note> notes = new ArrayList<>();

	public void addNote(Note note) {
		notes.add(note);
	}

	public List<Note> showAllNotes() {
		return new ArrayList<>(notes);
	}

	public List<Note> findNotesByContent(String regex) {
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		return notes.stream().filter(note -> pattern.matcher(note.getContent()).find()).collect(Collectors.toList());
	}

	public List<Note> findNotesByDate(String date) {
		return notes.stream().filter(note -> note.getDate().toString().equals(date)).collect(Collectors.toList());
	}

}
