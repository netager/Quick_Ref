package session06.prototype_pattern.ch03_deepshallow_copy;

public class Age {

	int year;
	int value;
	
	public Age(int year, int value) {
		this.year = year;
		this.value = value;
	}

	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
}
