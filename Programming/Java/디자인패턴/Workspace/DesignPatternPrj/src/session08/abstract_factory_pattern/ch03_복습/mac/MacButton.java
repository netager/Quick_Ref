package session08.abstract_factory_pattern.ch03_복습.mac;

import session08.abstract_factory_pattern.ch03_복습.abst.Button;

public class MacButton implements Button {

	@Override
	public void click() {
		System.out.println("Mac Button click");
		
	}

}
