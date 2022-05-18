package sec01_array.Ex10;

public class ArgumentOfMainMethod {

	public static void main(String[] args) {

		//#1. args(입력매개변수) 배열의 길이 구하기
		System.out.println(args.length);
		System.out.println("-------------------------------");
		
		//#2. 매개변수 출력 1
		for(int i=0; i<args.length;i++) {
			System.out.println(args[i]);
		}
		System.out.printf("args[1]+1 = %s, Integer.parseInt(args[1])+1args[1]+1 = %d\n", args[1]+1, Integer.parseInt(args[1])+1);
		System.out.println("-------------------------------");

		//#2. 매개변수 출력 2
		for(String s : args) {
			System.out.println(s);
		}
		System.out.println("-------------------------------");

	}

}
