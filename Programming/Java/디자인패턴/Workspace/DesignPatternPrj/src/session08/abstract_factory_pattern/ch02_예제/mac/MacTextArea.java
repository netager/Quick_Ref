package session08.abstract_factory_pattern.ch02_예제.mac;

import session08.abstract_factory_pattern.ch02_예제.abst.TextArea;

public class MacTextArea implements TextArea {

	@Override
	public String getText() {
		return "Mac 텍스트에어리어";
	}

}
