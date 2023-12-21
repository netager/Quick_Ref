package session09.bride_pattern.ch04_예제_도형그리기;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {

		System.out.println("Drawing Circle[color: red, radisu: "+radius+", x: "+x+", "+ "y: "+y+"]");
		
	}

}
