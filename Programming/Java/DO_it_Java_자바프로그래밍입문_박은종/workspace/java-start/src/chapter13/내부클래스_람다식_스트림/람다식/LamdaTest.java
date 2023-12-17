package chapter13.내부클래스_람다식_스트림.람다식;


// 1st : 람다 사용하기 위한 interface 선언
// -------------------------------
@FunctionalInterface
interface PrintString {
	void showString(String str);
}

public class LamdaTest {

	public static void main(String[] args) {

		// 2st : 람다식 사용을 위한 interface implements 구현
		// ------------------------------------------
		PrintString lambdaPrint = str->System.out.println(str);
		
		
		
		// 3st : 사용방식 3가지
		// ----------------
		// 사용 방식1 : 변수에 대입해서 바로 Implements 하는 방식
		lambdaPrint.showString("abc");
		

		
		// 사용방식2 메서드 call
		showMyString(lambdaPrint);
		
		
		// 사용방식3 메서드 call
		PrintString reStr = returnPrint();
		reStr.showString("hello ");

	}

	// 사용 방식2 메서드 : Implement된 자체를 매개변수로 넘어가는 방식
	public static void showMyString(PrintString lambda) {
		lambda.showString("Test Lambda");
	}

	// 사용 방식3 메서드 : Implements 한 자체를 반환값으로 넘기는 방식  
	public static PrintString returnPrint() {
		return s->System.out.println(s+"world");
	}

}