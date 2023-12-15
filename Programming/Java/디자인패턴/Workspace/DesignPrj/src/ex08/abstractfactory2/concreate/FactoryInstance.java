package ex08.abstractfactory2.concreate;

import ex08.abstractfactory2.abst.GuiFac;
import ex08.abstractfactory2.linux.LinuxGuiFac;
import ex08.abstractfactory2.mac.MacGuiFac;
import ex08.abstractfactory2.win.WinGuiFac;

public class FactoryInstance {
	
	public static GuiFac getGuiFac() {
		
		switch(getOsCode()) {
		case 0: 
			return new MacGuiFac();
			
		case 1: 
			return new LinuxGuiFac();
			
		case 2: 
			return new WinGuiFac();
			
		}
		
		return null;
	}
		
	private static int getOsCode() {
		
		if (System.getProperty("os.name").equals("Mac OS X")) {
			return 0;
		}

		return 2;
	}
		
}

