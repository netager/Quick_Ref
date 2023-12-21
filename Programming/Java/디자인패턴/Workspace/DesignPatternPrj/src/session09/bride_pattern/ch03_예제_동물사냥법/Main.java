package session09.bride_pattern.ch03_예제_동물사냥법;

public class Main {

	public static void main(String[] args) {

		Animal tiger = new Tiger(new HuntingMethod1());
		Animal bird = new Bird(new HuntingMethod2());
		
		tiger.hunt();
		System.out.println("--------------------");
		bird.hunt();

	}

}
