package chapter10.인터페이스.multiinterface;

public interface Buy {
	
	void buy();
	
	default void order() {
		System.out.println("Buy order() 구매주문");
	}
	
	default void test() {
		System.out.println("Buy test() ~~~");
	}

}
