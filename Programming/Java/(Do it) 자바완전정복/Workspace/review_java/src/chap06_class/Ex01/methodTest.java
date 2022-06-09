package chap06_class.Ex01;

public class methodTest {
	public static void main(String[] args) {
		method1(1,2);
		method1(1,2,3);
		method1();
		
		method2("안녕", "방가");
		method2("땡큐", "베리", "감사");
		method2();

	}

	public static void method1(int...values) {
		System.out.println("매개변수 길이 : "+values.length);
		for(int i=0; i<values.length;i++) {
			System.out.print(values[i]+" ");
		}
		System.out.println();	
	}
	
	public static void method2(String...values) {
		System.out.println("매개변수 길이 : "+values.length);
		for(int i=0; i<values.length;i++) {
			System.out.print(values[i]+" ");
		}
			System.out.println();	
	}
}
