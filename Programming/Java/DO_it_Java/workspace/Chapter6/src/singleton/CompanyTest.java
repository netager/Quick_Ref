package singleton;

import java.util.Calendar;
import java.util.Date;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		
		c1.companyName = "����";
		c1.companyCeoName = "����";
		c1.companyAddr = "���� ���ֽ� �Ⱥ���";
		
		c1.showCompanyInfo();
		c2.showCompanyInfo();
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getFirstDayOfWeek());
		
		Date date = cal.getTime();
		System.out.println(date.getDay());

		
		
	}

}
