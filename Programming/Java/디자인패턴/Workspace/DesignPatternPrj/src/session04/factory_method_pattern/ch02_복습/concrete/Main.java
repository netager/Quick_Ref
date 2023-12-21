package session04.factory_method_pattern.ch02_����.concrete;

import session04.factory_method_pattern.ch02_����.framework.Item;
import session04.factory_method_pattern.ch02_����.framework.ItemCreator;

public class Main {

	public static void main(String[] args) {

		Item item;
		ItemCreator creator;
		
		creator = new HpCreator();
		item = creator.create();
		item.use();
		System.out.println("------------------------------");

		creator = new MpCreator();
		item = creator.create();
		item.use();

	}

}
