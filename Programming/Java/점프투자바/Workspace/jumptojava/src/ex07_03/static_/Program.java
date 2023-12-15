package ex07_03.static_;

import java.text.SimpleDateFormat;
import java.util.Date;

class Counter {
	static int count = 0;
	
	Counter() {
		count++;
		System.out.println(count);
	}
	
	public static int getCount() {
		return count;
	}
	
}


class Util {
	public static String getCurrentDate(String fmt) {
		
		SimpleDateFormat sdf = new SimpleDateFormat(fmt);
		return sdf.format(new Date());
		
	}
}

public class Program {

//	public static void main(String[] args) {
//		
//		Counter c1 = new Counter();
//		System.out.println(c1.getCount());
//		
//		Counter c2 = new Counter();
//		System.out.println(c2.getCount());
//		
//		System.out.println(Counter.getCount());
//		
//	}

	public static void main(String[] args) {
		System.out.println(Util.getCurrentDate("yyyy-MM-dd"));
		
	}
	
}
