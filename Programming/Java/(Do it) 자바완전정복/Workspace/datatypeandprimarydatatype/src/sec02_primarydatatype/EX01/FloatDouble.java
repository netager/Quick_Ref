package sec02_primarydatatype.EX01;

public class FloatDouble {

	public static void main(String[] args) {
		
		//#1. Float의 정밀도
		float f1 = 1.0000001f; 		// 소수점 7자리
		System.out.println(f1);
		float f2 = 1.00000001f;		// 소수점 8자리
		
		//#2. double의 정밀도 
		double d1 = 1.000000000000001;	// 소수점 15자리
		System.out.println(d1);
		double d2 = 1.0000000000000001;	// 소수점 16자리
		System.out.println(d2);
		
	}

}
