package practies;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//To find the number of string in a list whose length is greater than 4
/*
public class NumberString {
	public static void main(String[] args) {
		List<String> data = Arrays.asList("abcd", "abc", "abcdef", "abcde", "abcdefg");
		
		List<String> res = data.stream()
				.filter(num -> num.length() > 4)
				.collect(Collectors.toList());
		System.out.println(res);
		
		// count the total num
		
		long count =  data.stream()
				.filter(str -> str.length() > 4).count();
		System.out.println(count);
	}
}*/

public class NumberString {
	public static void main(String[] args) {
		List<String> data = Arrays.asList("abcd", "abc", "abcdef", "abcde", "abcdefg");

	List<String> result = data.stream().filter(x -> x.length() > 4)
			.collect(Collectors.toList());
	System.out.println(result);
	
	long count = data.stream().filter(num -> num.length() > 4).count();
	System.out.println(count);
	}
}









