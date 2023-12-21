package session08.abstract_factory_pattern.ch02_예제.linux;

import session08.abstract_factory_pattern.ch02_예제.abst.Button;
import session08.abstract_factory_pattern.ch02_예제.abst.GuiFact;
import session08.abstract_factory_pattern.ch02_예제.abst.TextArea;

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
