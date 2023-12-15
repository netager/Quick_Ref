package ex07_031.singleton;

class Singleton {
	
	private static Singleton one;
	private Singleton() {
		System.out.println("Singleton()");
	}
	
	public static Singleton getInstance() {
		
		if(one==null) {
			one = new Singleton();
		}
		return one;
	}
}	

public class Program { 	
	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstance();
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		System.out.println(singleton1 == singleton2);
	
	}
	
}
