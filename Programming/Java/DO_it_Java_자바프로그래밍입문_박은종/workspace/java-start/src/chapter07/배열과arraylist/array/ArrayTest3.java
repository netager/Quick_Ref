package chapter07.¹è¿­°úarraylist.array;

public class ArrayTest3 {
	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		char ch='A';
		
		for (int i=0; i<alphabets.length; i++, ch++) {
			alphabets[i] = ch;
		}
		
		for (char chr: alphabets)
			System.out.print(chr);
		
		
		System.out.println();
		
		char[] alph = new char[26];
		int cha = 65;
		
		for (int i=0; i<alph.length; i++) {
			alph[i] = (char)(cha + i);
		}

		for (char aa: alph)
			System.out.print(aa);
		
	}

}
