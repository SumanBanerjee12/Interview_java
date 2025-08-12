package sort;
/*
public class SelectionSort {

	public static void main(String[] args) {
		int[]arr = {2, 1, 3, 5, 4};
		
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			int minIndex = i;
			
			for(int j = i + 1; j< n; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			if(minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		for(int num : arr) {
			System.out.println(num);
		}
	}
}*/


public class SelectionSort{
	public static void main(String[] args) {
		int[]arr = {2, 1, 3, 5, 4};
		
		int n = arr.length;
		for(int i = 0 ; i< n; i++) {
			int minIndex = i;
		
			for(int j = i + 1; j < n; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			if(minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		for(int num : arr) {
			System.out.println(num);
		}
	}
	
}


