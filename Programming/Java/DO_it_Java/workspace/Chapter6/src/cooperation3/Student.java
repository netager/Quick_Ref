package cooperation3;

public class Student {
	
	String studentName;
	int money;
	int grade;
	
	public Student(String studentName, int money ) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		money -= 1000;
		bus.take(1000);		
	}
		
    public void showInfo() {
    	System.out.println(studentName + "´ÔÀÇ ÀÜ¾×Àº " + money + "ÀÔ´Ï´Ù.");
	}

}
