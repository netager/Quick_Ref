
public class Program {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int result = 0;
		try {
			result = Calculator.add(3,4);
			System.out.printf("add : %d\n", result);
			result = Calculator.sub(3,4);
		}
		catch(õ��_����_���� e) {
			System.out.println("[õ��_����_����] ���� 1000�� �Ѵ� ���� �Է��ϼ̽��ϴ�.");
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("[Exception e] �Է� ���� ������ �ֽ��ϴ�.");
		}
		finally {
			System.out.println("[finally] �Է� ���� ������ �ֽ��ϴ�.");
		}
		
		System.out.printf("sub : %d\n", result);
		result = Calculator.multi(3,4);
		System.out.printf("multi : %d\n", result);
		result = Calculator.div(3,3);
		System.out.printf("div : %d\n", result);

	}

}
