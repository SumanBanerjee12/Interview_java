package sort;
/*
public class InsersationSort {
	
	public static void main(String[] args) {
		int[] arr = {8, 4, 1, 3, 9, 5, 2};
		
		int n = arr.length;
		
		for(int i = 1; i< n; i++) {
			int key = arr[i];
			int j = i - 1;
			
			// Shift the larger element to the right
			while( j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			// Insert the key into correct position
			arr[j + 1] = key;
		}
		
		for(int num : arr) {
			System.out.println(num);
		}
	}
}

public class InsersationSort {
	public static void main(String[] args) {
		int[] arr = {8, 4, 1, 3, 9, 5, 2};
		
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j]> key) {
				arr[j + 1] = arr[j];
				j--;
			}
			
			arr[j + 1] = key;
		}
		for(int num : arr) {
			System.out.println(num);
		}
	}
}*/

public class InsersationSort {
	public static void main(String[] args) {
		int[] arr = {8, 4, 1, 3, 9, 5, 2};
		
		int n = arr.length;
		for(int i = 0; i< n; i++) {
			int key = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j]> key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j + 1]= key;
		}
		 
		for(int num: arr) {
			System.out.println(num);
		}
	}
}

	
