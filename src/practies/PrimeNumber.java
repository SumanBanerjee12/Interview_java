package practies;

import java.util.Scanner;

/*
public class PrimeNumber {

	public static void main(String[] args) {
		int[]arr = {3, 4, 7, 10, 13, 16, 19, 20};
		
		for(int num : arr) {
			if(isPrime(num)) {
				System.out.print(num + ", ");
			}
		}
	}
	
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for(int i = 2; i*i <= n; i++) {
			if(n % i == 0) {
				return false;
			}	
		}
		return true;
	}
}*/

public class PrimeNumber{
	public static void main(String[] args) {
		int[]arr = {1,2,3,4,5};
		for(int num : arr) {
			if(isPrime(num)) {
				System.out.println(num);
			}
		}
	}
	
	public static boolean isPrime(int n) {
		if(n <= 1 ) {
			return false;
		}
		for(int i = 2; i*i <= n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;	
	}		
}
/*
public class PrimeNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		 
		int num = sc.nextInt();
		 if(isPrime(num)) {
			 System.out.println("This is Prime Number");
		 }else {
			 System.out.println("This is not Prime Number");
		 }
		 sc.close();
	}
	
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for(int i = 2; i*i <= n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}*/

