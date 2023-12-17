<<<<<<<< HEAD:Programming/Java/디자인패턴/Workspace/DesignPrj/src/ex7/builder1/Computer.java
package ex7.builder1;
========
package ex07.builder;
>>>>>>>> f8342e4517bb6fb91991f229765f80f969d5229a:Programming/Java/디자인패턴/Workspace/DesignPrj/src/ex07/builder/Computer.java

public class Computer {
	
	private String cpu;
	private String ram;
	private String storage;
	
	
	public Computer(String cpu, String ram, String storage) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.storage = storage;
	}
	
	
	public String getCpu() {
		return cpu;
	}
	
	
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	
	public String getRam() {
		return ram;
	}
	
	
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	
	public String getStorage() {
		return storage;
	}
	
	
	public void setStorage(String storage) {
		this.storage = storage;
	}
	
	@Override
	public String toString() {
		
		return cpu+","+ram+","+storage;
		
	}

	
}
