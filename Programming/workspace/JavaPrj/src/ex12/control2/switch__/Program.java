package ex12.control2.switch__;

import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;
		int menu;

		Scanner scan = new Scanner(System.in);	

		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		
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
				
				do {
					System.out.print("����1:");
					kor1 = scan.nextInt();
					
					if(kor1<0 || kor1>100) {
						System.out.println("��������(0~100)�� ������ϴ�.");
					}
					
				} while(kor1<0 || kor1>100);
			
				do {
					System.out.print("����2:");
					kor2 = scan.nextInt();
					
					if(kor2<0 || kor2>100) {
						System.out.println("��������(0~100)�� ������ϴ�.");
					}				
				} while(kor2<0 || kor2>100);
	
				do {
					System.out.print("����3:");
					kor3 = scan.nextInt();
					
					if(kor3<0 || kor3>100) {
						System.out.println("��������(0~100)�� ������ϴ�.");
					}
				} while(kor3<0 || kor3>100);
				break;
		
			
			case 2:
				// ----- ���� ��� �κ� ------------------------------------
		
				total = kor1 + kor2 + kor3;
				avg = total / 3f;
				
				System.out.println("����������������������������������������������������");
				System.out.println("��          �������         ��");
				System.out.println("����������������������������������������������������");
				
				for(int i=0;i<3;i++) {
					System.out.printf("\t����%d : %3d\n", i+1, kor1);
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