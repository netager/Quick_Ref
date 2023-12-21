package session08.abstract_factory_pattern.ch02_예제.linux;

import session08.abstract_factory_pattern.ch02_예제.abst.Button;

public class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("Linux 버튼 클릭");
		
	}

}
