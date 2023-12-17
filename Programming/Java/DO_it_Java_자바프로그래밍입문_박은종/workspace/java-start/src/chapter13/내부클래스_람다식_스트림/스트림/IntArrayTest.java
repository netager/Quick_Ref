package chapter13.내부클래스_람다식_스트림.스트림;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,};
		
		
		// Arrays.stream() - stream 생성문
		// -----------------------------
		IntStream stream = Arrays.stream(arr);
		
		// stream 첫번째 사용
		// --------------
		int sum = stream.sum();
		System.out.println(sum);
		
		// stream 재사용시 에러 발생 함.
		boolean occureError = false;
		int count = 0;
		
		if(occureError) {
			// stream 두번째 사용
			// -------------------- 
			count = (int)stream.count();
			System.out.println(count);
		}
		else {
			// 한번 사용한 stream은 재생성 해야 사용할 수 있음
			int count2;
			count2 = (int)Arrays.stream(arr).count();
			System.out.println(count2);
		}

	}

}
