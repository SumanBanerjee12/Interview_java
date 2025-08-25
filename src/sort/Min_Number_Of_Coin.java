
//Find Minimum Number Of Coins

package sort;

import java.util.ArrayList;
import java.util.List;

public class Min_Number_Of_Coin {
	public static void main(String[] args) {
		int n = 50;
		System.out.println(MinimumCoins(n));
	}
	
	public static List<Integer> MinimumCoins(int n){
		int[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
		
		List<Integer> result = new ArrayList<>();
		for(int i = coins.length - 1; i>= 0; i--) {
			// pick the coin from end
			int coin = coins[i];
	 // Keep using the current coin while it's less than or equal to remaining 'n'
			while(n >= coin) {
				n = n-coin;  // subtract coin value from n;
				result.add(coin);
			}
		}
		return result;
	}
}
