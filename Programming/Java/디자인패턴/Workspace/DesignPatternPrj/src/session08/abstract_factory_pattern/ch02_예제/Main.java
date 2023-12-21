package session08.abstract_factory_pattern.ch02_抗力;

import session08.abstract_factory_pattern.ch02_抗力.abst.Button;
import session08.abstract_factory_pattern.ch02_抗力.abst.GuiFact;
import session08.abstract_factory_pattern.ch02_抗力.abst.TextArea;
import session08.abstract_factory_pattern.ch02_抗力.concrete.FactoryInstance;

public class Main {

	public static void main(String[] args) {

		
		GuiFact fac = FactoryInstance.getGuiFact();
		
		Button button = fac.createButton();
		TextArea textArea = fac.createTextArea();

		button.click();
		System.out.println(textArea.getText());
		System.out.println("--------------------------");

	}

}
