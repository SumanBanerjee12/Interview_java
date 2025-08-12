package twopointer;
/*
public class TwoPointer {
 public static void main(String[] args) {
	String input = "101010";
	
	char[]ch = input.toCharArray();
	
	int left = 0;
	int right = ch.length - 1;
	
	while(left < right) {
		// moved left forward if it is a already 0
		if(ch[left] == '0') {
			left++;
		}else if
		// move right back ward if it is already 1
		(ch[right] == '1') {
			right--;
		}else {
			// swap 1 on  left with 0 on right
			
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}
	}
	System.out.println(new String(ch));
}
}*/

public class TwoPointer {
	 public static void main(String[] args) {
		String input = "101010";
		
		char[]ch = input.toCharArray();
		int left = 0;
		int right = ch.length - 1;
		
		while(left < right) {
			if(ch[left] == '0') {
				left++;
			}else if(ch[right] == '1') {
				right--;
			}else {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				left++;
				right--;
			}
		}
		
		System.out.println(new String(ch));
	 }
}





