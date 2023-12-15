package chapter09.�߻�Ŭ����.abstractex;

import java.util.ArrayList;

public class CompterTest {

	public static void main(String[] args) {
		
//		Computer c1 = new Computer();	//���� �߻� - �߻�Ŭ������ ������ �� ����
		Computer c2 = new DeskTop();
//		Computer c3 = new NoteBook();   //���� ��� - �߻�Ŭ������ ������ �� ����
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
