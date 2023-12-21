package session08.abstract_factory_pattern.ch03_복습.concrete;

import session08.abstract_factory_pattern.ch03_복습.abst.GuiFact;
import session08.abstract_factory_pattern.ch03_복습.linux.LinuxGuiFact;
import session08.abstract_factory_pattern.ch03_복습.mac.MacGuiFact;
import session08.abstract_factory_pattern.ch03_복습.win.WinGuiFact;

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
