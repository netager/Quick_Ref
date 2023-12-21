package session08.abstract_factory_pattern.ch03_복습;

import session08.abstract_factory_pattern.ch03_복습.abst.Button;
import session08.abstract_factory_pattern.ch03_복습.abst.GuiFact;
import session08.abstract_factory_pattern.ch03_복습.abst.TextArea;
import session08.abstract_factory_pattern.ch03_복습.concrete.FactoryInstance;
import session08.abstract_factory_pattern.ch03_복습.win.WinGuiFact;

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
