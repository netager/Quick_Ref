package test1;

public class VIPCustomer extends Customer {

	int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
		System.out.println("VIPCustomer() 호출");
	}	
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price -= price*saleRatio;
	}
	
	public int getAgentID() {
		return agentID;
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 아이디는 " + agentID + "입니다.";
	}
	
	
}
