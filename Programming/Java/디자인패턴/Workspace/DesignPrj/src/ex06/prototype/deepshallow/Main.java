package ex06.prototype.deepshallow;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		Cat navi = new Cat();
		navi.setName("navi");
		navi.setAge(new Age(2012, 3));
		
		// Shallow Copy
		Cat yo = navi;
		yo.setName("yo");
		yo.setAge(new Age(2013, 2));

		// Deep Copy
		Cat cuti = navi.copy();
		cuti.setName("cuti");
		cuti.getAge().setYear(2014);
		cuti.getAge().setValue(55);

		
		System.out.println(navi.getName());
		System.out.println(navi.getAge().getYear());
		System.out.println(navi.getAge().getValue());
		
		System.out.println(yo.getName());
		System.out.println(yo.getAge().getYear());
		System.out.println(yo.getAge().getValue());
		
		System.out.println(cuti.getName());
		System.out.println(cuti.getAge().getYear());
		System.out.println(cuti.getAge().getValue());
			
	}

}
