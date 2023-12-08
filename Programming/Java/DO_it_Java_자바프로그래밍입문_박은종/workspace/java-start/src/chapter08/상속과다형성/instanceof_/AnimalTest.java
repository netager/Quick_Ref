package chapter08.상속과다형성.instanceof_;

import java.util.ArrayList;

class Animal {

	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {

	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}


class Tiger extends Animal {

	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}

}

class Eagle extends Animal {

	public void move() {
		System.out.println("독수리가 하늘을 날읍니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 하늘을 납니다.");
	}

}


public class AnimalTest {

	public static void main(String[] args) {

		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Human());
		animals.add(new Tiger());
		animals.add(new Eagle());
		
		AnimalTest test = new AnimalTest();
		for (Animal animal : animals) {
			test.moveAnimal(animal);
		}
		
	}

	
	public void moveAnimal(Animal animal) {
		animal.move(); // 다형성을 나타내고 있음
		if(animal instanceof Human) {		
			Human human = (Human)animal;
			human.readBook();
		}
		else if(animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
		}
		else if(animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.flying();
		}
		else {
			System.out.println("지원되지 않는 기능입니다.");
		}

	}

}
