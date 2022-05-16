package sec02_primarydatatype.EX06;

public class OperationBetweenDataType {

	public static void main(String[] args) {
		
		//#1. 같은 자료형간의 연산
		int value1 = 3 + 5;
		int value2 = 8 / 5;  // 1
		float value3 = 3.0f + 5.0f;
		double value4 = 8.0 / 5.0;
		
		byte data1 = 3;
		byte data2 = 5;
		// byte value5 = data1 + data2 	// byte + byte = int
		int value5 = data1 + data2;
		byte value6 = (byte)(data1 + data2); 	// byte + byte = int
		
		System.out.println(value1); // 8
		System.out.println(value2); // 1
		System.out.println(value3); // 8.0
		System.out.println(value4); // 1.6
		System.out.println(value5); // 8
		System.out.println(value6); // 8
		System.out.println("-----------------------------------------------");
		
		
		//#2. 다른 자료형 간의 연산
		//int value7 = 5 + 3.5;
		double value7 = 5 + 3.5;
		int value8 = 5 + (int)3.5;
		
		double value9 = 5/2.0;
		byte data3 = 3;
		short data4 = 5;
		int value10 = data3 + data4;
		double value11 = data3 + data4;
		
		System.out.println(value7);		// 8.5
		System.out.println(value8);		// 8
		System.out.println(value9);		// 2.5
		System.out.println(value10);	// 8
		System.out.println(value11);	// 8.0
		
	}

}
