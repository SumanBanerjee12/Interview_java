package practies;

import java.util.Arrays;
import java.util.List;

//square the list of numbers and then filter out the numbers greater than 10 and then 
//find the average of filtered numbers


public class SquareNum {
	
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
		
		 double res = arr.stream().mapToInt(x -> x*x)
		.filter(num -> num > 10)
		.average().getAsDouble();
		 
		 System.out.println(res);
	}
}
