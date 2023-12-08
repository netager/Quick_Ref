package chapter05.클래스와객체1.reference;

public class Subject {

	String subjectName;
	int score;
	
	public Subject(String subjectName) {
		this.subjectName = subjectName;
		
	}
	public String getSubjectName() {
		return subjectName;
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
}
