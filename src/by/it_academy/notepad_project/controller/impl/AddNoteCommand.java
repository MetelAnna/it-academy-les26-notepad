package by.it_academy.notepad_project.controller.impl;

import by.it_academy.notepad_project.controller.Command;
import by.it_academy.notepad_project.entity.Note;
import by.it_academy.notepad_project.service.LogicProvider;
import by.it_academy.notepad_project.service.NotepadLogic;

public class AddNoteCommand implements Command {

	private final LogicProvider logicProvider = LogicProvider.getInstance();
	private final NotepadLogic logic = logicProvider.getNotepadLogic();

	@Override
	public String execute(String request) {
		String response = null;
		String[] params;
		Note newNote;

		params = request.split("\n");
		newNote = new Note();
		newNote.setTitle(params[1].split("=")[1]);
		newNote.setContent(params[2].split("=")[1]);

		logic.addNote(newNote);
		response = "Note was successfully added";

		return response;
	}
}
