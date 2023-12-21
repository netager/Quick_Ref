package session08.abstract_factory_pattern.ch02_예제.win;

import session08.abstract_factory_pattern.ch02_예제.abst.Button;

public class WinButton implements Button {

	@Override
	public void click() {
		System.out.println("Win 버튼 클릭");
		
	}

}
