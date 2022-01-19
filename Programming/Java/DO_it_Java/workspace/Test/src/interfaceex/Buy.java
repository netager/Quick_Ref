package interfaceex;

public interface Buy {
	
	public void buy();
	
	default void order() {
		
		System.out.println("구매주문");
	}

}
