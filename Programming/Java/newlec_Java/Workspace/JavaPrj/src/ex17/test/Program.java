package ex17.test;

public class Program {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) { 
			if(i==4)
				System.out.printf("%c\n", 'A'+i);
			else if(i%2==0)
				System.out.printf("%c,", ' ');
			else
				System.out.printf("%c,", 'A'+i);
		}

		for(int i=0; i<5; i++) { 
			if(i%2==0)
				System.out.printf("%c,", ' ');
			else if(i==4)
				System.out.printf("%c\n", 'A'+i);
			else
				System.out.printf("%c,", 'A'+i);
		}
		System.out.println();


		for(int i=0; i<9; i++) {
			System.out.printf("%d ", i+1);
			if(i%3==2)
				System.out.println();
		}
		

		for(int y=0; y<3; y++) {
			for(int x=0; x<3; x++)
				System.out.printf("%d ", 3*y+x+1);
			System.out.println();
		}
	
	}
}