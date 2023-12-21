package session08.abstract_factory_pattern.ch03_복습.linux;

import session08.abstract_factory_pattern.ch03_복습.abst.Button;

public class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("Linux Button click");
		
	}

}
