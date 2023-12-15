package ex08.abstractfactory2.linux;

import ex08.abstractfactory2.abst.Button;
import ex08.abstractfactory2.abst.GuiFac;
import ex08.abstractfactory2.abst.TextArea;

public class LinuxGuiFac implements GuiFac {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new LinuxTextArea();
	}

}
