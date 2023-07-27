package ex19.array;

import java.util.Random;

public class Program5 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int lotto_temp = 0;
		int[] lotto = new int[6];
		
		EXIT:
		while(true) {
			lotto_temp = rand.nextInt(45) + 1;
			
			for(int i=0; i<lotto.length; i++) {
				if(lotto[i] == lotto_temp)
					break;
				else
					lotto[i] = lotto_temp;
				
				 if (i == lotto.length)
					 break EXIT;
				
			}
			break;
		}
		
		for(int i=0; i<lotto.length; i++)
			System.out.printf("%d \n", lotto[i]);
	}

}
