package session08.abstract_factory_pattern.ch03_����.concrete;

import session08.abstract_factory_pattern.ch03_����.abst.GuiFact;
import session08.abstract_factory_pattern.ch03_����.linux.LinuxGuiFact;
import session08.abstract_factory_pattern.ch03_����.mac.MacGuiFact;
import session08.abstract_factory_pattern.ch03_����.win.WinGuiFact;

public class FactoryInstance {

	public static GuiFact getInstance() {

		switch(2) {
			case 0: return new MacGuiFact();
			case 1: return new LinuxGuiFact();
			case 2: return new WinGuiFact();
		}
		return null;
	}

	
}
