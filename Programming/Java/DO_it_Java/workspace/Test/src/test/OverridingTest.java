package test;

public class OverridingTest {

	public static void main(String[] args) {

		int price;
//		
//		Customer customerLee = new Customer(100010, "LEE");
//		price = customerLee.calcPrice(10000);
//		System.out.println("���ұݾ��� " + price + "�̰�, " + customerLee.showCustomerInfo());
//		
//		VIPCustomer customerKim = new VIPCustomer(100020, "Kim", 100);
//		price = customerKim.calcPrice(10000);
//		System.out.println("���ұݾ��� " + price + "�̰�, " + customerKim.showCustomerInfo());

		Customer customerWho = new VIPCustomer(100010, "Who", 100);
		price = customerWho.calcPrice(10000);
		System.out.println("���ұݾ��� " + price + "�̰�, " + customerWho.showCustomerInfo());	
		
		Customer customerGold = new GoldCustomer();
		
	}

}
