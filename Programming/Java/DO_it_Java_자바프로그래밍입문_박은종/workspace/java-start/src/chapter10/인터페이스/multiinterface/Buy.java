package chapter10.�������̽�.multiinterface;

public interface Buy {
	
	void buy();
	
	default void order() {
		System.out.println("Buy order() �����ֹ�");
	}
	
	default void test() {
		System.out.println("Buy test() ~~~");
	}

}
