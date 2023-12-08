package ex05_09.abstract_;

abstract class Predator extends Animal {
	abstract String getFood();
	
	void printFood() {
		System.out.printf("my food is %s\n", getFood());
	}
}

interface Barkable {
	void bark();
}


//interface BarkablePredator extends Predator, Barkable {
//	
//}


class Animal {
	
	String name;
	
	void setName(String name) {
		this.name = name;
	}
	
}


class Tiger extends Predator implements Barkable {
	public String getFood() {
		return "apple";
	}

	@Override
	public void bark() {
		System.out.println("����");// TODO Auto-generated method stub
		
	}

}
class Lion extends Predator implements Barkable {
	
	public String getFood() {
		return "banana";
	}

	@Override
	public void bark() {
		System.out.println("������");// TODO Auto-generated method stub
		
	}
	
}



class Mouse extends Predator implements Barkable {

	@Override
	public String getFood() {
		return "��ġ";
	}

	@Override
	public void bark() {
		System.out.println("��~ ��~");
		
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
