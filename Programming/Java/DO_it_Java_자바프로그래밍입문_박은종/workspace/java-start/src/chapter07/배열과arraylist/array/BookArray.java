package chapter07.�迭��arraylist.array;

public class BookArray {
	public static void main(String[] args) {
		
		
		Book[] library = new Book[5];
		
		library[0] = new Book("�¹���0","������0");
		library[1] = new Book("�¹���1","������1");
		library[2] = new Book("�¹���2","������2");
		library[3] = new Book("�¹���3","������3");
		library[4] = new Book("�¹���4","������4");
		
		for (int i=0; i<library.length; i++) {
			library[i].showBook();
		}
		
		Book[] library1 = new Book[10];
				
		// �迭 �����ϱ� - System.arraycopy()
		System.arraycopy(library, 0, library1, 0, 5);
		library1[5] = new Book("�¹���5","������5");
		
		for (int i=0; i<library1.length; i++) {
			System.out.println(library1[i]);
//			library1[i].showBook();
		}
		
		
		
	}

}
