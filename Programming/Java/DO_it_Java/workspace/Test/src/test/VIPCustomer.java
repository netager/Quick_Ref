package test;

public class VIPCustomer extends Customer {

	int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
		System.out.println("VIPCustomer() »£√‚");
	}	
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price -= price*saleRatio;
	}
	
	public int getAgentID() {
		return agentID;
	}
}
