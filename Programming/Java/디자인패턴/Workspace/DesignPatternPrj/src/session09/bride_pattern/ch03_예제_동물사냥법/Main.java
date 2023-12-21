package session09.bride_pattern.ch03_����_������ɹ�;

public class Main {

	public static void main(String[] args) {

		Animal tiger = new Tiger(new HuntingMethod1());
		Animal bird = new Bird(new HuntingMethod2());
		
		tiger.hunt();
		System.out.println("--------------------");
		bird.hunt();

	}

}
