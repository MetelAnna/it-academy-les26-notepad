package by.it_academy.notepad_project.controller.impl;

import by.it_academy.notepad_project.controller.Command;
import by.it_academy.notepad_project.service.LogicProvider;
import by.it_academy.notepad_project.service.NotepadLogic;

public class FindNoteByDateCommand implements Command {
	private final LogicProvider logicProvider = LogicProvider.getInstance();
	private final NotepadLogic logic = logicProvider.getNotepadLogic();
}
