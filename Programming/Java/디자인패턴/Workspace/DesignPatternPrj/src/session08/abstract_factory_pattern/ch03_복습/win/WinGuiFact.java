package session08.abstract_factory_pattern.ch03_복습.win;

import session08.abstract_factory_pattern.ch03_복습.abst.Button;
import session08.abstract_factory_pattern.ch03_복습.abst.GuiFact;
import session08.abstract_factory_pattern.ch03_복습.abst.TextArea;

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
