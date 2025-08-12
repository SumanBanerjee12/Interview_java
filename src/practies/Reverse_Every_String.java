package practies;

public class Reverse_Every_String {
	public static void main(String[] args) {
		String str = "my name is suman";
		System.out.println(reverseEachWord(str));
	}
	
	public static String reverseEachWord(String str) {
		String[] character = str.split(" ");
		StringBuilder builder = new StringBuilder();
		
		for(String words : character) {
			builder.append(reverse(words)).append(" ");
		}
		return builder.toString().trim();
	}
	
	public static String reverse(String word) {
		char[] ch = word.toCharArray();
		
		int left = 0;
		int right = ch.length - 1;
		
		while(left < right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}
		return new String(ch);
	}
}


