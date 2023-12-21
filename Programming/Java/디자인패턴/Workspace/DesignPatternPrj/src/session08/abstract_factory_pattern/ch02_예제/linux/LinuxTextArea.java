package session08.abstract_factory_pattern.ch02_예제.linux;

import session08.abstract_factory_pattern.ch02_예제.abst.TextArea;

public class LinuxTextArea implements TextArea {

	@Override
	public String getText() {
		return "Linux 텍스트에어리어";
	}

}
