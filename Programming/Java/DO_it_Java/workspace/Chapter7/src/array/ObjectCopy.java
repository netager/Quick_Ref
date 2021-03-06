package array;

public class ObjectCopy {

//	public static void main(String[] args) {
//		Book[] bookArray1 = new Book[3];
//		Book[] bookArray2 = new Book[3];
//		
//		bookArray1[0] = new Book("�¹���1", "������");
//		bookArray1[1] = new Book("�¹���2", "������");
//		bookArray1[2] = new Book("�¹���3", "������");
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
//		bookArray1[0].setBookName("����");
//		bookArray1[0].setAuthor("�ڿϼ�");
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
//		// ���� for loop
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

		bookArray1[0] = new Book("�¹���1","������");
		bookArray1[1] = new Book("�¹���2","������");
		bookArray1[2] = new Book("�¹���3","������");
		
		
		// ���� ���� 
		// bookArray1 �� ������ �ִ� �ּҸ� bookArray2�� ���� - ���� ����
		// bookArray1 �� bookArray2�� ��ҿ� ���� �ּҸ� ����  
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for (int i=0; i<bookArray2.length; i++) {
			//System.out.println(bookArray2[i]);
			bookArray2[i].showBookInfo();
		}
		
		System.out.println("--------------------------------");
		bookArray2[0].setBookName("�ظ����Ϳ� �ϰ�������");
		bookArray2[0].setAuthor("���� �Ѹ�");
		bookArray2[0].showBookInfo();
		System.out.println("--------------------------------");

		System.out.println("[���� ���� ���� bookArray1] --------------------------------");
		for (int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}

		System.out.println("[���� ���� ���� bookArray2] --------------------------------");
		for (int i=0; i<bookArray2.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		for (Book book : bookArray1) {
			System.out.println("bookArray1 items �ּ� : " +book);			
		}
		for (Book book : bookArray1) {
			System.out.println("bookArray2 items �ּ� : " +book);			
		}

		System.out.println(bookArray2);

// ���� ���� 
		
		bookArray1[0] = new Book("�¹���1","������");
		bookArray1[1] = new Book("�¹���2","������");
		bookArray1[2] = new Book("�¹���3","������");

		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		System.out.println("���� ���� : bookArray1 -------------------");
		for (Book book : bookArray1) {
			book.showBookInfo();
		}

		
		for(int i = 0; i<bookArray2.length; i++) {
			
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		}
		
		System.out.println("[���� ����: bookArray2 ���� ����] --------------------------------");
		bookArray2[0].setBookName("�ظ����Ϳ� �ϰ�������");
		bookArray2[0].setAuthor("���ӽ� �Ѹ�");
		bookArray2[0].showBookInfo();
		System.out.println("[���� ����] --------------------------------");

		System.out.println("���� ���� : bookArray1 -------------------");
		for (Book book : bookArray1) {
			book.showBookInfo();
		}
		
		System.out.println("���� ���� : bookArray2 -------------------");
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
