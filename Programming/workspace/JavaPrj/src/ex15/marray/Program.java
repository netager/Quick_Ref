package ex15.marray;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		int[] kors = new int[3*3]; // 1���� �迭

		int total = 0;
		float avg;
		int menu;

		Scanner scan = new Scanner(System.in);	

//		kor1 = 0;
//		kor2 = 0;
//		kor3 = 0;
		
		for(int j=0; j<3; j++)
			for(int i=0; i<3; i++)
				kors[3*j+i] = 0;
		
		����:
		while(true) {
			
			// ----- ���� �޴� �κ� ------------------------------------
			System.out.println("����������������������������������������������������");
			System.out.println("��          ���θ޴�         ��");
			System.out.println("����������������������������������������������������");
			System.out.println("\t1.�����Է�");
			System.out.println("\t2.�������");
			System.out.println("\t3.����");
			System.out.println("\t>");
			menu = scan.nextInt();
			
			switch(menu) {
			
			case 1:
				// ----- ���� �Է� �κ� ------------------------------------
				System.out.println("����������������������������������������������������");
				System.out.println("��          �����Է�         ��");
				System.out.println("����������������������������������������������������");
				
				for(int j=0; j<3; j++) 
					for(int i=0; i<3; i++)
						do {
							System.out.printf("%d�г� ����%d:", j+1, i+1);
							kors[3*j+i] = scan.nextInt();
							
							if(kors[3*j+i] <0 || kors[3*j+i]>100) {
								System.out.println("��������(0~100)�� ������ϴ�.");
							}
						} while(kors[3*j+i]<0 || kors[3*j+i]>100);
					
				break;
					
			
			case 2:
				// ----- ���� ��� �κ� ------------------------------------
		
				for(int j=0; j<3; j++) 
					for(int i=0; i<3; i++)
						total += kors[3*j+i];
				
				avg = total / 3f;
				
				System.out.println("����������������������������������������������������");
				System.out.println("��          �������         ��");
				System.out.println("����������������������������������������������������");
				
				for(int j=0; j<3; j++) {
					System.out.printf("<%d�г� �����>----------------\n", j+1);
					for(int i=0; i<3; i++)
						System.out.printf("\t����%d : %3d\n", i+1, kors[3*j+i]);
				
					System.out.printf("\t����  : %3d\n", total);
					System.out.printf("\t���  : %6.2f\n", avg);
					System.out.printf("����������������������������������������������������\n");
				}
				break;
				
			case 3:
				break ����;
			
			default:
				System.out.println("�Է� ���� 1 ~ 3 ������ �Է��� �� �ֽ��ϴ�.");
			}
		}
		
		System.out.println("good bye ~");
	}
}