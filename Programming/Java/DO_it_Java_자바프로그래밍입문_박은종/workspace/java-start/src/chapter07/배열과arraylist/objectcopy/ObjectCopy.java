package chapter07.배열과arraylist.objectcopy;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥1", "조정래1");
		bookArray1[1] = new Book("태백산맥2", "조정래2");
		bookArray1[2] = new Book("태백산맥3", "조정래3");

		for (int i=0; i<bookArray2.length; i++) {
			bookArray2[i] = new Book();
		}

//		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		for (int i=0; i<bookArray1.length; i++) {
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		}
		System.out.println();
		
		
		
		
		for (int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBook();
		}
		System.out.println();

		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		for (int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBook();
		}
		System.out.println("---------------------------");
		
		
		for (int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBook();
		}
		System.out.println();
		
		for (int i=0; i<bookArray1.length; i++) {
			System.out.println(bookArray1[i]);
		}
		System.out.println("---------------------------");

		for (int i=0; i<bookArray2.length; i++) {
			System.out.println(bookArray2[i]);
		}
		System.out.println("---------------------------");
		
		for (Book book: bookArray1) {
			System.out.println(book.getBookName() + ", " +book.getAuthor());
		}
		
		String[] strArray = {"Java", "Android", "C"};
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		for(String s: strArray) {
			System.out.println(s);
		}
		
		int[] arr = {1,2,3,4,5};
		for(int num : arr) {
			System.out.println(num);
		}

	}

}
