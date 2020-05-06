package com.meenu.codingskills.dailyCodingProblem;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.

For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.
 */

/**
* @author Meenu V. Nair
*
 * Creation time: May 6, 2020 3:40:11 PM
*
*/

public class Problem9 {
	
	private int findLargestSum(int[] nums) {
		int a = nums[0];
		int b = 0;
		int c;
		
		for(int i = 1; i < nums.length; i++) {
			c = a > b ? a : b;
			
			a = b + nums[i];
			b = c;
		}
		
		return a > b ? a : b;
	}
	
	
	public void findSolution() {
		int nums[] = new int[] {2, 4, 6, 2, 5};
		//int nums[] = new int[] {5, 1, 1, 5};
		
		System.out.println("Largets sum of non-adjacent numbers : " + findLargestSum(nums));
	}
}
