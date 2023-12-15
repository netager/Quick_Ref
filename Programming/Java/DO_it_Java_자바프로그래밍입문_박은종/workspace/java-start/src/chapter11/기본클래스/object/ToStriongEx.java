package chapter11.기본클래스.object;

class Book {
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + "," + author;
	}
	
	
}


public class ToStriongEx {

	public static void main(String[] args) {

		Book book = new Book("두잇자바","은종님");
		System.out.println(book);
		
		String str = new String("test");
		System.out.println(str);

	}

}
