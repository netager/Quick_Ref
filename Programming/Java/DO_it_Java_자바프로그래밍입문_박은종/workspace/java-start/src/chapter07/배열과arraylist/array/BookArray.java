package chapter07.배열과arraylist.array;

public class BookArray {
	public static void main(String[] args) {
		
		
		Book[] library = new Book[5];
		
		library[0] = new Book("태백산맥0","조정래0");
		library[1] = new Book("태백산맥1","조정래1");
		library[2] = new Book("태백산맥2","조정래2");
		library[3] = new Book("태백산맥3","조정래3");
		library[4] = new Book("태백산맥4","조정래4");
		
		for (int i=0; i<library.length; i++) {
			library[i].showBook();
		}
		
		Book[] library1 = new Book[10];
				
		// 배열 복사하기 - System.arraycopy()
		System.arraycopy(library, 0, library1, 0, 5);
		library1[5] = new Book("태백산맥5","조정래5");
		
		for (int i=0; i<library1.length; i++) {
			System.out.println(library1[i]);
//			library1[i].showBook();
		}
		
		
		
	}

}
