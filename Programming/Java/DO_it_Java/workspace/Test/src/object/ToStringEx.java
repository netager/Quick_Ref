package object;

class Book {
	String title;
	String author;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + "," + author;
	}
	
	
	
}
public class ToStringEx {

	public static void main(String[] args) {
		
		// toString()은  Object Class의 메서드로 getClass().getName() + '@' + Integer.toHex String(hashCode())
		// toString() 은 "object.Book@16f65612"로 출력하는 것이 기본형이나 toString()을 재정의하여 다르게 출력할 수 있다.
		// Book 클래스내에 toString()을 재정의 함.
		Book book = new Book("두잇자바","은종님");
		System.out.println(book);
		
		
		
		// String Class내에 toString() 이 재정의 되어 있음.
		String str = new String("test");
		System.out.println(str);

	}

}
