package sec02_externalclass.EX01;

// �ܺ�Ŭ���� ���� (public�� ������ �� ����)
class A {
	int m = 3;
	int n = 4;
	
	void print() {
		System.out.println(m+", "+n);
	}
}


public class ExternalClass_1 {

	public static void main(String[] args) {
		
		A a = new A();
		
		a.print();

	}

}
