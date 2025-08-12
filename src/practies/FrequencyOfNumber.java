package practies;

import java.util.HashMap;
import java.util.Map;

// Get The Frequency of number
/*
public class FrequencyOfNumber {

	public static void main(String[] args) {
		int[] num = {1, 1, 2, 2, 3, 4, 5, 6, 4, 9, 3, 7, 6};
		findFrequency(num);
	}
	
	public static void findFrequency(int[] num) {
		Map<Integer, Integer> numFrequency = new HashMap<Integer, Integer>();
		
		for(int number : num) {
			if(numFrequency.containsKey(number)) {
				numFrequency.put(number, numFrequency.get(number) + 1);
			}else {
				numFrequency.put(number, 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry :numFrequency.entrySet() ) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}*/


public class FrequencyOfNumber{
	public static void main(String[] args) {
		int [] num = {1, 1, 2, 2, 3, 4, 5, 6, 4, 9, 3, 7, 6, 9};
		findFrequency(num);
	}
	
	public static void findFrequency(int[] arr) {
		
		Map<Integer, Integer> numFrequency = new HashMap<Integer, Integer>();
		
		for(int number: arr) {
			if(numFrequency.containsKey(number)) {
				numFrequency.put(number, numFrequency.get(number) + 1);
			}else {
				numFrequency.put(number, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : numFrequency.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}

