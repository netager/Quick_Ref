package chapter14.예외처리;

public class ArrayExceptionTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,};

		for(int i=0; i<5; i++) {		// 정상
			System.out.println(arr[i]); 
		}

		
		try {
			for(int i=0; i<=5; i++) {		// Exception 발생
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			return;
		} finally {
			System.out.println("Finally"); // catch 문에 return을 넣어도 finally 수행
			                               // try 가 수행되면 finally 는 무조건 수행
		}
		
		
		System.out.println("End");
			
	}

}
