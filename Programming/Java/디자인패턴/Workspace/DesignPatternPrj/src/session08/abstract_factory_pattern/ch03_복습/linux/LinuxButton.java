package session08.abstract_factory_pattern.ch03_����.linux;

import session08.abstract_factory_pattern.ch03_����.abst.Button;

public class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("Linux Button click");
		
	}

}
