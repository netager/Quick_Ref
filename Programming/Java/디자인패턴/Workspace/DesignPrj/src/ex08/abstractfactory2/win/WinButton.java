package ex08.abstractfactory2.win;

import ex08.abstractfactory2.abst.Button;

public class WinButton implements Button {

	@Override
	public void click() {

		System.out.println("������ ��ư");
	}

}
