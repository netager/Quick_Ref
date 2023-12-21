package session08.abstract_factory_pattern.ch03_복습.linux;

import session08.abstract_factory_pattern.ch03_복습.abst.Button;
import session08.abstract_factory_pattern.ch03_복습.abst.GuiFact;
import session08.abstract_factory_pattern.ch03_복습.abst.TextArea;

public class LinuxGuiFact implements GuiFact {

	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		return new LinuxTextArea();
	}

}
