package session02.adapter_pattern.ch01_¿¹Á¦;

public class Main {

	public static void main(String[] args) {
		
		Adapter adapter = new AdapterImpl();
		
		System.out.println(adapter.twiceOf(100f));
		System.out.println(adapter.halfOf(80f));

		
		
	}

}
