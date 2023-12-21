package session08.abstract_factory_pattern.ch02_����.linux;

import session08.abstract_factory_pattern.ch02_����.abst.Button;
import session08.abstract_factory_pattern.ch02_����.abst.GuiFact;
import session08.abstract_factory_pattern.ch02_����.abst.TextArea;

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
