package session08.abstract_factory_pattern.ch03_����;

import session08.abstract_factory_pattern.ch03_����.abst.Button;
import session08.abstract_factory_pattern.ch03_����.abst.GuiFact;
import session08.abstract_factory_pattern.ch03_����.abst.TextArea;
import session08.abstract_factory_pattern.ch03_����.concrete.FactoryInstance;
import session08.abstract_factory_pattern.ch03_����.win.WinGuiFact;

public class Main {

	public static void main(String[] args) {

//		GuiFact factory = new LinuxGuiFact();
//		GuiFact factory = new MacGuiFact();
//		GuiFact factory = new WinGuiFact();

		GuiFact factory = FactoryInstance.getInstance();
		
		Button button = factory.createButton();
		TextArea textArea = factory.createTextArea();
		
		button.click();
		System.out.println(textArea.getText());

	}

}
