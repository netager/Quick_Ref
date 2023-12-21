package session07.builder_pattern.ch01_����;

public class ComputerFactory {
	
	private BluePrint print;
	
	public void setBlueprint(BluePrint print) {
		this.print = print;
	}

	public void make() {
		print.setRam();
		print.setCpu();
		print.setStorage();
	}
	
	public Computer getComputer() {
		return print.getComputer();
	}
}
