package part3.ex5.√ﬂªÛ»≠;

public abstract class Exam {
	
	private int kor;
	private int eng;
	private int math;
	
	public Exam() {
		this(0,0,0);
	}
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getKor() {
		// TODO Auto-generated method stub
		return kor;
	}

	public int getEng() {
		// TODO Auto-generated method stub
		return eng;
	}

	public int getMath() {
		// TODO Auto-generated method stub
		return math;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public abstract int total();

	protected int onTotal() {
		return kor + eng + math;
	}
	
	public abstract float avg();
	
}
