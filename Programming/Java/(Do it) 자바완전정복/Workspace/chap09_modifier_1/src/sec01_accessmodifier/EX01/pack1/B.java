package sec01_accessmodifier.EX01.pack1;

public class B {
	
	public void print() {
		A a = new A();
		
		System.out.println(a.a);	// ���� 
		System.out.println(a.b);  	// ����
		System.out.println(a.c);	// ����
//		System.out.println(a.d); 	// �Ұ���
	}

}
