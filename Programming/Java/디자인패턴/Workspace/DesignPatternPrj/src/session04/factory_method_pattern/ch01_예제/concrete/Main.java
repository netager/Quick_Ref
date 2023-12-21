package session04.factory_method_pattern.ch01_예제.concrete;

import session04.factory_method_pattern.ch01_예제.framwork.Item;
import session04.factory_method_pattern.ch01_예제.framwork.ItemCreator;

public class Main {

	public static void main(String[] args) {

		ItemCreator creator;
		Item item;
		
		creator = new HpCreator();
		item = creator.create();
		item.use();
		System.out.println("-------------------------------------------");
		
		
		creator = new MpCreator();
		item = creator.create();
		item.use();
		
	}

}
