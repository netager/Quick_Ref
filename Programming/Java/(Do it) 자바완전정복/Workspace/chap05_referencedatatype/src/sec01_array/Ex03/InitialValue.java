package sec01_array.Ex03;

import java.util.Arrays;

public class InitialValue {

	public static void main(String[] args) {
		
		//#1. stack 메모리값(강제초기화 되지 않음)
		int value1;
//		System.out.println(value1); // 오류
		
		int[] value2;
//		System.out.println(value2); // 오류
		
		int value3 = 0;
		System.out.println(value3);

//		int[] value4 = 0; // 번지 값을 저장해야할 위치에 0을 넣으면 에러. 초기화는 null
		int[] value5 = null;
		System.out.println(value5);
		
		 
		//#2. heap 메모리의 초기화(강체초기화)
		boolean[] array1 = new boolean[3]; // 강제초기화: boolean - false
		for(int i=0; i<3; i++) {
			System.out.println(array1[i]+" ");
		}

		int[] array2 = new int[3]; // 강제초기화: int - 0
		for(int i=0; i<3; i++) {
			System.out.println(array2[i]+" ");
		}

		double[] array3 = new double[3]; // 강제초기화: double - 0.0
		for(int i=0; i<3; i++) {
			System.out.println(array3[i]+" ");
		}
		
		//@ 참조자료형 배열
		String[] array4 = new String[3]; // 강제초기화: String - null
		for(int i=0; i<3; i++) {
			System.out.println(array4[i]+" ");
		}
		
		
		//Tip. 배열을 쉽게 출력할 수 있는 방법
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));

		
	} // main

} // class
