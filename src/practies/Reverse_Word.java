
//reverse the original string word by word.

package practies;

public class Reverse_Word {
	public static void main(String[] args) {
		String str = "My Name is Suman";
		String result = reversString(str);
		System.out.println(result);
	}
	
	public static String reversString(String str) {
		str = str.trim();
		String[] words = str.split("\\s+");
		
		StringBuilder builder = new StringBuilder();
		for(int i = words.length - 1; i>= 0; i--) {
			builder.append(words[i]);
			if(i > 0 ) {
				builder.append(" ");
			}
		}
		return builder.toString();
	}
}
