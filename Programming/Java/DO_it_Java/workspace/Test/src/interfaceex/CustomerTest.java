package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		
		System.out.println("--------------------------------");
		// Buy buyer = new Customer();
		Buy buyer = customer;
		buyer.buy();
		
		System.out.println("--------------------------------");
		// Sell seller = new Customer();
		Sell seller = customer;
		seller.sell();
		
		customer.order();
		buyer.order();
		seller.order();

	}

}
