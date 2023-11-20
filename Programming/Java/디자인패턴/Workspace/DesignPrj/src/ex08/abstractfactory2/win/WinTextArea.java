package ex08.abstractfactory2.win;

import ex08.abstractfactory2.abst.TextArea;

public class WinTextArea implements TextArea {

	@Override
	public String getText() {

		return "윈도우 텍스트 에어리어";
	}

}
