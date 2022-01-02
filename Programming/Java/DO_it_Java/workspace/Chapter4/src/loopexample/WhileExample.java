package loopexample;

public class WhileExample {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num < 1) {
			sum += num;
			num++;  // num = num + 1;
		}
		
		System.out.println("합:" + sum + "임");
		
		num = 1;
		sum = 0;
		do {
			sum += num;
			num++;
		}while(num <= 10);
		
		System.out.println("합:" + sum + "임");
		
	}
}