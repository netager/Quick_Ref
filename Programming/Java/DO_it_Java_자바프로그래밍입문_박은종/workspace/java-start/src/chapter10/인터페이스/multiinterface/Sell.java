package chapter10.�������̽�.multiinterface;

public interface Sell {

	void sell();
	
	default void order() {
		System.out.println("Sell order() �����ֹ�");
	}
}
