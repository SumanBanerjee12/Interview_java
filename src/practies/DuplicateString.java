package practies;

//Write a java program to find all duplicate element from given string

public class DuplicateString {

	public static void main(String[] args) {
		String str = "mynameissuman";
		
		char[] chars = str.toCharArray();
		
		for(int i = 0; i< chars.length; i++) {
			int count = 1;
			if(chars[i] == '0') {
				continue;
			}
				 for (int j = i + 1; j < chars.length; j++) {
		                if (chars[i] == chars[j]) {
		                    count++;
		                    chars[j] = '0'; // Mark as visited
		                }
		            }
				 if(count > 1) {
					 System.out.println(chars[i] + "=" + count);
				 }
		}
	}
}

/*
public class DuplicateString {

	public static void main(String[] args) {
		String str = "mynameissuman";
		
		char[]ch = str.toCharArray();
		
		for(int i = 0; i< ch.length; i++) {
			int count = 1;
			if(ch[i] == '0') {
				continue;
			}
			for(int j = i+1; j< ch.length; j++) {
				if(ch[i] == ch[j]) {
					count++;
					ch[j] = '0';
				}
			}
			if(count > 1) {
				System.out.println(ch[i] + " = " + count);
			}
		}
	}
}	*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		

