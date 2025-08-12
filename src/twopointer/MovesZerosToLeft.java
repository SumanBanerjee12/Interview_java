package twopointer;
/*
public class MovesZerosToLeft {
	public static void main(String[] args) {
		int[]arr = {0, 1, 0, 3, 12};
		
		int right = arr.length - 1;
		
		// shift the non zero elements to the end
		
		for(int i = arr.length -1; i>= 0; i-- ) {
			if(arr[i] != 0) {
				arr[right] = arr[i];
				right--;
			}
		}
		
		// fill the beginning with 0s
		while(right >= 0){
			arr[right] = 0;
			right--;
		}
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
}*/

public class MovesZerosToLeft {
	public static void main(String[] args) {
		int[]arr = {0, 1, 0, 3, 12};

		int right = arr.length - 1;
		
		for(int i = arr.length - 1; i>=0; i--) {
			if(arr[i] != 0) {
				arr[right] = arr[i];
				right--;
			}
		}
		
		while(right >= 0) {
			arr[right] = 0;
			right--;
		}
		for(int num : arr) {
		System.out.print(num + " ");
		}
	}
}
