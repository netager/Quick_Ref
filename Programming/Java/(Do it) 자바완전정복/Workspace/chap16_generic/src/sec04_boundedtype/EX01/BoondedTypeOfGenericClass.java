package sec04_boundedtype.EX01;

class A {}

class B extends A {}
class C extends B {}

class D <T extends B> {	//B 또는 B를 상속받은 C를 사용할 수 있다.
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
}

public class BoondedTypeOfGenericClass {
	public static void main(String[] args) {
//		D<A> d1 = new D<>();	// 불가능
		D<B> d2 = new D<>();	// 
		D<C> d3 = new D<>();	// 
		D d4 = new D();			// 생략하면 D<B> d4 = D<>(); 와 같음. 생략되면 올 수 있는 최상위 클래스를 컴파일러가 자동으로 넣어줌.
		
		d2.set(new B());
		d2.set(new C());
		
//		d3.set(new B());	// 불가능
		d3.set(new C());
		
		d4.set(new B());
		d4.set(new C());
	}
}
