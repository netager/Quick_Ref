package session07.builder_pattern.ch02_º¹½À;

public class LgGramBluePrint extends ComputerBluePrint {

	Computer computer;
	
	public LgGramBluePrint() {
		computer = new Computer("defalult","default","default");
	
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
