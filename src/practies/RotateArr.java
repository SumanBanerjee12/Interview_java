
// Given an integer array  rotate the array to the right by k steps

package practies;

import java.util.Arrays;

public class RotateArr {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		rotate(arr, 1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void rotate(int[] nums, int k) {
		int n = nums.length;
		if(n <= 1) return;  // edge cases
		 k = k % n;
		 if(k == 0) return; // edge cases
		 
		 rev(nums, 0, n-1);  // Reverse entire array
		 rev(nums, 0, k-1);  // Step 2: Reverse first k elements
		 rev(nums, k, n-1);   // Step 3: Reverse last n-k elements
	}
	
	public static void rev(int[] num, int start, int end) {
		while(start < end) {
			int temp = num[start];
			num[start] = num[end];
			num[end] = temp;
			start++;
			end--;
		}
	}
}
