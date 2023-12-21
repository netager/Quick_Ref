package session08.abstract_factory_pattern.ch03_복습.linux;

import session08.abstract_factory_pattern.ch03_복습.abst.TextArea;

public class LinuxTextArea implements TextArea {

	@Override
	public String getText() {
		return "Linux TextArea";
	}

}
