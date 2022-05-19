package sec04_thiskeyword.EX02;

// 클래스 내부에서 필드, 메서드 앞에 붙는 자동으로 붙는 this 키워드

class A {
	int m;
	int n;
	
	void init(int m, int n) {
		m = m; // local m = local m
		n = n; // local n = local n
	}
	
	void work(int a, int b) {
		init(a, b); // this.init(2,3);
	}
	
}

class B {
	int m;
	int n;
	
	void init(int m, int n) {
		this.m = m; // field(member) m = local m
		this.n = n; // field(member) n = local n
	}
	
	void work(int a, int b) {
		init(a, b); 
	}
	
}


public class ThisKeyword_2 {
	public static void main(String[] args) {
		
		A a = new A();
		a.init(2, 3);
		System.out.println(a.m);
		System.out.println(a.n);
		
		B b = new B();
		b.init(2, 3);
		System.out.println(b.m);
		System.out.println(b.n);
		
		

	}

}
