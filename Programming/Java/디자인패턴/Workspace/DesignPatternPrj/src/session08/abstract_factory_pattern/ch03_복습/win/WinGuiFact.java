package session08.abstract_factory_pattern.ch03_����.win;

import session08.abstract_factory_pattern.ch03_����.abst.Button;
import session08.abstract_factory_pattern.ch03_����.abst.GuiFact;
import session08.abstract_factory_pattern.ch03_����.abst.TextArea;

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
