package ex08.abstractfactory2;

import ex08.abstractfactory2.abst.Button;
import ex08.abstractfactory2.abst.GuiFac;
import ex08.abstractfactory2.abst.TextArea;
import ex08.abstractfactory2.concreate.FactoryInstance;
import ex08.abstractfactory2.linux.LinuxGuiFac;
import ex08.abstractfactory2.mac.MacGuiFac;
import ex08.abstractfactory2.win.WinGuiFac;

public class Main {

	public static void main(String[] args) {
		
		
		GuiFac fac = FactoryInstance.getGuiFac();
		
		Button button = fac.createButton();
		TextArea area = fac.createTextArea();
		
		button.click();
		System.out.println(area.getText());
		
		System.out.println(System.getProperty("os.name"));

	}

}
