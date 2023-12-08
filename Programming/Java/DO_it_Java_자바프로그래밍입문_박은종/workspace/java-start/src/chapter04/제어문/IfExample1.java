package chapter04.제어문;

public class IfExample1 {

	public static void main(String[] args) {

		int age = 10;
		
		if(age>=8) {
			System.out.println("학교에 다닙니다.");
			System.out.println("test");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
		
		if(age>=8) System.out.println("학교 GO");
		else System.out.println("학교 No GO");

	}

}
