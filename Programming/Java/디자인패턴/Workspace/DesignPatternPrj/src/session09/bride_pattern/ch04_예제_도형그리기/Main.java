package session09.bride_pattern.ch04_예제_도형그리기;

public class Main {

	public static void main(String[] args) {

		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(200, 200, 20, new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
	}

}
