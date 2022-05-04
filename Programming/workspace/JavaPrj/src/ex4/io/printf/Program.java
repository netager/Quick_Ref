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
//		avg = total / 3;    // 정수를 정수로 나누면 정수 부분만 나옴.
//		avg = total / 3.0;  // 타입이 같지 않은 연산을 안됨
//		avg = (float)total / 3.0;
		avg = (float)(total / 3.0);		
//		avg = total / 3f;
		
		// ----- 성적 출력 부분 ------------------------------------
		System.out.println("┌────────────────────────┐");
		System.out.println("│          성적출력         │");
		System.out.println("└────────────────────────┘");
		System.out.printf("\t국어1 : %3d\n", kor1);
		System.out.printf("\t국어2 : %3d\n", kor2);
		System.out.printf("\t국어3 : %3d\n", kor3);
		System.out.printf("\t총점  : %3d\n", total);
		System.out.printf("\t평균  : %6.2f\n", avg);
		System.out.printf("───────────────────");
		
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