package chapter08.상속과다형성.witharraylist;

public class VIPCustomer extends Customer {
	
	int agentID;
	double saleRatio;
	
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;

		
//		System.out.println("VIPCustomer(int, String) 생성자 호출 : " + customerName);
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
		
	}

	@Override
	public String showCustomerInfo() {
		
		return super.showCustomerInfo() + "담당 상담원 아이디는 " + agentID + "입니다.";
	}

	


	
}
