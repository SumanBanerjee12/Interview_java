package sort;

/*
public class BubbleSort {

	public static void main(String[] args) {
		 int[] arr = {5, 2, 9, 1, 3, 6};
		 
		 bubbleSort(arr);
		 for(int number : arr) {
			 System.out.print(number + " ");
		 }
	}
	
	public static void bubbleSort(int[] num) {
		int n = num.length;
		
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				if(num[j] > num [j + 1]) {
					
					int temp = num[j];
					 num[j] = num[j + 1];
					  num[j + 1] = temp;
				}
			}
		}
	}
}*/


public class BubbleSort{
	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 1, 4};
		
		int n = arr.length;
		
		for(int i = 0; i< n -1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int num : arr) {
			System.out.println(num);
		}
	}
}

 

