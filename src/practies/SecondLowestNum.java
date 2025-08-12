package practies;

import java.util.Arrays;

/** Find the 2nd lowest number in the array **/
/*
public class SecondLowestNum {
	public static void main(String[] args) {
		int[]arr = {5, 9, 11, 2, 8, 21, 1};
		
		int res = Arrays.stream(arr)
				.boxed()
				.sorted()
				.skip(1)
				.findFirst()
				.get();
		System.out.println(res);
	}
	
}*/

public class SecondLowestNum {
	public static void main(String[] args) {
		int[]arr = {5, 9, 11, 2, 8, 21, 1};
		
		if(arr.length < 2) {
			return;
		}
		
		int lowest =Integer.MAX_VALUE;
		int secondLowest = Integer.MAX_VALUE;
		
		for(int num : arr) {
			if(num < lowest) {
				secondLowest = lowest;
				 lowest = num;
			}else if(num < secondLowest && num != lowest) {
				secondLowest = num;
			}
		}
		if(secondLowest == Integer.MAX_VALUE) {
			System.out.println("NO Value");
		}
		System.out.println(secondLowest);
	}
}
