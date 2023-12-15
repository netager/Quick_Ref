package chapter04.Á¦¾î¹®;

public class WhileExample {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		while (num <= 10) {
			
			sum += num;
			num++;
		}
		
		System.out.println(sum);
		
		sum = 0;
		for(int i=1;i<11;i++) {
			sum+=i;
		}
		System.out.println(sum);

	}

}
