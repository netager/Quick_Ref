package chapter10.인터페이스.extendsimplements;

import java.util.ArrayList;

public class BookShelfTest {

	public static void main(String[] args) {

		ArrayList<Queue> bookShelfs = new ArrayList<Queue>();
		
		Queue bookShelf1 = new BookShelf();
		bookShelf1.enQueue("a1");
		bookShelf1.enQueue("a2");
		bookShelf1.enQueue("a3");

		Queue bookShelf2 = new BookShelf();
		bookShelf2.enQueue("b1");
		bookShelf2.enQueue("b2");
		bookShelf2.enQueue("b3");

		Queue bookShelf3 = new BookShelf();
		bookShelf3.enQueue("c1");
		bookShelf3.enQueue("c2");
		bookShelf3.enQueue("c3");

		
		bookShelfs.add(bookShelf1);
		bookShelfs.add(bookShelf2);
		bookShelfs.add(bookShelf3);
		
		for (Queue bookShelf : bookShelfs) {
			System.out.println(bookShelf.deQueue());
			System.out.println(bookShelf.deQueue());
		}
/*		
		Queue shelfQueue = new BookShelf();
//		BookShelf shelfQueue = new BookShelf();
		shelfQueue.enQueue("태백산맥1");
		shelfQueue.enQueue("태백산맥2");
		shelfQueue.enQueue("태백산맥3");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
*/
		Object shelf = new Shelf();

	}
}
