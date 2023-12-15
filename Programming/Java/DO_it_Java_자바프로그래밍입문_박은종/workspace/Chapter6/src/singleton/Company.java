//
// Singleton Disign Pattern
//

package singleton;

public class Company {
	
	String companyName;
	String companyAddr;
	String companyCeoName;
	
	private static Company instance = new Company(); 
	private Company() {}  // private Constructor 선언. 외부에서 Company() 생성자 사용 못하게 함.
	                      // Company 클래스 내부에서는 사용 가능. 
	
	public static Company getInstance() { // 객체를 생성하지 않고도 사용하는 방법으로 static 사용.
	
		if (instance == null)
			instance = new Company();
		
		return instance;
	}
	
	public void showCompanyInfo() {
		System.out.println("회사의 이름은 " + companyName + " 이고 CEO 이름은" + companyCeoName  
				+ "이며, 주소는 " + companyAddr + "입니다.");
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
