package chapter02.�������ڷ���;

public class BinaryTest2 {

	public static void main(String[] args) {

		// 1�� ���� : ���� �������� �ݴ��(0->1, 1->0���� ��ȯ)
		// 2�� ���� : ��ȯ�� ���� 1�� ���Ѵ�.
		int num1 = 0B00000000000000000000000000000101;
		int num2 = 0B11111111111111111111111111111011; // 2�� ����
		
		
		int sum = num1 + num2;
		System.out.println(num1+","+num2+","+sum);
		

	}

}
