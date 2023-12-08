package chapter10.인터페이스.multiinterface;

public interface Sell {

	void sell();
	
	default void order() {
		System.out.println("Sell order() 구매주문");
	}
}
