package chapter08.상속과다형성.polimoph;

public class CustomerTest1 {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10100, "Lee");

		Customer customerKim = new VIPCustomer(10101, "Kim", 100);
		customerKim.bonusPoint = 100;

		Customer customerPark = new GoldCustomer(100022, "Park", 200);
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		System.out.println(customerPark.showCustomerInfo());

	}

}
