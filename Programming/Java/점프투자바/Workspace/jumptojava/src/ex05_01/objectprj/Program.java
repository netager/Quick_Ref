package ex05_01.objectprj;

class Calculator {
	int result = 0;
	
	int add(int num) {
		result += num;
		return result;
	}
	
	int sub(int num) {
		result -= num;
		return result;
	}

}

class Calculator1 {
	static int result = 0;
	
	static int add(int num) {
		result += num;
		return result;
	}
	
	static int sub(int num) {
		result -= num;
		return result;
	}

}


class Calculator2 {
	static int result = 0;
	
	static int add(int num) {
		result += num;
		return result;
	}
	
		
	static int sub(int num) {
		result -= num;
		return result;
	}
}

public class Program {

	public static void main(String[] args) {
		
		Calculator cal1 = new Calculator();
		Calculator cal2 = new Calculator();

		System.out.println(cal1.add(3));
		System.out.println(cal1.add(4));
		System.out.println(cal1.sub(4));
		System.out.println();
		
		System.out.println(cal2.add(3));
		System.out.println(cal2.add(10));
		System.out.println(cal2.sub(10));
		System.out.println();

		System.out.println(Calculator1.add(3));
		System.out.println(Calculator1.add(4));
		System.out.println(Calculator1.sub(4));
		System.out.println();
		
		System.out.println(Calculator2.add(3));
		System.out.println(Calculator2.add(7));
		System.out.println(Calculator2.sub(7));
		System.out.println();

	}

}
