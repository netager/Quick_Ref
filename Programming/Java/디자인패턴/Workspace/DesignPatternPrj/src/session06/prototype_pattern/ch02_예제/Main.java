package session06.prototype_pattern.ch02_¿¹Á¦;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		Point point1 = new Point(1,1);
		Point point2 = new Point(2,2);
		Point point3 = new Point(3,3);
		
		Triangle triangle1 = new Triangle(point1,point2,point3);
		
		System.out.println(triangle1.getPoint1()+ ","+
							triangle1.getPoint2()+ ","+
							triangle1.getPoint3());

		Triangle triangle2 = triangle1.copy();
		
		triangle2.setPoint1(new Point(2,2));
		triangle2.setPoint2(new Point(3,3));
		triangle2.setPoint3(new Point(4,4));
		
		System.out.println(triangle2.getPoint1()+ ","+
							triangle2.getPoint2()+ ","+
							triangle2.getPoint3());
	}

}
