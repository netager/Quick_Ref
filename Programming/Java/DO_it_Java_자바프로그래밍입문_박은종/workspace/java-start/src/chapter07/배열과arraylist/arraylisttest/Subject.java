package chapter07.¹è¿­°úarraylist.arraylisttest;

public class Subject {

	private String name;
	private int scorePoint;
	
	public Subject() {}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getScorePoint() {
		return scorePoint;
	}



	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}


	public void showInfo() {
		System.out.println(name + scorePoint);
	}
}
