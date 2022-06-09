package sec01_controlstatement.EX02;

public class SwitchControlStatement {

	public static void main(String[] args) {
		
		//#1. break이 포함되지 않은 경우
		int value1 = 2;
		switch(value1) {
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("B");
		case 3:
			System.out.println("C");
		default:
			System.out.println("D");
			
		}
		System.out.println("--------------------------------");

		
		//#2. break이 포함된 경우
		int value2 = 2;
		switch(value2) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
		}
		System.out.println("--------------------------------");

	}

}
