package ex17.test;

public class Program {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			if(i == 4)
				System.out.printf("%c\n", 'A'+i);
			else if (i%2==0)
				System.out.printf("%c, ", ' ');
			else
				System.out.printf("%c, ", 'A'+i);
		}

		for(int i=0; i<5; i++) {
			if (i%2==0)
				System.out.printf("%c, ", ' ');
			else if(i == 4)
				System.out.printf("%c\n", 'A'+i);
			else
				System.out.printf("%c, ", 'A'+i);
		}

	}

}
