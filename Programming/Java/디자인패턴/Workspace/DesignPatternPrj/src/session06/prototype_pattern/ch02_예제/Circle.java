package session06.prototype_pattern.ch02_¿¹Á¦;

public class Circle implements Shape {

	int x, y, r;
	
	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		
	}
	
	public Circle(int x, int y, int r) {

		this.x = x;
		this.y = y;
		this.r = r;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public Circle copy() throws CloneNotSupportedException {
		Circle circle = (Circle) clone();
		circle.x += 1;
		circle.y += 1;
		
		return circle;
	}

}
