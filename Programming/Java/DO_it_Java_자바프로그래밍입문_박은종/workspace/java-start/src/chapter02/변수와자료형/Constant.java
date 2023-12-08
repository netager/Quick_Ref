package chapter02.변수와자료형;

public class Constant {

	public static void main(String[] args) {

		final int MAX_NUM = 100;
		final float PI = 3.14f;
		
		final int STUDENT_NUM = 30;
		
		int num = 0;
	
		if (num == STUDENT_NUM) {}
		
		for(int i=0; i<STUDENT_NUM; i++) {
			System.out.println(i+1);
		}
		
		System.out.println(STUDENT_NUM);

	}

}
