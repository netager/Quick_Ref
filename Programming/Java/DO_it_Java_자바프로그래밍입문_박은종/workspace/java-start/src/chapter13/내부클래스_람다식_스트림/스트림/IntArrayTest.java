package chapter13.����Ŭ����_���ٽ�_��Ʈ��.��Ʈ��;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,};
		
		
		// Arrays.stream() - stream ������
		// -----------------------------
		IntStream stream = Arrays.stream(arr);
		
		// stream ù��° ���
		// --------------
		int sum = stream.sum();
		System.out.println(sum);
		
		// stream ����� ���� �߻� ��.
		boolean occureError = false;
		int count = 0;
		
		if(occureError) {
			// stream �ι�° ���
			// -------------------- 
			count = (int)stream.count();
			System.out.println(count);
		}
		else {
			// �ѹ� ����� stream�� ����� �ؾ� ����� �� ����
			int count2;
			count2 = (int)Arrays.stream(arr).count();
			System.out.println(count2);
		}

	}

}
