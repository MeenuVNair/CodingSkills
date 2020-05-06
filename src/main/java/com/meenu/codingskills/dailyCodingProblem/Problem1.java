package com.meenu.codingskills.dailyCodingProblem;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?
 */

/**
* @author Meenu V Nair
*
 * Creation time: May 6, 2020 11:52:57 AM
*
*/

public class Problem1 {

	private boolean sum(int[] array, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(Integer i : array) {
			if(map.containsKey(k - i)) {
				return true;
			}
			else {
				map.put(i, k - i);
			}
		}
		
		return false;
	}
	
	public void findSolution() {
		int array[] = new int[] {10,15,3,7};
		int k = 17;
		System.out.println("Does any two numbers in the given list add upto 'k' ? : " + sum(array, k));
	}
}
