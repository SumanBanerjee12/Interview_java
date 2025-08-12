package practies;

import java.util.Arrays;
import java.util.List;

// Sum of all the number
/*
public class SumOfAllNum {

	public static void main(String[] args) {
		int[]arr = {1, 2, 3, 4, 5};
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			 sum = sum + arr[i];
			
		}
		 System.out.println(sum);
	}
}*/

public class SumOfAllNum{
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		int sum = 0;
		for(int num : numbers) {
			sum = sum + num;
		}
		System.out.println(sum);
	}
}
