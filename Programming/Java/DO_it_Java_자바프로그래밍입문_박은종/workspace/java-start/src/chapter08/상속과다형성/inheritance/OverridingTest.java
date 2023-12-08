package chapter08.상속과다형성.inheritance;

public class OverridingTest {

	public static void main(String[] args) {

//		Customer customerLee = new Customer(100010, "LEE");
//		int price = customerLee.calcPrice(10000);
//		System.out.println("지불금액은 " + price + "이고, " + customerLee.showCustomerInfo());
//
//		VIPCustomer customerKim = new VIPCustomer(100011, "KIM", 100);
//		price = customerKim.calcPrice(10000);
//		System.out.println("지불금액은 " + price + "이고, " + customerKim.showCustomerInfo());

		Customer customerWho = new VIPCustomer(100010, "Who", 100);
		int price = customerWho.calcPrice(10000);
		System.out.println("지불금액은 " + price + "이고, " + customerWho.showCustomerInfo());
	}

}
