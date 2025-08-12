package practies;

import java.util.Arrays;
import java.util.Comparator;

// Find Second Highest Number
/*
public class SecondHighest {
	public static void main(String[] args) {
		int[]arr = {1,2,3,4,5};
		
		int secondHighest = Arrays.stream(arr)
				.boxed()
//				.sorted(Comparator.reverseOrder())
				.sorted((a, b) -> b - a)
				.skip(1)
				.findFirst()
				.get();
		System.out.println(secondHighest);
	}
}*/

public class SecondHighest{
	public static void main(String[] args) {
		int[]arr = {1,3,6,2,7};
		
		Arrays.sort(arr);
		
		if(arr.length < 2) {  
			return;
		}
		
		int res = arr[arr.length - 2];
		System.out.println(res);
		
	}
}



