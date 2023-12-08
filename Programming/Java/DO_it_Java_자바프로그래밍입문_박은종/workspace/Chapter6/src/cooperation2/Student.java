package cooperation2;

public class Student {
	
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		
		bus.take(1000);  // ��ü�� ����
		money -= 1000;
	}

	public void takeSubway(Subway subway) {
		
		subway.take(1500);  // ��ü�� ����
		money -= 1500;
	}

	public void showInfo() {
		
		System.out.println(studentName + "���� ���� ���� " + money + "�Դϴ�.");
	}
}
