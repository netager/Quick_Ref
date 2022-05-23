package sec01_inheritancepolymorphism.EX01;

class Human {
	String name;
	int age;
	void eat() {}
	void sleep() {}
}

class Student extends Human {
	int studentID;
	void goToSchool() {}
}

class Worker extends Human {
	int workerID;
	void goToWork() {}
}


public class Inheritance {

	public static void main(String[] args) {

		//#2. Human 객체 생성
		Human h = new Human();
		h.name  = "김민성";
		h.age = 15;
		h.eat();
		h.sleep();
		
		//#2. Student 객체 생성
		Student s = new Student();
		s.name  = "김민성";
		s.age = 15;
		s.studentID = 128;
		s.eat();
		s.sleep();
		s.goToSchool();

		//#3. Worker 객체 생성
		Worker w = new Worker();
		w.name  = "김현지";
		w.age = 30;
		w.workerID = 128;
		w.eat();
		w.sleep();

		

	}

}
