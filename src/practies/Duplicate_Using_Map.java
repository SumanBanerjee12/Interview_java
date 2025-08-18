package practies;

import java.util.HashMap;
import java.util.Map;

//Write a java program to find all duplicate element from given string

public class Duplicate_Using_Map {
	public static void main(String[] args) {
		String str = "mynameissuman";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		System.out.println("Duplicates using Map:");
		
		for(Map.Entry<Character, Integer>entry : map.entrySet()) {
		
		if(entry.getValue() > 1) {
			System.out.println(entry.getKey() + " " +entry.getValue());
		}
		}
	}
}

