package by.it_academy.notepad_project.start;

import by.it_academy.notepad_project.controller.Controller;
import by.it_academy.notepad_project.service.*;

public class Main {

	public static void main(String[] args) {

		Controller controller = new Controller();

		String response;

		response = controller.doAction("add ");

		NotepadLogic logic = LogicProvider.getInstance().getNotepadLogic();

	}
}
