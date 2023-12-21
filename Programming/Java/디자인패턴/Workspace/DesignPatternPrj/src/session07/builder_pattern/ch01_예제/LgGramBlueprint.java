package session07.builder_pattern.ch01_¿¹Á¦;

public class LgGramBlueprint extends BluePrint {

	Computer computer;
	
	public LgGramBlueprint() {

		computer = new Computer("default","default","default");
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

		return computer;
	}

}
