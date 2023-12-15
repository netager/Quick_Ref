package chapter09.추상클래스.abstractex;

import java.util.ArrayList;

public class CompterTest {

	public static void main(String[] args) {
		
//		Computer c1 = new Computer();	//에러 발생 - 추상클래스는 생성할 수 없음
		Computer c2 = new DeskTop();
//		Computer c3 = new NoteBook();   //에러 살생 - 추상클래스는 생성할 수 없음
		Computer c4 = new MyNoteBook();
		
		ArrayList<Computer> computers = new ArrayList<Computer>();
		computers.add(new DeskTop());
		computers.add(new MyNoteBook());
		
		for (Computer computer : computers) {
			computer.turnOn();
			computer.turnOff();
			computer.display();
			computer.typing();
			
			
		}
		


	}

}
