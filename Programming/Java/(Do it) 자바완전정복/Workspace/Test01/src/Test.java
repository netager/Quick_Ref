
public class Test {
	public static void main(String[] args) {
		System.out.println("-------------------------");
	
	
		int value1 = 3;
		
		{
			int value2 = 5;

			System.out.println(value1);	//3
			System.out.println(value2); //5
		}
	
		System.out.println(value1);	//3
//		System.out.println(value2); 
		
		byte c = (byte)128;
		System.out.println(c);
		byte d = (byte)129;
		System.out.println(d);
		
		int a = 3;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println("---------------------------------------");
		
		System.out.println(3 & 10);
		System.out.println(0b00000011 & 0b00001010);
		System.out.println(0x03 & 0x0A);
		System.out.println("---------------------------------------");
		
		int data = 10;
		System.out.println(Integer.toBinaryString(data));
		System.out.println(Integer.toOctalString(data));
		System.out.println(Integer.toHexString(data));
		System.out.println(Integer.toHexString(data).toUpperCase());
		System.out.println("---------------------------------------");
		
		data = 10;
		System.out.println(Integer.parseInt("1010", 2));
		System.out.println(Integer.parseInt("12", 8));
		System.out.println(Integer.parseInt("a", 16));
		System.out.println("---------------------------------------");

		System.out.println(~3); // 00000000 00000000 00000000 00000011
								// 11111111 11111111 11111111 11111100
		System.out.println(0b11111111111111111111111111111100);
		System.out.println(~0b00000011);
		System.out.println(~0b00);  // 11111111 11111111 11111111 11111111
									// 2의 보수 + 1 : 00000000 + 1 = 1 ---> -1
		System.out.println("---------------------------------------");
		
		c = 6;
		System.out.println(true ^ c++>6);
		System.out.println(c);
		// if, switch, for, while, do-while
		// break, continue
			
	}
}
