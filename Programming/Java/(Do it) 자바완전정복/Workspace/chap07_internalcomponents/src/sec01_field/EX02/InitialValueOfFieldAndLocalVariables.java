package sec01_field.EX02;

//#1 클래스 생성(정의)
class A {
	boolean m1;
	int m2;
	double m3;
	String m4;
	
	void printFieldValue() {
		System.out.println(m1);	// false
		System.out.println(m2); // 0
		System.out.println(m3); // 0.0
		System.out.println(m4); // null
	}
	
	void printLocalVariable() {
		int k;
//		System.out.println(k); // 지역변수는 반드시 초기화하여야 함.
	}
}


public class InitialValueOfFieldAndLocalVariables {

	public static void main(String[] args) {
		
		//#2. 클래스를 활용하여 객체 생성
		A a = new A();
		
		//#3. 객체 활용
		a.printFieldValue();

	}

}
