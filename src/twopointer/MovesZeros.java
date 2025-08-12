
// Moves 0 to the right

package twopointer;
/*
public class MovesZeros {

	public static void main(String[] args) {
		int[]arr = {0, 1, 0, 3, 12};
		
		int left = 0;
		
		// push the Non zeros elements to the front
		for(int right = 0; right < arr.length; right++) {
			if(arr[right] != 0) {
				int temp = arr[left];
				 arr[left] = arr[right];
				 arr[right] = temp;
				 left++;
			}
		}
		for(int num: arr) {
			System.out.print(num + " , ");
		}
	}
}*/

public class MovesZeros{
	public static void main(String[] args) {
		int[]arr = {0, 1, 0, 3, 12};
		
		int left = 0;
		// move non zero to front
		for(int right = 0; right < arr.length; right++) {
			if(arr[right] != 0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
			}
		}
		for(int num : arr) {
			System.out.print(num);
		}
	}
}
