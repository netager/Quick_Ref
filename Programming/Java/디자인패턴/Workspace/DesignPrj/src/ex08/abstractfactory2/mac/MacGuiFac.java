package ex08.abstractfactory2.mac;

import ex08.abstractfactory2.abst.Button;
import ex08.abstractfactory2.abst.GuiFac;
import ex08.abstractfactory2.abst.TextArea;

public class MacGuiFac implements GuiFac {

	@Override
	public Button createButton() {

		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {

		return new MacTextArea();
	}

}
