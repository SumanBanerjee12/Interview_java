package practies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
/*
public class Remove_Duplicate {
	public static void main(String[] args) {
		
		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 1, 3, 5, 6, 5);
		List<Integer> remove = arr.stream().distinct()
				.collect(Collectors.toList());
		
		System.out.println(remove);
	}
} */


public class Remove_Duplicate {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 1, 3, 5, 6, 5);
		
		List<Integer> uniqueNum = new ArrayList<>();
		
		for(int num : arr) {
			if(!uniqueNum.contains(num)) {
				uniqueNum.add(num);
			}
		}
		System.out.println(uniqueNum);
	}
}


