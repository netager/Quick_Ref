package ex06.operator;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		Scanner scan =  new Scanner(System.in);

		kor1 = 0;
		kor2 = 0;
		kor3 = 0;

		//--- ���� �Է� �κ� ----------------------------------
		System.out.println("������������������������������������������");
		System.out.println("��       ���� �Է�      ��");
		System.out.println("������������������������������������������");
		System.out.print("����1 :");
		kor1 = scan.nextInt();
		
		System.out.println(0<=kor1 && kor1<=100);
				
		System.out.print("����2 :");
		kor2 = scan.nextInt();
		System.out.print("����3 :");
		kor3 = scan.nextInt();

		
		//--- ���� ��� �κ� ----------------------------------
		total = kor1 + kor2 + kor3;
//		avg = (float)(total / 3.0);
		avg = total / 3.0f;

		System.out.println("������������������������������������������");
		System.out.println("��       ���� ���      ��");
		System.out.println("������������������������������������������");

		System.out.printf("\t����1 : %3d\n", kor1);
		System.out.printf("\t����2 : %3d\n", kor2);
		System.out.printf("\t����3 : %3d\n", kor3);
		System.out.printf("\t���� : %3d\n", total);
		System.out.printf("\t��� : %6.9f\n", avg);
		System.out.println("������������������������������������������");

		// ���� �������� ������ ���� ����
		int i = 3;
		i++;
		System.out.println(i);    	// Print 4
		
		++i;
		System.out.println(i); 		// Print 5
		
		System.out.println(++i);	// Print 6
		System.out.println(i++);	// print 6
		System.out.println(i);		// Print 7
		
	}
}