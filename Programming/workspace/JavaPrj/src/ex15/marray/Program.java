package ex15.marray;

import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		int[] kors = new int[3];
//		int kor1, kor2, kor3;
		int total;
		float avg;
		int menu;

		Scanner scan = new Scanner(System.in);	

//		kor1 = 0;
//		kor2 = 0;
//		kor3 = 0;
		
		for(int i=0; i<3; i++)
			kors[i] = 0;
		
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
				
				for(int i=0; i<3; i++) {
					do {
						System.out.printf("����%d:", i+1);
						kors[i] = scan.nextInt();
						
						if(kors[i] <0 || kors[i]>100) {
							System.out.println("��������(0~100)�� ������ϴ�.");
						}
					} while(kors[i]<0 || kors[i]>100);
				}
				break;
					
			
			case 2:
				// ----- ���� ��� �κ� ------------------------------------
		
//				total = kor1 + kor2 + kor3;
				total = kors[0] + kors[1] + kors[2];
				avg = total / 3f;
				
				System.out.println("����������������������������������������������������");
				System.out.println("��          �������         ��");
				System.out.println("����������������������������������������������������");
				
				for(int i=0;i<3;i++) {
					System.out.printf("\t����%d : %3d\n", i+1, kors[i]);
				}
				
				System.out.printf("\t����  : %3d\n", total);
				System.out.printf("\t���  : %6.2f\n", avg);
				System.out.printf("����������������������������������������������������");
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