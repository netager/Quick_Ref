package ex10.control2.for_example;

public class Program {
	public static void main(String[] args) {
		
		int total = 0;
		
		for(int i=0; i<5; i++)
			total += i+3;			
		
//		n(a+l)/2
		total = 5*(3+7)/2;
		
		System.out.printf("total is %d", total);
		
	}
}