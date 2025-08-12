package practies;

public class BinarySearch {

	public static void main(String[] args) {
		int[] number = {2, 4, 6, 8, 10, 12};
		int target = 4;
		int result = binarySearch(number, target);
		System.out.println(result);
	}
	
	public static int binarySearch(int[]arr, int target) {
		
		int start  = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid] == target) {
				return  mid;
			}
			if(arr[mid] < target) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
		}
		return 0;
	}
}