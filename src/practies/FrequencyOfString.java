package practies;

import java.util.HashMap;
import java.util.Map;
/*
public class FrequencyOfString {

	public static void main(String[] args) {
		String str = "mynameissuman";
		
		Map<Character, Integer> findFrequency = new HashMap<Character, Integer>();
		
		for(char ch : str.toCharArray()) {
			if(findFrequency.containsKey(ch)) {
				findFrequency.put(ch, findFrequency.get(ch) + 1);
			}else {
				findFrequency.put(ch, 1);
				
			}
		}
		for(Map.Entry<Character, Integer> entry : findFrequency.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}*/


public class FrequencyOfString{
	public static void main(String[] args) {
		String str = "mynameissuman";
		
		Map<Character, Integer> findFreq = new HashMap<Character, Integer>();
		
		for(char ch : str.toCharArray()) {
			if(findFreq.containsKey(ch)) {
				findFreq.put(ch, findFreq.get(ch) + 1);
			}else {
				findFreq.put(ch, 1);
			}
		}
		for(Map.Entry<Character, Integer>entry : findFreq.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}
