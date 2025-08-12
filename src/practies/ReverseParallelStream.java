package practies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// How to Reverse elements of a Parallel Stream in Java?
/*
public class ReverseParallelStream {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		 List<Integer> reversedList = new ArrayList<>(numbers);
	        Collections.reverse(reversedList);
		
	        reversedList.stream().forEach(System.out::println);
		
	}
}*/

public class ReverseParallelStream{
	public static void main(String[] args) {
		List<Integer>numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> result = new ArrayList<Integer>(numbers);
		Collections.reverse(result);
		result.stream().forEach(System.out::println);
	}
}
