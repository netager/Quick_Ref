package ex08.abstractfactory2.win;

import ex08.abstractfactory2.abst.Button;
import ex08.abstractfactory2.abst.GuiFac;
import ex08.abstractfactory2.abst.TextArea;

public class WinGuiFac implements GuiFac {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WinButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new WinTextArea();
	}

}
