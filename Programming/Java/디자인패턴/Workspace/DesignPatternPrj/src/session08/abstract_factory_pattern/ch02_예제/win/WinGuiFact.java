package session08.abstract_factory_pattern.ch02_抗力.win;

import session08.abstract_factory_pattern.ch02_抗力.abst.Button;
import session08.abstract_factory_pattern.ch02_抗力.abst.GuiFact;
import session08.abstract_factory_pattern.ch02_抗力.abst.TextArea;

public class WinGuiFact implements GuiFact {

	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public TextArea createTextArea() {
		return new WinTextArea();
		
	}

}
