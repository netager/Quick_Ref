package sec02_primarydatatype.EX03;

public class PrimaryDataType_2 {

	public static void main(String[] args) {
		
		//#4. 문자(char) : 문자, 정수
		//#4-1. 문자로 저장하는 방법
		char value1 = 'A';
		char value2 = '가';
		char value3 = '3';
		System.out.println(value1); // A
		System.out.println(value2); // 가
		System.out.println(value3); // 3
		System.out.println((int)value3);
		System.out.println("---------------------------------------------");
		
		
		//4-2. 정수로 저장하는 방법
		char value4 = 65;
		char value5 = '\uac00';
		char value6 = 51;
		System.out.println(value4); // A
		System.out.println(value5); // 가
		System.out.println(value6); // 3
		System.out.println("---------------------------------------------");
		
		
		//4-3. 유니코드로 직접 입력
		char value7 = '\u0041';
		char value8 = 0x0041;
		char value9 = '\uac00';
		char value10 = 0xac00;
		char value11 = '\u0033';
		char value12 = 0x0033;
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);
		System.out.println(value11);
		System.out.println(value12);
		System.out.println("---------------------------------------------");
		
		char value20 = 'A';
		char value21 = 65;
		char value22 = '\u0041';
		char value23 = 0x0041;
		System.out.println(value20);
		System.out.println(value21);
		System.out.println(value22);
		System.out.println(value23);
		System.out.println("---------------------------------------------");
		
		
	}

}
