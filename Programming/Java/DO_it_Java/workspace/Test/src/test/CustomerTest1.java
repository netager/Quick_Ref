package test;

public class CustomerTest1 {

	public static void main(String[] args) {

//		Customer customerLee = new Customer();
//		customerLee.setCustomerID(10100);
//		customerLee.setCustomerName("Lee");

		Customer customerKim = new VIPCustomer(10100, "Kim");
//		customerKim.setCustomerID(10100);
//		customerKim.setCustomerName("Kim");
		
		customerKim.
		
		customerKim.bonusPoint = 1000;

//		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
	}	
}
