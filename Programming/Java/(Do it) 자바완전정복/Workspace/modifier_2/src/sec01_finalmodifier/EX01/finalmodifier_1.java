package sec01_finalmodifier.EX01;

// final �� ���� ����� ���� ���� ������ �� ����.
// final �ʵ�� �����ϸ鼭 �ʱ�ȭ �ϴ��� �����ϸ鼭 �����ڿ��� �ʱ�ȭ �ؾ� �Ѵ�. �� ���Ŀ� �����ϸ� ���� �߻�.
class A1 {
	int a = 3;
	final int b = 5;
	
	A1() { 
	
	}
}

class A2 {
	int a;
	final int b;
	
	A2() { 
		a = 3;
		b = 5;
	
	}
}

class A3 {
	int a = 3;
	final int b = 5;
	
	A3() { 
		a = 5;
//		b = 5;	// ���� �߻�. final �ʵ�� �ѹ� ������ ���� �ٲܼ� ����. (���� ����� ���� ���� ������ �� ����)
	
	}
}

class B {
	void bcd() {
		int a = 3;
		final int b = 5;	// ��������
		
		a = 5;
//		b = 5;	// ���� �߻�. final �����̹Ƿ� ����
		
	}
}


public class finalmodifier_1 {
	public static void main(String[] args) {
		
		//#1. ��ü ���� 
		A1 a1 = new A1();
		a1.a = 7;
//		a1.b = 9;	// ���� �߻�. final �ʵ�� �ѹ� ������ ���� �ٲܼ� ����.

		//#1. ��ü ���� 
		A2 a2 = new A2();
		a2.a = 7;
//		a2.b = 9;	// ���� �߻�. final �ʵ�� �ѹ� ������ ���� �ٲܼ� ����.

	}
}
