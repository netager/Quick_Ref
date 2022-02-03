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
		
		// toString()��  Object Class�� �޼���� getClass().getName() + '@' + Integer.toHex String(hashCode())
		// toString() �� "object.Book@16f65612"�� ����ϴ� ���� �⺻���̳� toString()�� �������Ͽ� �ٸ��� ����� �� �ִ�.
		// Book Ŭ�������� toString()�� ������ ��.
		Book book = new Book("�����ڹ�","������");
		System.out.println(book);
		
		
		
		// String Class���� toString() �� ������ �Ǿ� ����.
		String str = new String("test");
		System.out.println(str);

	}

}
