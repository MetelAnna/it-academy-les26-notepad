package by.it_academy.notepad_project.controller.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import by.it_academy.notepad_project.controller.Command;
import by.it_academy.notepad_project.entity.Note;
import by.it_academy.notepad_project.service.LogicProvider;
import by.it_academy.notepad_project.service.NotepadLogic;

public class UpdateNoteCommand implements Command {

	private final LogicProvider logicProvider = LogicProvider.getInstance();
	private final NotepadLogic logic = logicProvider.getNotepadLogic();

	@Override
	public String execute(String request) {
		String response = null;
		String[] params;
		Note newNote;

		params = request.split("\n");
		newNote = new Note();

		newNote.setId(Integer.parseInt(params[1].split("=")[1]));
		newNote.setTitle(params[2].split("=")[1]);
		newNote.setContent(params[3].split("=")[1]);

		SimpleDateFormat format = new SimpleDateFormat();
		format.applyPattern("yyyy-mm-dd");
		Date date;

		try {
			date = format.parse(params[4].split("=")[1]);
			newNote.setDate(date);

			logic.addNote(newNote);
			response = "Note was successfully updated.";
		} catch (ParseException e) {
			e.printStackTrace();
			response = "Note wasn't updated.";
		}
		return response;
	}
}
