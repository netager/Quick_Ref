package session08.abstract_factory_pattern.ch02_예제.win;

import session08.abstract_factory_pattern.ch02_예제.abst.TextArea;

public class WinTextArea implements TextArea {

	@Override
	public String getText() {
		return "Win 텍스트에어리어";
	}

}
