package array;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];     // 책의 주소를 가르키는 배열을 생성
		
		library[0] = new Book("태백산맥1","조정래");
		library[1] = new Book("택백산맥2","헤르만 헤세");
		library[2] = new Book("태백산맥3","조정래");
		library[3] = new Book("태백산맥4","조정래");
		library[4] = new Book("태백산맥5","조정래");
		
		for(int i=0; i<library.length;i++) {
			System.out.println(library[i]);
		}

		for(int i=0; i<library.length;i++) {
			library[i].showBookInfo();
		}
		
		library. 
	}

}
