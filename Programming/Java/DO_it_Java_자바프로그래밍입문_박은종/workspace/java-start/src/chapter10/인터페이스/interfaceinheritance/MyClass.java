package chapter10.인터페이스.interfaceinheritance;

public class MyClass implements MyInterface {

	@Override
	public void x() {

		System.out.println("X x()");
		
	}

	@Override
	public void y() {

		System.out.println("Y y()");
		
	}

	@Override
	public void myMethod() {

		System.out.println("MyInterface myMethod()");
		
	}
	
	public void showInfo() {
		System.out.println("MyClass showInfo() ~~~~~");
	}
	
	public static void main(String[] args) {

		X x = new MyClass();
		x.x();
//		x.y();
//		x.myMethod();
		Y y = new MyClass();
		y.y();
		System.out.println("------------------------");		

		MyInterface myInterface = new MyClass();
		myInterface.x();
		myInterface.y();
		myInterface.myMethod();
		
		if (myInterface instanceof MyClass) {
			MyClass myClass1 = (MyClass)myInterface;
			myClass1.showInfo();
		}
		System.out.println("------------------------");

		MyClass myClass = new MyClass();
		myClass.x();
		myClass.y();
		myClass.myMethod();
		myClass.showInfo();
		System.out.println("------------------------");


	}

}
