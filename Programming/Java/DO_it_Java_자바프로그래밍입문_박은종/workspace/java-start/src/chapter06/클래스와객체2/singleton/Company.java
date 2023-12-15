package chapter06.클래스와객체2.singleton;

public class Company {

	private static Company instance = new Company();
	
	public static Company getInstance() {
		if(instance == null)
			instance = new Company();
		return instance;

	}
}
