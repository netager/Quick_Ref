package chapter06.클래스와객체2.thisex;

class Birthday {
	int day;
	int month;
	int year;
	
	public Birthday() {
		this(2023);
		
	}
	
	public Birthday(int year) {
		this.year = year;
	}
	
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
	public void printBirthday() {
		System.out.println(year + month + day);
	}
}


public class ThisExample {

	public static void main(String[] args) {
		
		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		System.out.println(b1);
		b1.printThis();
		
		System.out.println(b2);
		b2.printThis();
		
		b1.printBirthday();

	}

}
