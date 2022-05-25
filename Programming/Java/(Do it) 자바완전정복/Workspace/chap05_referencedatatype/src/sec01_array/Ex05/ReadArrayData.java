package sec01_array.Ex05;

import java.util.Arrays;

public class ReadArrayData {

	public static void main(String[] args) {

		int[] array = new int[] {3, 4, 5, 6, 7};
		
		//#1. 배열의 길이 구하기
		System.out.println(array.length);
		System.out.println("---------------------------");

		
		//#2. 배열의 출력1
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[3]);
		System.out.println(array[4]);

		
		//#3. 배열의 출력2
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------------");		
		
		//#4. 배열의 출력3
		// for(꺼낸 하나의 원소를 저장할 수 있는 변수 : 집합객체) {} - for each 구문
		for(int k : array) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("---------------------------");		
		
		//#5. 배열의 출력4		
		System.out.println(Arrays.toString(array));
		
		int a = Integer.parseInt("1");
		double d = Double.parseDouble("1.1");
		System.out.println(Integer.parseInt("1"));
		System.out.println(Double.parseDouble("1.1"));
		System.out.println(a + d);
		
	}

}
