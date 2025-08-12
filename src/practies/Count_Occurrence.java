package practies;

//Count occurrence of a given character in a string using Stream API in Java.
/*
public class Count_Occurrence {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		char ch = 'e';
		
		long count = str.chars() 
				.filter(c -> c == ch).count();
		
		System.out.println(count);
	}
	
}*/


public class Count_Occurrence{

	public static void main(String[] args) {
		
		String str = "geeksforgeeks";
		char ch = 'g';
		
		long count = str.chars().filter(c -> c == ch).count();
		System.out.println(count);
	}
}


