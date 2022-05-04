package ex4.io.printf;

import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;

		kor1 = 50;
		kor2 = 60;
		kor3 = 80;

		total = kor1 + kor2 + kor3;
//		avg = total / 3;    // ������ ������ ������ ���� �κи� ����.
//		avg = total / 3.0;  // Ÿ���� ���� ���� ������ �ȵ�
//		avg = (float)total / 3.0;
		avg = (float)(total / 3.0);		
//		avg = total / 3f;
		
		// ----- ���� ��� �κ� ------------------------------------
		System.out.println("����������������������������������������������������");
		System.out.println("��          �������         ��");
		System.out.println("����������������������������������������������������");
		System.out.printf("\t����1 : %3d\n", kor1);
		System.out.printf("\t����2 : %3d\n", kor2);
		System.out.printf("\t����3 : %3d\n", kor3);
		System.out.printf("\t����  : %3d\n", total);
		System.out.printf("\t���  : %6.2f\n", avg);
		System.out.printf("��������������������������������������");
		
		System.out.print(80);
		System.out.write(80);
		System.out.flush();
		System.out.println();
		
		System.out.printf("1:%d\n2:%10d\n3:%-10d\n",3,3,3);
		System.out.printf("%5.2f\n", 87.98953231);

		System.out.printf("%2$d %3$d %1$d\n", 1, 2, 3);		
		System.out.printf("%1$d %1$d %1$d\n", 1);
		
		int code = 0;
		try {
			code = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(code);
		System.out.write(code);
		System.out.flush();
		
	}

}