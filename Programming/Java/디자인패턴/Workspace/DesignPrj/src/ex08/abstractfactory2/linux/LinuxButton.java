package ex08.abstractfactory2.linux;

import ex08.abstractfactory2.abst.Button;

public class LinuxButton implements Button {

	@Override
	public void click() {

		System.out.println("������ ��ư");
	}

}
