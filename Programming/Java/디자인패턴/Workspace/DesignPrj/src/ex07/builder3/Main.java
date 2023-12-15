package ex07.builder3;

public class Main {

	public static void main(String[] args) {
		
//		Computer computer = new Computer("256 ssd", "i7", "8g");
		
		Computer computer = ComputerBuilder
//			.start()
			.startWithCpu("i8")
//			.setCpu("i7")
			
			.setRam("8g")
			.setStorage("256 ssd")
			.build();
		
		System.out.println(computer.toString());

	}

}
