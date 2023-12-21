package session06.prototype_pattern.ch02_¿¹Á¦;

public class Triangle implements Shape {

	Point point1, point2, point3;
	
	public Triangle(Point point1, Point point2, Point point3) {

		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
		
	}
	
	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		
	}

	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}
	
	public Triangle copy() throws CloneNotSupportedException {
		Triangle triangle = (Triangle) clone();

		return triangle;
	}

	
	
	

}
