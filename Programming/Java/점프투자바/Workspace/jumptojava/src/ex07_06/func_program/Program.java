package ex07_06.func_program;

@FunctionalInterface
interface Calculator {
	int sum(int a, int b);	
}


public class Program {
	public static void main(String[] args) {

//		Calculator mc = (int a, int b) -> a + b;
//		
//		int result = mc.sum(3, 4);
//		System.out.println(result);
		
//		Calculator mc = (a, b) -> a + b;
//
//		int result = mc.sum(3, 4);
//		System.out.println(result);

		Calculator mc = Integer::sum;

		int result = mc.sum(3, 4);
		System.out.println(result);

	}
}
