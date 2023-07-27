package ex16.star;

public class Program {
    public static void main(String[] args) {

    	// 10개씩 10번 '☆' Print
    	for(int j=0; j<10; j++) {
    		for(int i=0; i<10; i++)
    			System.out.printf("%c", '☆');
    		
    		System.out.println();
    	}
    	
    	// 1개부터 1개씩 증가하면서 10번 '☆' Print
    	for(int j=0; j<10; j++) {
    		for(int i=0; i<j+1; i++) {
    			System.out.printf("%c", '☆');
    		}
    		System.out.println();
    	}

    	// 10개부터 1개씩 감소하면서 10번 '☆'  Print
    	for(int j=0; j<10; j++) {
    		for(int i=0; i<10-j; i++) {
    			System.out.printf("%c", '☆');
    		}
    		System.out.println();
    	}
    	
    	for(int i=0; i<5; i++)
    		System.out.printf("%c\n", 65+i);
    	
    	for(int i=0; i<5; i++)
    		System.out.printf("%c\n", 'A'+i);
    	
    	// 1, 6, 11, 16, 21, 26 : 등차수열
    	// An = A1 + (n-1)d
    	// Sn = n(A1 + An)/2
    	for(int i=0; i<6; i++)
    		System.out.printf("%d\n", 1+i*5);

    } // main
} // class