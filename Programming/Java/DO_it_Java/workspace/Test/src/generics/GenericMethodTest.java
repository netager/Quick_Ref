package generics;

public class GenericMethodTest {

	public static void main(String[] args) {

		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 10.0);
		Point<Integer, Double> p2 = new Point<Integer, Double>(10, 1.0);
		
		double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
		System.out.println("�� ������ ������� �簢���� ���̴� " + rect + "�Դϴ�.");
		
	}

}