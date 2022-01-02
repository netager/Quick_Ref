package staticex;

public class Student {
	
	private static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		int i = 10;  // �������� - getSerialNum() �޼��尡 ���� �� �޸� �Ҵ�
		i++;
		System.out.println(i);
		
		return serialNum;     // static ����, class ���� - ���α׷� �ε��� �޸� �Ҵ� 
	}
	
}
