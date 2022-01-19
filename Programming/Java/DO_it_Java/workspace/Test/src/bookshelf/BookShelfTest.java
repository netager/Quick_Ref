package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("ลยน้ป๊ธฦ1");
		shelfQueue.enQueue("ลยน้ป๊ธฦ2");
		shelfQueue.enQueue("ลยน้ป๊ธฦ3");
		
		Object
		System.out.println(shelfQueue.getSize());
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.getSize());
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.getSize());
		
		shelfQueue.enQueue("ลยน้ป๊ธฦ4");
		System.out.println(shelfQueue.getSize());
	}

}
