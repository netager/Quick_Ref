
public class Calculator {
	public Calculator() {
	}

	public static int add(int x, int y) throws �������Ǵ¿��� {
		int result = x + y;
		if(result > 1000)
			throw new õ��_����_����();
		
		if(result < 0)
			throw new �������Ǵ¿���();
		return result;
	}

	public static int sub(int x, int y) throws �������Ǵ¿��� {
		int result = x - y;
		if(result < 0)
			throw new �������Ǵ¿���();

		return result;
	}

	public static int multi(int x, int y) {
		return x * y;
	}

	public static int div(int x, int y) {
		return x / y;
	}

}