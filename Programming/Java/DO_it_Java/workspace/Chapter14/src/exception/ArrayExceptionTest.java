package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		try {
			for(int i=0; i<=5;i++) {
				System.out.println(arr[i]);
			}	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			return;
		}finally {                  // try 에서 finally가 정의되면 무조건 수행 되어야 함. 예외가 발생하건 안하건 수행됨.
			System.out.println("finally");
		}
		System.out.println("end");
	}

}
