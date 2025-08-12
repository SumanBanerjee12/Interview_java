package twopointer;
/*
public class ReverseString {
	public static void main(String[] args) {
		String str = "suman";
		char[]ch = str.toCharArray();
		int left = 0;
		int right = ch.length-1;
		
		while(left < right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;	
		}
		System.out.println(new String(ch));
	}
}*/

public class ReverseString{
	public static void main(String[] args) {
		String str = "hello world";
		char[]ch = str.toCharArray();
		
		int left = 0;
		int right = ch.length-1;
		
		while(left < right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}
		System.out.println(new String(ch));
	}
}