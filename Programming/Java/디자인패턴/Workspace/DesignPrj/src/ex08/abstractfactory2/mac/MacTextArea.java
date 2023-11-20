package ex08.abstractfactory2.mac;

import ex08.abstractfactory2.abst.TextArea;

public class MacTextArea implements TextArea {

	@Override
	public String getText() {

		return "맥 텍스트 에어리어";
	}

}
