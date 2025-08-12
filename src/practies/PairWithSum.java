package practies;

import java.util.HashSet;
import java.util.Set;
/*
public class PairWithSum {

	public static void main(String[] args) {
		int[] arr = {2, 4, 3, 5, 7, 8, 1};
		
		int target = 9;
		
		// set to store unique pairs( like "2,7")
		Set<String> Seenpairs = new HashSet<String>();
		
		// set  to keep track of numbers so far
		
		Set<Integer> track = new HashSet<Integer>();
		
		for(int num : arr) {
			// calculate the complement that would make sum = target
			int complement = target - num;
			
			// if the complement already seen
			if(track.contains(complement)) {
				// get the smaller and maximum number for consistent pair
				int small = Math.min(num, complement);
				int large = Math.max(num, complement);
				
				// creating String represent the pair
				String pair = small + ", " + large;
				
				//if the pair has not been printed before
				if(!Seenpairs.contains(pair)) {
					System.out.println(small + " , " + large);
					
					// add to the seen pair so that we don't print again
					Seenpairs.add(pair);
				}
			}
			// add the current number to the track
			track.add(num);
		}
	}
}*/

public class PairWithSum {

	public static void main(String[] args) {
		int[] arr = {2, 4, 3, 5, 7, 8, 1};
		int target = 8;
		
		Set<String> SeenPair = new HashSet<String>();
		Set<Integer> SeenNum = new HashSet<Integer>();
		
		for(int num : arr) {
			int complement = target - num;
			// if Complement is already seen
			if(SeenNum.contains(complement)) {
				int min = Math.min(num, complement);
				int max = Math.max(num, complement);
				String pair = min + " , "+ max;
				if(!SeenPair.contains(pair)) {
					System.out.println(min + " ," + max);
					SeenPair.add(pair);
				}
			}
			SeenNum.add(num);
		}
		
	}
}

