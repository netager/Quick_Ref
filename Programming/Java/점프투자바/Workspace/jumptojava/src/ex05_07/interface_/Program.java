package ex05_07.interface_;

interface Predator {
	String getFood();
	
	default void printFood() {
		System.out.printf("my food is %s\n", getFood());
	}
}

interface Barkable {
	void bark();
}


interface BarkablePredator extends Predator, Barkable {
	
}


class Animal {
	
	String name;
	
	void setName(String name) {
		this.name = name;
	}
	
}

class Lion extends Animal implements Predator, Barkable {
	
	public String getFood() {
		return "banana";
	}

	@Override
	public void bark() {
		System.out.println("À¸¸£··");// TODO Auto-generated method stub
		
	}
	
}

class Tiger extends Animal implements Predator, Barkable {
	public String getFood() {
		return "apple";
	}

	@Override
	public void bark() {
		System.out.println("¾îÈï");// TODO Auto-generated method stub
		
	}

}

class Mouse extends Animal implements BarkablePredator {

	@Override
	public String getFood() {
		return "ÁãÄ¡";
	}

	@Override
	public void bark() {
		System.out.println("Âï~ Âï~");
		
	}
	
}

class Zookeeper {
	
	void feed(Predator predator) {
		System.out.println("feed " + predator.getFood());
		predator.printFood();
	}
}

class Bouncer {
	void barkAnimal(Barkable animal) {
		animal.bark();
	}
}

public class Program {

	public static void main(String[] args) {
		
		Zookeeper zookeeper = new Zookeeper();
		Lion lion = new Lion();
		Tiger tiger = new Tiger();
		Mouse mouse = new Mouse();
		
		
		zookeeper.feed(lion);
		zookeeper.feed(tiger);
		zookeeper.feed(mouse);
		
		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
		bouncer.barkAnimal(mouse);
		
		
		
	}

}
