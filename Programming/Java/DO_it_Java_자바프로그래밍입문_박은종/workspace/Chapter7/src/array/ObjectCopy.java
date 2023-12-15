package array;

public class ObjectCopy {

//	public static void main(String[] args) {
//		Book[] bookArray1 = new Book[3];
//		Book[] bookArray2 = new Book[3];
//		
//		bookArray1[0] = new Book("태백산맥1", "조정래");
//		bookArray1[1] = new Book("태백산맥2", "조정래");
//		bookArray1[2] = new Book("태백산맥3", "조정래");
//
//		bookArray2[0] = new Book();
//		bookArray2[1] = new Book();
//		bookArray2[2] = new Book();
//
//		// System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
//		
//		for(int i=0; i<bookArray1.length; i++) {
//			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
//			bookArray2[i].setBookName(bookArray1[i].getBookName());
//		}
//		
//		for(int i=0; i<bookArray2.length; i++) {
//			bookArray2[i].showBookInfo();
//		}
//		
//		bookArray1[0].setBookName("나목");
//		bookArray1[0].setAuthor("박완서");
//		
//		for(int i=0; i<bookArray1.length; i++) {
//			bookArray1[i].showBookInfo();
//		}
//		
//		System.out.println("------------------------------------");
//		
//		for(int i=0; i<bookArray2.length; i++) {
//			bookArray2[i].showBookInfo();
//		}
//		
//		String[] strArr = {"Java", "Android","C"};
//		for(int i=0; i<strArr.length; i++) {
//			System.out.println(strArr[i]);
//		}
//		
//		// 향상된 for loop
//		for(String s : strArr) {
//			System.out.println(s);
//		}
//		
//		int[] arr = {1,2,3,4,5};
//		for(int num : arr) {
//			System.out.println(num);
//		}
//	}
	
	public static void main(String[] args) {
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];

		bookArray1[0] = new Book("태백산맥1","조정례");
		bookArray1[1] = new Book("태백산맥2","조정례");
		bookArray1[2] = new Book("태백산맥3","조정례");
		
		
		// 약은 복사 
		// bookArray1 이 가지고 있는 주소를 bookArray2로 복사 - 얕은 복사
		// bookArray1 과 bookArray2의 요소에 같은 주소를 지정  
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for (int i=0; i<bookArray2.length; i++) {
			//System.out.println(bookArray2[i]);
			bookArray2[i].showBookInfo();
		}
		
		System.out.println("--------------------------------");
		bookArray2[0].setBookName("해리포터와 일곱난쟁이");
		bookArray2[0].setAuthor("조앤 롤링");
		bookArray2[0].showBookInfo();
		System.out.println("--------------------------------");

		System.out.println("[얕은 복사 이후 bookArray1] --------------------------------");
		for (int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}

		System.out.println("[얕은 복사 이후 bookArray2] --------------------------------");
		for (int i=0; i<bookArray2.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		for (Book book : bookArray1) {
			System.out.println("bookArray1 items 주소 : " +book);			
		}
		for (Book book : bookArray1) {
			System.out.println("bookArray2 items 주소 : " +book);			
		}

		System.out.println(bookArray2);

// 깊은 복사 
		
		bookArray1[0] = new Book("태백산맥1","조정례");
		bookArray1[1] = new Book("태백산맥2","조정례");
		bookArray1[2] = new Book("태백산맥3","조정례");

		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		System.out.println("깊은 복사 : bookArray1 -------------------");
		for (Book book : bookArray1) {
			book.showBookInfo();
		}

		
		for(int i = 0; i<bookArray2.length; i++) {
			
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		}
		
		System.out.println("[깊은 복사: bookArray2 임의 변경] --------------------------------");
		bookArray2[0].setBookName("해리포터와 일곱난쟁이");
		bookArray2[0].setAuthor("제임스 롤링");
		bookArray2[0].showBookInfo();
		System.out.println("[깊은 복사] --------------------------------");

		System.out.println("깊은 복사 : bookArray1 -------------------");
		for (Book book : bookArray1) {
			book.showBookInfo();
		}
		
		System.out.println("깊은 복사 : bookArray2 -------------------");
		for (Book book : bookArray2) {
			book.showBookInfo();
		}
		
		String[] strArr = {"Java","Android","C"};
		
		for (int i=0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		for (String str : strArr)
			System.out.println(str);
		
		int[] intArray = {1,2,3,4,5};
		
		for(int i : intArray)
			System.out.print(i + " ");
			
	}

}
