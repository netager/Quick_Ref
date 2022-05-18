package sec01_array.Ex04;

import java.util.Arrays;

public class PrimaryAndReferenceType {

	public static void main(String[] args) {
		
		//#1. 기본자료형의 대입연산 (stack 값 복사)
		int value1 = 3;
		int value2 = value1;
		value2 = 7;
		System.out.println(value1);
		System.out.println(value2);
		
		
		//#2. 참조자료형의 대입연산 (stack 값 복사)
		int[] array1 = new int[] {3, 4, 5};
		int[] array2 =  array1;
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));

		array2[0] = 7;
		array1[1] = 10;
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));

		
	}

}
