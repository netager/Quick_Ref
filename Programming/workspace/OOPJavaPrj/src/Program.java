import part3.ex4.UI�ڵ�и��ϱ�.Exam;

public class Program {
	
	// �������� ����� ���
	// --------------
	// 1. ������ -> Exam.class
	// 2. ����  -> Exam.zip
	// 3. jar  -> Exam.jar

	public static void main(String[] args) {
		
		Exam exam = new Exam(1,1,1);
		System.out.println(exam.total());
		System.out.println(exam.avg());

	}

}
