package session02.adapter_pattern.ch01_¿¹Á¦;

public class Main {

	public static void main(String[] args) {

		System.out.println(Math.twoTime(100));
		System.out.println(Math.half(80));
		System.out.println("---------------------------");
		
		Adapter adapter = new AdapterImpl();
		
		System.out.println(adapter.twiceOf(100.0f));
		System.out.println(adapter.halfOf(80f));
		System.out.println(adapter.halfOf(80f));
		System.out.println(adapter.halfOf(80f));
		System.out.println(adapter.halfOf(80f));

	}

}
