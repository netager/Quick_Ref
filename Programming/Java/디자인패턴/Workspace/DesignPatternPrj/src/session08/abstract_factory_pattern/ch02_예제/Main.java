package session08.abstract_factory_pattern.ch02_����;

import session08.abstract_factory_pattern.ch02_����.abst.Button;
import session08.abstract_factory_pattern.ch02_����.abst.GuiFact;
import session08.abstract_factory_pattern.ch02_����.abst.TextArea;
import session08.abstract_factory_pattern.ch02_����.concrete.FactoryInstance;

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
