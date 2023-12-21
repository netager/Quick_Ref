package session04.factory_method_pattern.ch01_예제.concrete;

import session04.factory_method_pattern.ch01_예제.framwork.Item;

public class HpPosion implements Item {

	@Override
	public void use() {

		System.out.println("체력 회복!");
		
	}

}
