package ifexample;

public class IfExample2 {
	public static void main(String[] args) {
		int age = 9;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("미취학");
		} 
		else if(age < 14) {
			charge = 2000;
			System.out.println("초등");
		} 
		else if(age < 20) {
			charge = 2500;
			System.out.println("중, 고");
		} 
		else {
			charge = 3000;
			System.out.println("성인");
		}
		System.out.println("입장료:" + charge + "원");
	}

}
