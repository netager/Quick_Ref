package session08.abstract_factory_pattern.ch02_����.concrete;

import session08.abstract_factory_pattern.ch02_����.abst.GuiFact;
import session08.abstract_factory_pattern.ch02_����.linux.LinuxGuiFact;
import session08.abstract_factory_pattern.ch02_����.mac.MacGuiFact;
import session08.abstract_factory_pattern.ch02_����.win.WinGuiFact;

public class FactoryInstance {

	public static GuiFact getGuiFact() {
		
		System.getProperty("os.name");

//		switch(getOsCode()) {
		switch(1) {
		case 0: return new MacGuiFact();
		case 1: return new LinuxGuiFact();
		case 2:	return new WinGuiFact();
		}
		return null;
	}
	
	private static int getOsCode() {
		if(System.getProperty("os.name").equals("Mac OS X")) {
			return 0;
		}
		return 1;
	}
}



