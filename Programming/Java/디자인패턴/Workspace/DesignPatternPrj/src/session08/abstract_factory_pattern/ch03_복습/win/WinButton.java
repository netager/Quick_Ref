package session08.abstract_factory_pattern.ch03_복습.win;

import session08.abstract_factory_pattern.ch03_복습.abst.Button;

public class WinButton implements Button {

	@Override
	public void click() {
		System.out.println("Win Button click");
		
	}

}
