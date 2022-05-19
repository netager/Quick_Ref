package sec01_accessmodifier.EX01.pack1;

public class B {
	
	public void print() {
		A a = new A();
		
		System.out.println(a.a);	// 가능 
		System.out.println(a.b);  	// 가능
		System.out.println(a.c);	// 가능
//		System.out.println(a.d); 	// 불가능
	}

}
