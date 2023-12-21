package session08.abstract_factory_pattern.ch02_抗力.mac;

import session08.abstract_factory_pattern.ch02_抗力.abst.Button;
import session08.abstract_factory_pattern.ch02_抗力.abst.GuiFact;
import session08.abstract_factory_pattern.ch02_抗力.abst.TextArea;

public class MacGuiFact implements GuiFact {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {
		return new MacTextArea();
		
	}

}
