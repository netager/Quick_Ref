package sec02_primarydatatype.EX03;

public class PrimaryDataType_2 {

	public static void main(String[] args) {
		
		//#4. ����(char) : ����, ����
		//#4-1. ���ڷ� �����ϴ� ���
		char value1 = 'A';
		char value2 = '��';
		char value3 = '3';
		System.out.println(value1); // A
		System.out.println(value2); // ��
		System.out.println(value3); // 3
		System.out.println((int)value3);
		System.out.println("---------------------------------------------");
		
		
		//4-2. ������ �����ϴ� ���
		char value4 = 65;
		char value5 = '\uac00';
		char value6 = 51;
		System.out.println(value4); // A
		System.out.println(value5); // ��
		System.out.println(value6); // 3
		System.out.println("---------------------------------------------");
		
		
		//4-3. �����ڵ�� ���� �Է�
		char value7 = '\u0041';
		char value8 = 0x0041;
		char value9 = '\uac00';
		char value10 = 0xac00;
		char value11 = '\u0033';
		char value12 = 0x0033;
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);
		System.out.println(value11);
		System.out.println(value12);
		System.out.println("---------------------------------------------");
		
		char value20 = 'A';
		char value21 = 65;
		char value22 = '\u0041';
		char value23 = 0x0041;
		System.out.println(value20);
		System.out.println(value21);
		System.out.println(value22);
		System.out.println(value23);
		System.out.println("---------------------------------------------");
		
		
	}

}
