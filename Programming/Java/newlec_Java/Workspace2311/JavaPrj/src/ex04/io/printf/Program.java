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
//		avg = (float)(total / 3.0);
		avg = total / 3.0f;

		//--- 성적 출력 부분 ----------------------------------
		System.out.println("┌───────────────────┐");
		System.out.println("│     \"성적 출력\"      │");
		System.out.println("└───────────────────┘");

		System.out.printf("\t국어1 : %3d\n", kor1);
		System.out.printf("\t국어2 : %3d\n", kor2);
		System.out.printf("\t국어3 : %3d\n", kor3);
		System.out.printf("\t총점 : %3d\n", total);
		System.out.printf("\t평균 : %6.9f\n", avg);
		System.out.println("─────────────────────");

		System.out.printf("%3$3d %2$3d %1$3d\n", 1,2,3);

		System.out.printf("%5.2f", 2332387.3433434);
		System.out.print(80+1);
		System.out.write(80);
		System.out.flush();
		
		
	}
}