package ex16.star;

public class Program {
    public static void main(String[] args) {

    	// 10���� 10�� '��' Print
    	for(int j=0; j<10; j++) {
    		for(int i=0; i<10; i++)
    			System.out.printf("%c", '��');
    		
    		System.out.println();
    	}
    	
    	// 1������ 1���� �����ϸ鼭 10�� '��' Print
    	for(int j=0; j<10; j++) {
    		for(int i=0; i<j+1; i++) {
    			System.out.printf("%c", '��');
    		}
    		System.out.println();
    	}

    	// 10������ 1���� �����ϸ鼭 10�� '��'  Print
    	for(int j=0; j<10; j++) {
    		for(int i=0; i<10-j; i++) {
    			System.out.printf("%c", '��');
    		}
    		System.out.println();
    	}
    	
    	for(int i=0; i<5; i++)
    		System.out.printf("%c\n", 65+i);
    	
    	for(int i=0; i<5; i++)
    		System.out.printf("%c\n", 'A'+i);
    	
    	// 1, 6, 11, 16, 21, 26 : ��������
    	// An = A1 + (n-1)d
    	// Sn = n(A1 + An)/2
    	for(int i=0; i<6; i++)
    		System.out.printf("%d\n", 1+i*5);

    } // main
} // class