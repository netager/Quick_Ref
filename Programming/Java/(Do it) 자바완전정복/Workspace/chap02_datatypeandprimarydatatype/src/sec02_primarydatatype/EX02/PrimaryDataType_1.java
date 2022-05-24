package sec02_primarydatatype.EX02;

public class PrimaryDataType_1 {
	public static void main(String[] args) {
		
		//#1. boolean : true / false
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		
		//#2. 정수(byte, short, int, long) : 음의 정수 / 0 / 양의 정수
		byte value1 = 10;
		short value2 = -10;
		int value3 = 100;
		long value4 = -100L; 	// L 생략해도 문제 없음. L이 없으면 int로 인식 
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
	
		//#3. 실수(float, double) : 음의 실수 / 0 / 양의 실수
		float value5 = 1.2F;
		double value6 = -1.5;
		double value7 = 5; 		// 정수를 실수에 넣어도 문제 없음
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);	// 5를 실수로 변경(5.0)해서 저장 
		
		
	}

}
