package chapter06.Ŭ�����Ͱ�ü2.singleton;

public class Company {

	private static Company instance = new Company();
	
	public static Company getInstance() {
		if(instance == null)
			instance = new Company();
		return instance;

	}
}
