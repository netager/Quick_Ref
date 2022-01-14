package array;

public class ArrayTest3 {

	public static void main(String[] args) {

		
//		char[] alphabets = new char[26];
//		char ch = 'A';
//		for(int i=0; i<alphabets.length;i++, ch++) {
//			alphabets[i] = ch;
//			System.out.println(ch);			
//		}
//		
//		for (int i = 0; i<alphabets.length;i++) {
//			//System.out.println(alphabets[i]);
//		}
//	}
		
		char[] alphabets = new char[128];
		char ch = 0; // 65
		
		for (int i = 0; i < alphabets.length; i++, ch++) {
			alphabets[i] = ch;
		}
		
		for (int i = 0; i < alphabets.length; i++, ch++) {
			System.out.println("alphabets[" + i + "] = " + alphabets[i]);
		}
	}

}
