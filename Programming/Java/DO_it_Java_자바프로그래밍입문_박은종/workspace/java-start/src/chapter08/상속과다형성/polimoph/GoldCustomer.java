package chapter08.��Ӱ�������.polimoph;

public class GoldCustomer extends Customer {
	
	int agentID;
	double saleRatio;
	
	
	public GoldCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.03;
		saleRatio = 0.05;
		this.agentID = agentID;

		
//		System.out.println("VIPCustomer(int, String) ������ ȣ�� : " + customerName);
	}
	
	public int getAgentID() {
		return agentID;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * saleRatio);
		return super.calcPrice(price);
	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo();
	}

	
//	public int calcPrice(int price) {
//		bonusPoint += price * bonusRatio;
//		price -= (int)(price * saleRatio);
//		return price;
		
	
}
