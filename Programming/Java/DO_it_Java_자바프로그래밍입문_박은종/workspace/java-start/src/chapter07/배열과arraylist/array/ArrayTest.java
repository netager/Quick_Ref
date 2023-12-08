package chapter07.배열과arraylist.array;

public class ArrayTest {

	public static void main(String[] args) {

		int num = 10;
		int[] numbers = new int[10];
		
		//배열의 초기화
		int[] numbers1 = new int[] {0,1,2}; // 많이 사용하는 형식

		System.out.println(numbers1.length);
		
		int[] numbers2 = {1,2,3,4}; // java에서 많이 사용하는 형식은 아님
		System.out.println(numbers2.length);
		
		int[] numbers3 = new int[3];
		numbers3[0] = 1;
		numbers3[1] = 2;
		numbers3[2] = 3;
		
		System.out.println(numbers3[2]);
		
		for(int i=0; i<numbers3.length; i++) {
			System.out.println(numbers3[i]);
		}
		
		for(int value: numbers3) {
			System.out.println(value);
		}
		
		
		
		int[] numbers4;
		
		numbers4 = new int[3];
		numbers4[0] = 4;
		numbers4[1] = 5;
		numbers4[2] = 6;
		
		for(int i=0; i<numbers4.length; i++) {
			System.out.println(numbers4[i]);
		}
		
		int[] numbers5;
		
//		numbers5 = {1,2,3}; // 선언후 이런형태의 초기화는 에러 발생
		
		numbers5 = new int[] {1,2,3};
		
		for(int i=0; i<numbers4.length; i++) {
			System.out.println(numbers4[i]);
		}

		
		
		int[] studentIDs = new int[5]; // 초기값은 0으로 설정됨

		for (int i=0; i<studentIDs.length; i++) {
			System.out.println(studentIDs[i]);
		}

		double[] studentIDs1 = new double[5]; // 초기값은 0으로 설정됨

		for (int i=0; i<studentIDs1.length; i++) {
			System.out.println(studentIDs1[i]);
		}

		int[] numbers6 = new int[] {1,2,3};
		for (int i=0; i<numbers6.length; i++) {
			System.out.println(numbers6[i]);
		}
	
		

	}

}
