package sec02_exceptionhandlingsyntax.EX05;

import java.io.IOException;
import java.io.InputStreamReader;


public class TryWithResource_1 {
	public static void main(String[] args) {
		
		//참고. System.in 리소스를 해제하면 더이상 콘솔입력이 불가
		//# 자동 리소스 해제
		try(InputStreamReader isr1 = new InputStreamReader(System.in);) {
			char input = (char)isr1.read();
			System.out.println("입력글자 = " + input);
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		
		//#2. 수동 리소스 해제
		InputStreamReader isr2 = null;
		try {
			isr2 = new InputStreamReader(System.in);
			char input = (char)isr2.read();
			System.out.println("입력글자 = " + input);
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		finally {
			//리소스 해제 구문
			if(isr2 != null) {
				try {
					isr2.close();
				} catch (IOException e) {
					e.printStackTrace();
				} // 리소스 해제
			}
		}
		
	}
	

}
