<<<<<<<< HEAD:Programming/Java/디자인패턴/Workspace/DesignPrj/src/ex7/builder1/Main.java
package ex7.builder1;
========
package ex07.builder;
>>>>>>>> f8342e4517bb6fb91991f229765f80f969d5229a:Programming/Java/디자인패턴/Workspace/DesignPrj/src/ex07/builder/Main.java

public class Main {

	public static void main(String[] args) {
		
		ComputerFactory factory = new ComputerFactory();
		
		factory.setBlueprint(new LgGramBlueprint());
		
		factory.make();
		
		
		Computer computer = factory.getComputer();
		

		System.out.println(computer.toString());

	}

}
