package practies;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
/*
public class FindDuplicate_in_String {

	public static void main(String[] args) {
		
		List<String> arr = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
		
		Set<String> name = new HashSet<String>();
		
		List<String> findDuplicate = arr.stream().filter(duplicate -> !name.add(duplicate))
				.collect(Collectors.toList());
		
		System.out.println(findDuplicate);
		
	}
}*/



public class FindDuplicate_in_String{
	public static void main(String[] args) {
		List<String> str = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
		
		Set<String> val = new HashSet<String>();
		
		List<String>findDup = str.stream().filter(res -> !val.add(res))
				.collect(Collectors.toList());
		
		System.out.println(findDup);
	}
}
