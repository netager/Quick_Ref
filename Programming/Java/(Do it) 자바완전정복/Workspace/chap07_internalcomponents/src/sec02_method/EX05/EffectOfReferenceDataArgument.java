package sec02_method.EX05;

import java.util.Arrays;

public class EffectOfReferenceDataArgument {
	public static void main(String[] args) {
		
		int[] array = new int[] {1,2,3};
		
		printArray(array); // [1, 2, 3]
		modifyData(array); 
		printArray(array); // [4, 5, 6]
	}
	
	public static void modifyData(int[] a) {  // 참조변수형인 경우 메모리 주소가 복사됨 
		a[0] = 4;
		a[1] = 5;
		a[2] = 6;
	}
	
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}

}
