package session08.abstract_factory_pattern.ch03_����.win;

import session08.abstract_factory_pattern.ch03_����.abst.Button;

public class WinButton implements Button {

	@Override
	public void click() {
		System.out.println("Win Button click");
		
	}

}
