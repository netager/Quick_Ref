package array;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];     // å�� �ּҸ� ����Ű�� �迭�� ����
		
		library[0] = new Book("�¹���1","������");
		library[1] = new Book("�ù���2","�츣�� �켼");
		library[2] = new Book("�¹���3","������");
		library[3] = new Book("�¹���4","������");
		library[4] = new Book("�¹���5","������");
		
		for(int i=0; i<library.length;i++) {
			System.out.println(library[i]);
		}

		for(int i=0; i<library.length;i++) {
			library[i].showBookInfo();
		}
	
		int[] arr = new int[5]; // int 4byte 5���� 20byte
	}

}