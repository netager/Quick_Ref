package chapter15.�ڹ������.������Ʈ��.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

// Serializaable : ǥ�� �������̽���� ��
class Member implements Externalizable {

	String name;
	String job;
	
	public Member() {}
	public Member(String name, String job) {
		this.name = name;
		this.job = job;
	}
	@Override
	public String toString() {
		return name + "," + job;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(this.name);
		out.writeUTF(this.job);
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.name = in.readUTF();
		this.job = in.readUTF();
	}
	
}

public class ExternalizationTest {

	public static void main(String[] args) {

		Member memberLee = new Member("Lee", "������");
		Member memberKim = new Member("Kim", "��ȹ��");
		
		try(FileOutputStream fos = new FileOutputStream("external.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(memberLee);
			oos.writeObject(memberKim);
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fis = new FileInputStream("external.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			Member pLee = (Member) ois.readObject();
			Member pKim = (Member) ois.readObject();
			
			System.out.println(pLee);
			System.out.println(pKim);

			
		} catch(IOException | ClassNotFoundException e) {
			System.out.println(e);
		}
		

	}

}
