package chapter08.상속과다형성.witharraylist;

public class GoldCustomer extends Customer {
	
	double saleRatio;
	
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;

	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo();
	}
	
}
