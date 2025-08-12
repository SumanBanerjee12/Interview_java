package practies;

import java.util.Random;

//give me the 5 random number between two value

public class RandomNum {

	public static void main(String[] args) {
		int min = 10;
		int max = 15;
		
		Random random = new Random();
		for(int i = 0; i<5; i++) {
			int res = random.nextInt(max-min+1)+min;	
		System.out.println(res);
		}
	}
}
/*
public class RandomNum{
	public static void main(String[] args) {
		int min = 1;
		int max = 5;
		Random random = new Random();
		for(int i = 0; i< 5; i++) {
		int res = random.nextInt(max-min+1)+min;
		System.out.println(res);
		}
	}
}*/
