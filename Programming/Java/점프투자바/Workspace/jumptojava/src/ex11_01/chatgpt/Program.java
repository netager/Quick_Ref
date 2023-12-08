package ex11_01.chatgpt;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Program {
	public static void main(String[] args) {

		// �� ��¥�� ����
		LocalDate date1 = LocalDate.of(2023, 1, 1);
		LocalDate date2 = LocalDate.of(2023, 12, 31);
	     
		// �� ��¥ ���� ���� ���
		long daysDifference = ChronoUnit.DAYS.between(date1, date2);
		long monthsDifference = ChronoUnit.MONTHS.between(date1, date2);
		long yearsDifference = ChronoUnit.YEARS.between(date1, date2);
	
	    // ��� ���
	    System.out.println("Days Difference: " + daysDifference + " days");
	    System.out.println("Months Difference: " + monthsDifference + " months");
	    System.out.println("Years Difference: " + yearsDifference + " years");
	}
}
