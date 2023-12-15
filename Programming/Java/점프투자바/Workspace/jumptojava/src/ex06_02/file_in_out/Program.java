package ex06_02.file_in_out;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Program {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream output = new FileOutputStream("c:/temp/out.txt");
		for(int i=0; i<10; i++) {
			String data = i+1 + " 번째 줄입니다.\n";
			output.write(data.getBytes());
		}
		
		output.close();
		
		FileWriter fw = new FileWriter("c:/temp/out.txt", true);

		for(int i=0; i<10; i++) {
			String data = i+11 + " 번째 줄입니다.\n";
			fw.write(data);
		}
		fw.close();
		
		PrintWriter pw = new PrintWriter(new FileWriter("c:/temp/out.txt", true));

		for(int i=0; i<10; i++) {
			String data = i+21 + " 번째 줄입니다.";
			pw.println(data);
		}
		pw.close();
		
		
		byte[] b = new byte[1024];
		
		FileInputStream input = new FileInputStream("c:/temp/out.txt");
		input.read(b);
		
		System.out.println(new String(b));
		input.close();
		
		BufferedReader br = new BufferedReader(new FileReader("c:/temp/out.txt"));
		while(true) {
			String line = br.readLine();
			if(line==null) break;
			System.out.println(line);
		}
		br.close();
	
	}


}
