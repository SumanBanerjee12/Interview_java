package practies;

import java.util.HashMap;
import java.util.Map;

//Get The Frequency of Character
/*
public class FrequencyOfCharacter {
	public static void main(String[] args) {
		char[] ch = {'a', 'b', 'c', 'a', 'r', 'e', 'b', 'd', 'c', 'e', 'e'};
		frequencyCharacter(ch);
	}
	
	public static void frequencyCharacter(char[] arr) {
		Map<Character, Integer> findFreq = new HashMap<Character, Integer>();
		
		for(char c : arr) {
			if(findFreq.containsKey(c)) {
				findFreq.put(c, findFreq.get(c) + 1);
			}else {
				findFreq.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer>entry : findFreq.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}*/

public class FrequencyOfCharacter{
	public static void main(String[] args) {
		char[] ch = {'a', 'b', 'c', 'a', 'r', 'e', 'b', 'd', 'c', 'e', 'e'};
	
	Map<Character, Integer> findFreq = new HashMap<Character, Integer>();
	
	for(char c : ch) {
		if(findFreq.containsKey(c)) {
			findFreq.put(c, findFreq.get(c) + 1);
		}else {
			findFreq.put(c, 1);
		}
	}
	for(Map.Entry<Character, Integer> entry : findFreq.entrySet()) {
		System.out.println(entry.getKey() + " = " + entry.getValue());
	}
	}
}

























