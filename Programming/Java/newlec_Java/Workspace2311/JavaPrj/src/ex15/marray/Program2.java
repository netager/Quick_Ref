package ex15.marray;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {

		int[][] kors = new int[3][3];
		int total;
		float avg;
		int menu;
		
		Scanner scan = new Scanner(System.in);

		
		����:		// break ��'
		while(true) {
			
			//--- ���� �޴� �κ� ----------------------------------
			System.out.println("������������������������������������������");
			System.out.println("��       ���� �޴�      ��");
			System.out.println("������������������������������������������");
			System.out.println("\t1. �����Է�");
			System.out.println("\t2. �������");
			System.out.println("\t3. ����");
			System.out.println("\t>");
			
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:

				//--- ���� �Է� �κ� ----------------------------------
				System.out.println("������������������������������������������");
				System.out.println("��       ���� �Է�      ��");
				System.out.println("������������������������������������������");

				for(int j=0; j<3; j++)
					for (int i=0; i<3; i++ ) {
						do {
							System.out.printf("%d�г� ����%d :", j+1, i+1);
							kors[j][i] = scan.nextInt();
							
							if (kors[j][i] < 0 || 100 < kors[j][i])
								System.out.println("��������(0~100)�� ������ϴ�.");
						} while(kors[j][i] < 0 || 100 < kors[j][i]);
					}
				
				break;

				
			case 2:
				//--- ���� ��� �κ� ----------------------------------
		
				System.out.println("������������������������������������������");
				System.out.println("��       ���� ���      ��");
				System.out.println("������������������������������������������");
		
				for (int j=0; j<3; j++) {
					total = kors[j][0] + kors[j][1] + kors[j][2];
					avg = total / 3.0f;
					
					System.out.printf("<%d�г� �����> ----------------\n", j+1);
					
					for (int i=0; i<3; i++)
						System.out.printf("\t����%d : %3d\n", i+1, kors[j][i]);
 
					System.out.printf("\t���� : %3d\n", total);
					System.out.printf("\t��� : %6.9f\n", avg);
					System.out.println("��������������������������������������������������������\n");
				}
					
				break;
				
			case 3:
				System.out.println("Good Bye ~~~");
				//	System.exit(0); // �ý����� ���� 
				break ����;
				

			default:
				System.out.println("�Է� ���� 1~3 ������ �Է��� �� �ֽ��ϴ�.");

			}
	
		}

	}
}