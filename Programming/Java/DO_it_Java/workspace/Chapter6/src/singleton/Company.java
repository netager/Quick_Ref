//
// Singleton Disign Pattern
//

package singleton;

public class Company {
	
	String companyName;
	String companyAddr;
	String companyCeoName;
	
	private static Company instance = new Company(); 
	private Company() {}  // private Constructor ����. �ܺο��� Company() ������ ��� ���ϰ� ��.
	                      // Company Ŭ���� ���ο����� ��� ����. 
	
	public static Company getInstance() { // ��ü�� �������� �ʰ� ����ϴ� ������� static ���.
	
		if (instance == null)
			instance = new Company();
		
		return instance;
	}
	
	public void showCompanyInfo() {
		System.out.println("ȸ���� �̸��� " + companyName + " �̰� CEO �̸���" + companyCeoName  
				+ "�̸�, �ּҴ� " + companyAddr + "�Դϴ�.");
	}
	

//	private static Company instance = new Company();
//	private Company() {}
//
//	public static Company getInstance() {
//		if(instance == null)
//			instance = new Company();
//		return instance;
//	}
}
