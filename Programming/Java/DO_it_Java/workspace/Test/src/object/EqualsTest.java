package object;

class Student {
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Student) {
			Student std = (Student)obj;
			
			if(studentID == std.studentID)
				return true;
			else 
				return false;
		}
		return false;
	}
	
	public int hashCode() {
		return studentID;
	}
		
	
	
}
public class EqualsTest {

	public static void main(String[] args) {

		String str1 = new String("test");
		String str2 = new String("test");
		
		// false 
		// str1 �� str2�� �޸� �ּҰ��� �ٸ��� ������ false
		// ������ �������� üũ
		System.out.println(str1 == str2);
		
		// true
		// str1 �� str2�� �ؽ�Ʈ�� �������� ���ϹǷ�  true ���.
		// equls()�� ���� �ּҰ� �������� Ȯ���ϳ� �������Ͽ� �ؽ�Ʈ�� ������ Ȯ���ϵ��� ������.
		// ���� �������� üũ.
		System.out.println(str1.equals(str2));
		
		
		Student std1 = new Student(10001, "Tomas");
		Student std2 = new Student(10001, "Tomas");
		
		System.out.println(std1 + "," + std2 + "," + (std1 == std2));
		System.out.println(std1.equals(std2));
		
		// 10���� Address �� ��ȯ
		System.out.println("std1.hashCode() : " + std1.hashCode());
		System.out.println("std2.hashCode() : " + std2.hashCode());

		// hashCode() �޼��尡 ������ �Ǿ �����ϰ� ����
		// ������ str1�� str2�� Heap �޸𸮴� �ٸ��� hashCode() �޼��� �����Ƿ� �����ϰ� ���
		// �������� �����ϵ��� equals()�� �������ϸ� hashCode()�� ������ ���� ��ȯ�ǵ��� �ؾ� ��.
		// equeals()�� �������ϸ� hashCode()�� ������ �ؾ� ��.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// ������ hashCode ���� ������ �Ҷ�
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	
		

	}

}
