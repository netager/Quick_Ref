package ex04.io.printf;
public class Program {
	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;
		
		total = kor1 + kor2 + kor3;
		avg = total / 3.0f;
		
		//---- 성적 출력 부분 ---------------------------------
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적 출력                           │");
		System.out.println("└───────────────────────────┘");
		
		System.out.printf("%2$d %3$d %1$d\n",1,2,3);
		System.out.printf("%1$d %1$d %1$d\n",3);
		
		System.out.printf("\t국어1 : %3d\n", kor1);
		System.out.printf("\t국어2 : %3d\n", kor2);
		System.out.printf("\t국어3 : %3d\n", kor3);
		System.out.printf("\t총    점 : %3d\n", total);
		
		// 결과값이 63.00 나옴 - 정수를 정수로 나누면 정수가 나옴 ~ < total / 3 >
		// 3을 3.0으로 변경하면  3.0은 double이고 avg 는 float 이므로 오류
		// avg = (float)total / 3.0;  -->  이것도 문제
		// avg = (float)(total/3.0);  --> 정상
		// avg = total/3.0f           --> 정상
		System.out.printf("\t평    균 : %6.2f\n", avg);
		System.out.println("─────────────────────────────");
		
	}
}