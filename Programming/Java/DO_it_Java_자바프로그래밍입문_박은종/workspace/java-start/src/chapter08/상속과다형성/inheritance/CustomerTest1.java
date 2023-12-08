package chapter08.상속과다형성.inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10100, "Lee");
//		customerLee.setCustomerID(10100);
//		customerLee.setCustomerName("Lee");

		VIPCustomer customerKim = new VIPCustomer(10101, "Kim", 100);
//		customerKim.setCustomerID(10101);
//		customerKim.setCustomerName("Kim");
		customerKim.bonusPoint = 100;

		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());

	}

}
