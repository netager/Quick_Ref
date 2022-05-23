package sec01_basicsyntax.EX03;

public class ConsoleOutput {

	public static void main(String[] args) {
		
		System.out.println("화면출력");	// 화면출력
		System.out.println("화면"+"출력");	// 화면출력
		System.out.println(3.8);		// 3.8
		System.out.println(3+5);		// 8
		System.out.println("화면"+3);		// 화면3
		System.out.println("화면"+3+5);	// 화면8  	--> String + int -> String + int --> String
		System.out.println(3+5+"화면");	// 8화면 		--> int + int -> int + String --> String
		System.out.println();			// 개행문자
		
		int a = 3;
		String b = "화면";
		System.out.println(a);			// 3
		System.out.println(b);			// 화면
		System.out.println(b+"출력");		// 화면출력
		System.out.println(a+b+"출력");	// 3화면출력
		System.out.println();	
		
		System.out.print("화면");
		System.out.print("출력");
		System.out.print("3");
		System.out.print("\n");			// 개행해라
		
		System.out.printf("%d\n", 30);	// 10진수 - 30
		System.out.printf("%o\n", 8);	//  8진수 - 10
		System.out.printf("%x\n", 16);	// 16진수 - 10
		
		System.out.printf("%s\n", "출력");	// 출력
		System.out.printf("%f\n", 5.8f);
		System.out.printf("%4.2f\n", 5.8f);
		System.out.printf("%d와 %4.2f\n", 4, 5.8);
		
	}

}
