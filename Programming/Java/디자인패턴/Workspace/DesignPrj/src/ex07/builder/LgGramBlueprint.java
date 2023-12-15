<<<<<<<< HEAD:Programming/Java/디자인패턴/Workspace/DesignPrj/src/ex7/builder1/LgGramBlueprint.java
package ex7.builder1;
========
package ex07.builder;
>>>>>>>> f8342e4517bb6fb91991f229765f80f969d5229a:Programming/Java/디자인패턴/Workspace/DesignPrj/src/ex07/builder/LgGramBlueprint.java

public class LgGramBlueprint extends BluePrint {

	private Computer computer;
	
	
	public LgGramBlueprint() {

		computer = new Computer("defalut", "default", "default");
	}
	
	@Override
	public void setCpu() {
		
		computer.setCpu("i7");

	}

	@Override
	public void setRam() {

		computer.setRam("8g");
		
	}

	@Override
	public void setStorage() {

		computer.setStorage("256g ssd");
		
	}

	@Override
	public Computer getComputer() {
		// TODO Auto-generated method stub
		return computer;
	}
	
	
	
	

}
