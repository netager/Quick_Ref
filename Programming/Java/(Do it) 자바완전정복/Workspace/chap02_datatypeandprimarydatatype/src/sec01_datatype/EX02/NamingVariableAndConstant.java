package sec01_datatype.EX02;

public class NamingVariableAndConstant {

	public static void main(String[] args) {
		
		//#1. ������ �̸�
		boolean aBcD;		// ������ ������ �ǰ���� ����
		byte ������;
		short _abcd;
		char $ab_cd;
//		int 3abcd ; 		// �Ұ��� - ���ڴ� ���� �տ� �� �� ����
		long abcd3;
//		float int;			// �Ұ��� - �ڹٿ��� ����ϴ� Ű���� - �����
		double main;		// ���� - �޼��� �̸��� �����̸��� �����ص� ���� 
		// int my Work 		// �Ұ��� - �����̽� Ư��Ű�� ����
		String myClassName;
		int ABC; 			// ���������� �ǰ���� ����
		
		
		//#2. ����̸�
		final double PI;
		final int MY_DATA;
		final float myData; // ������ ������ �ǰ���� ����
		

		int abc = 3;
		abc(); //�޼��� ȣ��
		System.out.println(abc); // ������ ����ϴ� ���
		
	}

	private static void abc() {
		System.out.println("Call abc()");
		
	}
	
}
