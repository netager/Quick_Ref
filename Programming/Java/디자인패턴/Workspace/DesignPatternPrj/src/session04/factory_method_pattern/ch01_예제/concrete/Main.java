package session04.factory_method_pattern.ch01_����.concrete;

import session04.factory_method_pattern.ch01_����.framwork.Item;
import session04.factory_method_pattern.ch01_����.framwork.ItemCreator;

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
