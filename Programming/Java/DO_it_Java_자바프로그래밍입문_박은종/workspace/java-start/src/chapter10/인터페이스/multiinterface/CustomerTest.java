package chapter10.인터페이스.multiinterface;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		System.out.println("--------------------------------");
		
		customer.buy();
		customer.sell();
		
		customer.order();
		Buy buyer1 = customer;
		buyer1.order();
		
		Sell seller1 = customer;
		seller1.order();
		
		customer.test();
		
		
		
	}

}
