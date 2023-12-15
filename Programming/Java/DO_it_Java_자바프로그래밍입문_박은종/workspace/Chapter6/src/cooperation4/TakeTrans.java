package cooperation4;

public class TakeTrans {

	public static void main(String[] args) {

		Student studentLee = new Student("Lee", 5000);
		Student studentKim = new Student("Kim", 4000);
		
		Bus bus100 = new Bus(100);
		
		studentLee.takeBus(bus100);
		
		studentLee.showInfo();
		bus100.showInfo();
		
	}

}
