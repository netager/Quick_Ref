package chapter15.자바입출력.보조스트림.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {

	private static final long serialVersionUID = 3302748022022135856L;
	
	String name;
	transient String title;	// transient 를 사용하면 직렬화에서 제외됨.
	
	public Person() {}
	public Person(String name, String title) {
		this.name = name;
		this.title = title;
	}
	@Override
	public String toString() {
		return name + "," + title;
	}
	
}
public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Person personLee = new Person("Lee", "Manager");
		
		try(FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(personLee);
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Object obj = ois.readObject();
			if(obj instanceof Person) {
				Person p = (Person)obj;
				System.out.println(p);
			}
			
		} catch(IOException e) {
			System.out.println(e);
		}
		

	}

}
