<<<<<<<< HEAD:Programming/Java/디자인패턴/Workspace/DesignPrj/src/ex7/builder1/ComputerFactory.java
package ex7.builder1;
========
package ex07.builder;
>>>>>>>> f8342e4517bb6fb91991f229765f80f969d5229a:Programming/Java/디자인패턴/Workspace/DesignPrj/src/ex07/builder/ComputerFactory.java

public class ComputerFactory {
	
	private BluePrint print;
	
	public void setBlueprint(BluePrint print) {
		this.print = print;
		
	}

	
	public void make() {
		
		print.setCpu();
		print.setRam();
		print.setStorage();
		
	}


	public Computer getComputer() {

		return print.getComputer();
		
	}

}
