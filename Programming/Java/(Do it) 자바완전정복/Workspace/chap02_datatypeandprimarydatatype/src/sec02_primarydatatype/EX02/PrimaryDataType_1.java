package sec02_primarydatatype.EX02;

public class PrimaryDataType_1 {
	public static void main(String[] args) {
		
		//#1. boolean : true / false
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		
		//#2. ����(byte, short, int, long) : ���� ���� / 0 / ���� ����
		byte value1 = 10;
		short value2 = -10;
		int value3 = 100;
		long value4 = -100L; 	// L �����ص� ���� ����. L�� ������ int�� �ν� 
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
	
		//#3. �Ǽ�(float, double) : ���� �Ǽ� / 0 / ���� �Ǽ�
		float value5 = 1.2F;
		double value6 = -1.5;
		double value7 = 5; 		// ������ �Ǽ��� �־ ���� ����
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);	// 5�� �Ǽ��� ����(5.0)�ؼ� ���� 
		
		
	}

}
