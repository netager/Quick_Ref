package sec01_basicsyntax.EX03;

public class ConsoleOutput {

	public static void main(String[] args) {
		
		System.out.println("ȭ�����");	// ȭ�����
		System.out.println("ȭ��"+"���");	// ȭ�����
		System.out.println(3.8);		// 3.8
		System.out.println(3+5);		// 8
		System.out.println("ȭ��"+3);		// ȭ��3
		System.out.println("ȭ��"+3+5);	// ȭ��8  	--> String + int -> String + int --> String
		System.out.println(3+5+"ȭ��");	// 8ȭ�� 		--> int + int -> int + String --> String
		System.out.println();			// ���๮��
		
		int a = 3;
		String b = "ȭ��";
		System.out.println(a);			// 3
		System.out.println(b);			// ȭ��
		System.out.println(b+"���");		// ȭ�����
		System.out.println(a+b+"���");	// 3ȭ�����
		System.out.println();	
		
		System.out.print("ȭ��");
		System.out.print("���");
		System.out.print("3");
		System.out.print("\n");			// �����ض�
		
		System.out.printf("%d\n", 30);	// 10���� - 30
		System.out.printf("%o\n", 8);	//  8���� - 10
		System.out.printf("%x\n", 16);	// 16���� - 10
		
		System.out.printf("%s\n", "���");	// ���
		System.out.printf("%f\n", 5.8f);
		System.out.printf("%4.2f\n", 5.8f);
		System.out.printf("%d�� %4.2f\n", 4, 5.8);
		
	}

}
