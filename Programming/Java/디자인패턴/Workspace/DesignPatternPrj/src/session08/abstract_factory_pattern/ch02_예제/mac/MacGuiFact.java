package session08.abstract_factory_pattern.ch02_����.mac;

import session08.abstract_factory_pattern.ch02_����.abst.Button;
import session08.abstract_factory_pattern.ch02_����.abst.GuiFact;
import session08.abstract_factory_pattern.ch02_����.abst.TextArea;

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
