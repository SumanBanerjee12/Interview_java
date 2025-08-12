package practies;

// How to get Slice of a Stream in Java?

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Slice_Stream {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
		
		int startIndex = 1;
		int sliceIndex = 4;
		
		List<Integer> slice = num.stream()
				.skip(startIndex)
				.limit(sliceIndex)
				.collect(Collectors.toList());
		
		System.out.println(slice);
	}
}
/*
public class Slice_Stream {
	public static void main(String[] args) {
		List<String> str = Arrays.asList(
				"one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
	
		int startIndex = 3;
		int sliceIndex = 5;
		
		List<String> result = str.stream()
				.skip(startIndex)
				.limit(sliceIndex)
				.collect(Collectors.toList());
		System.out.println(result);
	}
}*/
/*
public class Slice_Stream {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
		
		int startIndex = 1;
		int sliceIndex = 4;
		
		List<Integer> num = arr.stream().skip(startIndex).limit(sliceIndex)
				.collect(Collectors.toList());
		
		System.out.println(num);
	}
}*/
