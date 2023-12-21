package session05.singleton_pattern.ch02_º¹½À;

public class Main {

	public static void main(String[] args) {

		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		SystemSpeaker speaker3 = SystemSpeaker.getInstance();
		
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		System.out.println(speaker3.getVolume());
		System.out.println("------------------------------");

		speaker1.setVolume(10);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		System.out.println(speaker3.getVolume());
		System.out.println("------------------------------");

		speaker2.setVolume(20);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		System.out.println(speaker3.getVolume());
		System.out.println("------------------------------");

		speaker3.setVolume(30);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		System.out.println(speaker3.getVolume());
		System.out.println("------------------------------");

	}

}
