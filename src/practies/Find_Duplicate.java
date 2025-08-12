package practies;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

// How to find duplicate elements in a Stream in Java?
/*
public class Find_Duplicate {
	
	public static void main(String[] args) {
		Stream<Integer>stream = Stream.of(2, 17, 5, 20, 17, 30, 4, 23, 59, 23);
		System.out.println(duplicate(stream));
	}
	
	public static <T> Set<T> duplicate(Stream<T>stream) {
		Set<T> items = new HashSet<T>();
		return stream.filter(n -> !items.add(n)).collect(Collectors.toSet());
	}

}

public class Find_Duplicate {
	public static void main(String[] args) {
		List<Integer> names = Arrays.asList(2, 17, 5, 20, 17, 30, 4, 23, 59, 23);
	
		Set<Integer> num = new HashSet<Integer>();
		
		List<Integer> duplicate = names.stream().filter(name -> !num.add(name))
				.collect(Collectors.toList());
		
		System.out.println(duplicate);
		
	}
}*/

public class Find_Duplicate {
	public static void main(String[] args) {
		List<Integer> names = Arrays.asList(2, 17, 5, 20, 17, 30, 4, 23, 59, 23);
	
		Set<Integer>dupNum = new HashSet<Integer>();
		
		List<Integer> num = names.stream().filter(x -> !dupNum.add(x))
				.collect(Collectors.toList());
		
		System.out.println(num);
	}
}


/*
public class Find_Duplicate {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(2, 17, 5, 20, 17, 30, 4, 23, 59, 23);

	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	for(int num : arr) {
		if(map.containsKey(num)) {
			map.put(num, map.get(num) + 1);
		}else {
			map.put(num, 1);
		}
	}
	
	for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
		if(entry.getValue() > 1) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
	
	}
}*/


