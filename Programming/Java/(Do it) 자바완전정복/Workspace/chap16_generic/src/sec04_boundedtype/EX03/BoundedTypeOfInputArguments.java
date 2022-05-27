package sec04_boundedtype.EX03;

class A {}

class B extends A {}

class C extends B {}

class D extends C {}

class Goods<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
}

class Test {
	void method1(Goods<A> g) {
		System.out.println(g);
	}				//case1: A
	void method2(Goods<?> g) {}				//case2: A, B, C, D, String, Integer, ... - 모든 객체가 올 수 있음.
	void method3(Goods<? extends B> g) {} 	//case3: B, C, D - B를 포함한 B의 하위 클래스만 올 수 있음.
	void method4(Goods<? super B> g) {}		//case4: B, A - B를 포함한 B의 부모 클래스만 올 수 있음.
}

public class BoundedTypeOfInputArguments {
	public static void main(String[] args) {
		
		Test t = new Test();
		
		//#1. case1
		t.method1(new Goods<A>());
		
		//#2. case2
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		t.method2(new Goods<String>());
		t.method2(new Goods<Integer>());
		t.method2(new Goods<Object>());
		
		//#3. case3
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());

		//#4. case4
		t.method4(new Goods<B>());
		t.method4(new Goods<A>());
		
	}
}
