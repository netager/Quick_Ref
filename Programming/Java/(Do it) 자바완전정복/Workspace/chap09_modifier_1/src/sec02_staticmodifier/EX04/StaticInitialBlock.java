package sec02_staticmodifier.EX04;

// 정적 초기화 블록

class A {
	int a;
	static int b;
	
	static { 	// static 필드의 초기화는 static {} 내에서 수행
		b = 5;
		System.out.println("클래스 A가 로딩되었습니다.");
	}

	A() {
		a = 3; // 인스터스 필드 초기화는 생성자에서 일반적으로 수행

	}
}

public class StaticInitialBlock {

	public static void main(String[] args) {
		System.out.println(A.b);
		A a1 = new A();
		System.out.println(a1.a);
		System.out.println(a1.b);
		

	}

}
