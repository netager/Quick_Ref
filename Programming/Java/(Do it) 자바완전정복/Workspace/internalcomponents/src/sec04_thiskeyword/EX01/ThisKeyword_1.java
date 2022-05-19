package sec04_thiskeyword.EX01;

// 클래스 내부에서 필드, 메서드 앞에 붙는 자동으로 붙는 this 키워드

class A {
	int m;
	int n;
	
	void init(int a, int b) {
		m = a; // 실제 실행되는 것은 this.m = a;
		n = b; // 실제 실행되는 것은 this.n = b;
	}
	
	void work(int a, int b) {
		init(a, b); // this.init(2,3);
	}
	
}


public class ThisKeyword_1 {
	public static void main(String[] args) {
		
		A a = new A();
		
		System.out.println(a.m);
		System.out.println(a.n);
		
		a.work(1, 2);
		
		System.out.println(a.m);
		System.out.println(a.n);
		

	}

}
