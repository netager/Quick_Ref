package ex05.io.scanner;

import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;

		Scanner scan = new Scanner(System.in);	

		kor1 = 0;
		kor2 = 0;
		kor3 = 0;

		// ----- ���� �Է� �κ� ------------------------------------
		System.out.println("����������������������������������������������������");
		System.out.println("��          �����Է�         ��");
		System.out.println("����������������������������������������������������");
		System.out.print("����1:");
		kor1 = scan.nextInt();
		System.out.print("����2:");
		kor2 = scan.nextInt();
		System.out.print("����3:");
		kor3 = scan.nextInt();
		
		
		// ----- ���� ��� �κ� ------------------------------------

//		avg = total / 3;    // ������ ������ ������ ���� �κи� ����.
//		avg = total / 3.0;  // Ÿ���� ���� ���� ������ �ȵ�
//		avg = (float)total / 3.0;
//		avg = (float)(total / 3.0);
		
		total = kor1 + kor2 + kor3;
		avg = total / 3f;
		
		System.out.println("����������������������������������������������������");
		System.out.println("��          �������         ��");
		System.out.println("����������������������������������������������������");
		System.out.printf("\t����1 : %3d\n", kor1);
		System.out.printf("\t����2 : %3d\n", kor2);
		System.out.printf("\t����3 : %3d\n", kor3);
		System.out.printf("\t����  : %3d\n", total);
		System.out.printf("\t���  : %6.2f\n", avg);
		System.out.printf("����������������������������������������������������");
		
	}

}