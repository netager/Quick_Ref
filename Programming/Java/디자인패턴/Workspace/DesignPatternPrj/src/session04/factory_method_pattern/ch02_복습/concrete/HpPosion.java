package session04.factory_method_pattern.ch02_복습.concrete;

import session04.factory_method_pattern.ch02_복습.framework.Item;

public class HpPosion implements Item {

	@Override
	public void use() {

		System.out.println("체력 회복!");
		
	}

}
