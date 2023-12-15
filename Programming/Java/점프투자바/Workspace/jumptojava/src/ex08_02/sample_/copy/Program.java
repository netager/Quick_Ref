package ex08_02.sample_.copy;

public class Program {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i=1; i<1000; i++) {
			if (i % 3 ==0 || i % 5 == 0) {
				sum +=i;
			}
		}
		System.out.printf("Result: %d", sum);
	}

}
